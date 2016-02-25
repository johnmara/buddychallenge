package buddychallenge.services;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.Test;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.Admin;
import buddychallenge.entities.User;
import buddychallenge.exceptions.UserException;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class SignInTest {
	
	static SignInService signin;
	static Username username;
	static Password password;
	static UsersDAO users;
	static AdminsDAO admins;
	
	@BeforeClass
	public static void setUpBeforeClass() throws UserException, ParseException {
		//Add user
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		users = new UsersDAO();
		SignUpService signup = new SignUpService(new Username("test"), new Password("test123"), new EmailAddress("test@address.com"), 
				Gender.Gender1, "Test", "Test", sdf1.parse("24-11-1994"), users);
		signup.signUpUser();// SignUp one user
		
		//Add admin
		admins = new AdminsDAO();
		admins.addAdmin(new Admin(new Username("admin1"), new Password("aaa1111")));
		
	}
	
	@Test
	public void testSuccessFullSignInUser() throws UserException {
		username = new Username("test");
		password = new Password("test123");

		signin = new SignInService(username, password, users, admins);
		signin.signInUser();
		User currentUser = signin.getCurrentUser();
		if(currentUser != null)
			assertTrue(currentUser.equals(users.getUserByUsername("test")) && signin.getCurrentAdmin() == null);

	}
	
	@Test
	public void testSuccessFullSignInAdmin() throws UserException {
		username = new Username("admin1");
		password = new Password("aaa1111");
		
		signin = new SignInService(username, password, users, admins);
		signin.signInUser();
		Admin currenAdmin = signin.getCurrentAdmin();
		if(currenAdmin != null)
			assertTrue(currenAdmin.equals(admins.getAdminByUsername("admin1")) && signin.getCurrentUser() == null);

	}
	
	@Test(expected=UserException.class)
	public void testUserNotExists() throws UserException{
		username = new Username("test2");
		password = new Password("test123");
		signin = new SignInService(username, password, users, admins);
		signin.signInUser();
	}
	
	@Test(expected=UserException.class)
	public void testWrongPassword() throws UserException{
		username = new Username("test");
		password = new Password("worngpass1");
		signin = new SignInService(username, password, users, admins);
		signin.signInUser();
	}

}
