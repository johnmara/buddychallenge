package buddychallenge.gui;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;
import buddychallenge.gui.presenters.SearchPresenter;
import buddychallenge.gui.stubs.SearchStub;
import buddychallenge.services.SearchUserService;

public class SearchTest {
	
	private SearchPresenter presenter;
	private SearchStub stub;
	private SearchUserService service;

	@Before
	public void setUp() throws Exception {
		stub = new SearchStub();
		service = new SearchUserService();
		presenter = new SearchPresenter(stub);
		presenter.setService(service);
	}

	@Test
	public void wiring() {
		presenter.start();
		assertTrue(stub.isOpened());
	}
	/**
	 * Checking the profile name which will be used in search field
	 */
	@Test
	public void updateProfileName(){
		String PROFILE_NAME = "profile name";
		stub.setProfileNameString(PROFILE_NAME);
		presenter.start();
		
		String[] expecteds = {PROFILE_NAME};
		String[] actuals = {stub.getProfileNameString()};
		assertArrayEquals(expecteds, actuals);
	}
	
	/**
	 * Checks if an empty profile name has been given
	 */
	@Test
	public void emptyProfileName(){
		stub.setProfileNameString("");
		presenter.setProfileNameString(stub.getProfileNameString());
		int[] expecteds = { 1 };
		int[] actuals = { stub.getMessagesSent() };
		assertArrayEquals(expecteds, actuals);
	}
	
	/**
	 * Checks if the correct number of results has been returned
	 */
	@Test
	public void successFulSearch(){
		stub.setProfileNameString("mara");
		presenter.setProfileNameString(stub.getProfileNameString());
		service.setUsers(new UsersDAO());// John Mara, Teo Mara = 2
		service.setProfileNameString(stub.getProfileNameString());
		List<User> userList =  presenter.action();
		int[] expecteds = { 2 };
		int[] actuals = { userList.size() };
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void closing() {
		presenter.start();
		presenter.cancel();

		assertFalse(stub.isOpened());
	}

}
