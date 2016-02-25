package buddychallenge.gui;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;
import buddychallenge.gui.presenters.AddPostPresenter;
import buddychallenge.gui.stubs.AddPostStub;
import buddychallenge.rules.BuddiesPostingRuleImpl;
import buddychallenge.rules.PostingRules;
import buddychallenge.services.AddPostService;

public class AddPostTest {
	
	AddPostStub stub;
	AddPostService service;
	AddPostPresenter presenter;
	

	@Before
	public void setUp() throws Exception {
		stub = new AddPostStub();
		service = new AddPostService();
		presenter = new AddPostPresenter(stub);
		presenter.setService(service);
	}
	
	/**
	 * Checking if the window is opened
	 */
	@Test
	public void wiring() {
		presenter.start();
		assertTrue(stub.isOpened());
	}
	
	/**
	 * Checking whether the post has been successfully posted or not
	 */
	@Test
	public void updateTextAndRule(){
		String TEXT = "Test text";
		PostingRules rule = new BuddiesPostingRuleImpl();
		
		stub.setText(TEXT);
		stub.setRule(rule);
		
		presenter.setText(stub.getText());
		presenter.setRule(stub.getRule());
		presenter.setPosts(new PostsDAO());
		
		User tempUser = new UsersDAO().getUserByID(1);
		presenter.setCreator(tempUser);
		
		presenter.addPost();
		Object[] expecteds = { TEXT, rule, tempUser  };
		Object[] actuals = { presenter.getText(),
				presenter.getRule(), presenter.getCreator() };
		assertArrayEquals(expecteds, actuals);
	}
	
	/**
	 * Checking if the window has closed
	 */
	@Test
	public void closing() {
		presenter.start();
		presenter.cancel();

		assertFalse(stub.isOpened());
	}

}
