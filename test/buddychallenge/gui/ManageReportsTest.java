package buddychallenge.gui;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.Report;
import buddychallenge.entities.User;
import buddychallenge.exceptions.PostException;
import buddychallenge.gui.presenters.ManageReportsPresenter;
import buddychallenge.gui.stubs.ManageReportsStub;
import buddychallenge.rules.PublicPostingRuleImpl;
import buddychallenge.services.ManageReportsService;
import buddychallenge.util.Category;

public class ManageReportsTest {
	
	private static ManageReportsStub stub;
	private static ManageReportsPresenter presenter;
	private static ManageReportsService service;
	
	@BeforeClass
	public static void setUp() throws Exception {
		ReportsDAO reports = new ReportsDAO();
		PostsDAO posts = new PostsDAO();
		stub = new ManageReportsStub();
		service = new ManageReportsService(reports,posts);
		initializeData();
		presenter = new ManageReportsPresenter(stub, reports, posts);
		presenter.setService(service);
	}

	private static void initializeData() throws PostException {
		Report report = new Report("testReason",Category.category1, new Post("testPost", new User(), new PublicPostingRuleImpl()), new User());
		service.getReports().addReport(report);
	}
	
	@After
	public void afterTest() throws PostException{
		initializeData();
	}
	
	@Test
	public void testDeletePost(){
		stub.setReports(presenter.getReportsList());
		stub.setSelectedValue("ID: 1,Post: testReason");
		presenter.showReportDetails();
		Report r = service.getReports().getList().get(0);
		presenter.deletePost();
		assertTrue(r.getPost().getUser().getPosts().size() == 0);
	}
	
	/**
	 * Checks if the selected report has been deleted successfully
	 */
	@Test
	public void testDeleteReport(){
		stub.setReports(presenter.getReportsList());
		stub.setSelectedValue("ID: 0,Post: testReason");
		presenter.showReportDetails();
		assertTrue(presenter.getReportsList().size() == 2);
		presenter.deleteReport();
		assertTrue(presenter.getReportsList().size() == 1);
	}
	
	@Test
	public void wiring() {
		presenter.start();
		assertTrue(stub.isOpened());
	}
	
	@Test
	public void closing() {
		presenter.start();
		presenter.cancel();

		assertFalse(stub.isOpened());
	}
	
}
