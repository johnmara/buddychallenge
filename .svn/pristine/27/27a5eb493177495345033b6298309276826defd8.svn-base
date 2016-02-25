package buddychallenge.services;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;
import buddychallenge.exceptions.UserException;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class SignUpTest {

	static SignUpService signup;
	static Username username;
	static Password password;
	static EmailAddress email;
	static Gender gender;
	static String firstname, lastname;
	static Date birthdate;
	static SimpleDateFormat sdf1;
	
	static UsersDAO users;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		username = new Username("test");
		password = new Password("test123");
		email = new EmailAddress("test@address.com");
		gender = Gender.Gender1;
		firstname = "Test";
		lastname = "Test";
		sdf1 = new SimpleDateFormat("dd-M-yyyy");
		birthdate = sdf1.parse("24-11-1994");
		
		users = new UsersDAO();
		
	}

	@Test
	public void testSuccessFullSignUp() throws UserException {
		signup = new SignUpService(username, password, email, gender, firstname, lastname, birthdate, users);
		signup.signUpUser();

		User u = new User(username, password, email, firstname, lastname,gender, birthdate);
		users = signup.getUsers();
		User userFromDAO = users.getUserByUsername(username.getUsername());
		assertTrue(userFromDAO.getUsername().getUsername().equals(u.getUsername().getUsername()));
	}
	
	@Test(expected=UserException.class)
	public void testUserExists() throws UserException{
		users.addUser(new User(username, password, email, firstname, lastname,gender, birthdate));
		signup = new SignUpService(username, password, email, gender, firstname, lastname, birthdate, users);
		signup.signUpUser();
	}

}
