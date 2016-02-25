package buddychallenge.gui;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.exceptions.UserException;
import buddychallenge.gui.presenters.SignUpPresenter;
import buddychallenge.gui.stubs.SignUpStub;
import buddychallenge.services.SignUpService;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class SignUpTest {

	private SignUpPresenter presenter;
	private SignUpStub stub;
	private SignUpService service;

	@Before
	public void setUp() throws Exception {
		stub = new SignUpStub();
		service = new SignUpService();
		presenter = new SignUpPresenter(stub);
		presenter.setService(service);
	}

	@Test
	public void wiring() {
		presenter.start();
		assertTrue(stub.isOpened());
	}
	/**
	 * Sets the values for signup
	 * @throws UserException
	 */
	@Test
	public void updateValues() throws UserException{
		String USERNAME = "testUsername";
		String PASSWORD = "testPassword1";
		String EMAIL = "test@email.com";
		String FNAME = "TEST";
		String LNAME = "NAME";
		int genderPos = 0;
		String BIRTH = "1-1-1980";
		stub.setUsernameString(USERNAME);
		stub.setPasswordString(PASSWORD);
		stub.setEmailString(EMAIL);
		stub.setFirstname(FNAME);
		stub.setLastname(LNAME);
		stub.setGenderPos(genderPos);
		stub.setBirthDateString(BIRTH);
		
		presenter.start();
		presenter.action();
		Object[] expecteds = { USERNAME, PASSWORD, EMAIL, FNAME, LNAME, genderPos, BIRTH};
		Object[] actuals = { presenter.getUsernameString(),presenter.getPasswordString(), presenter.getEmailString()
				,presenter.getFirstName(),presenter.getLastName(), presenter.getGenderPos(), presenter.getBirthDateString()};
		assertArrayEquals(expecteds, actuals);
	}
	/**
	 * Checks if the signup was successful
	 * @throws UserException
	 */
	@Test
	public void signUpSuccess() throws UserException{
		String USERNAME = "testName";
		String PASSWORD = "testPassword1";
		String EMAIL = "test@email.com";
		String FNAME = "TEST";
		String LNAME = "NAME";
		int genderPos = 0;
		String BIRTH = "1-1-1980";
		stub.setUsernameString(USERNAME);
		stub.setPasswordString(PASSWORD);
		stub.setEmailString(EMAIL);
		stub.setFirstname(FNAME);
		stub.setLastname(LNAME);
		stub.setGenderPos(genderPos);
		stub.setBirthDateString(BIRTH);
		
		presenter.start();
		
		service.setUsername(new Username(stub.getUsernameString()));
		service.setPassword(new Password(stub.getPasswordString()));
		service.setEmail(new EmailAddress(stub.getEmailString()));
		service.setFirstname(new String(stub.getFirstName()));
		service.setLastname(new String(stub.getLastName()));
		service.setGender(Gender.Gender1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		Date date = null;
		try {
			date = sdf.parse(stub.getBirthDateString());
		} catch (ParseException pe) {
			System.out.println("parse exception");
		}
		service.setBirthdate(date);
		boolean error = presenter.action();
		assertFalse(error);
		
		
	}
	
	@Test
	public void closing() {
		presenter.start();
		presenter.cancel();

		assertFalse(stub.isOpened());
	}
	/**
	 * Checks if the user exists
	 * @throws UserException
	 */
	@Test(expected=UserException.class)
	public void signUpUserExists() throws UserException  {
		stub.setUsernameString("mara");
		stub.setPasswordString("aaa111");
		stub.setEmailString("aa@aa.com");
		stub.setFirstname("test");
		stub.setLastname("test");
		stub.setGenderPos(0);
		stub.setBirthDateString("01-01-2001");
		
		presenter.start();
		
		presenter.action(); 

	}
	
}
