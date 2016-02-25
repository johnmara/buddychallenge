package buddychallenge.gui;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.exceptions.UserException;
import buddychallenge.gui.presenters.SignInPresenter;
import buddychallenge.gui.stubs.SignInStub;
import buddychallenge.services.SignInService;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class SignInTest {

	private SignInPresenter presenter;
	private SignInStub stub;
	private SignInService service;

	@Before
	public void setUp() throws Exception {
		stub = new SignInStub();
		service = new SignInService();
		presenter = new SignInPresenter(stub);
		presenter.setService(service);
	}

	@Test
	public void wiring() {
		presenter.start();
		assertTrue(stub.isOpened());
	}
	/**
	 * Check if username and password have been successfully transfered
	 * @throws UserException
	 */
	@Test
	public void updateUsernameAndPassword() throws UserException {
		String USERNAME = "testusername";
		String PASSWORD = "a199412";
		stub.setUsernameString(USERNAME);
		stub.setPasswordString(PASSWORD);
		presenter.start();

		presenter.action();
		String[] expecteds = { USERNAME, PASSWORD };
		String[] actuals = { presenter.getUsernameString(),
				presenter.getPasswordString() };
		assertArrayEquals(expecteds, actuals);
	}
	/**
	 * Checks if wrong data have been inserted
	 */
	@Test
	public void signInUserWrongUserInputs() {
		stub.setUsernameString("t");
		stub.setPasswordString("wrong");
		presenter.start();
		service.setUsername(new Username(stub.getUsernameString()));
		service.setPassword(new Password(stub.getPasswordString()));
		presenter.setService(service);
		boolean error = presenter.action();
		int[] expecteds = { 1 };
		int[] actuals = { stub.getMessagesSent() };
		assertTrue(error);
		assertArrayEquals(expecteds, actuals);
	}
	/**
	 * Checks if the signin was successful
	 */
	@Test
	public void signInSuccessFul(){
		stub.setUsernameString("testUser");
		stub.setPasswordString("aaa1111");	
		presenter.start();
		service.setUsername(new Username(stub.getUsernameString()));
		service.setPassword(new Password(stub.getPasswordString()));
		service.setUsers(new UsersDAO());
		service.setAdmins(new AdminsDAO());
		presenter.setService(service);
		boolean error = presenter.action();
		assertFalse(error);
	}

	@Test
	public void closing() {
		presenter.start();
		presenter.cancel();

		assertFalse(stub.isOpened());
	}

}
