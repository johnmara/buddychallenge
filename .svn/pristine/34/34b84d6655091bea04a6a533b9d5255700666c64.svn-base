/*
 * 
 */
package buddychallenge.services;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.Admin;
import buddychallenge.entities.User;
import buddychallenge.exceptions.UserException;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class SignIn.
 */
public class SignInService {
	
	/** The id. */
	private static int id;
	
	/** The sign in id. */
	private int signInID;
	
	/** The username. */
	private Username username;
	
	/** The password. */
	private Password password;
	
	/** The users. */
	private UsersDAO users;
	
	/** The admins. */
	private AdminsDAO admins;
	
	/** The current user. */
	private User currentUser;
	
	/** The current admin. */
	private Admin currentAdmin;
	
	/**
	 * Instantiates a new sign in.
	 *
	 * @param username the username
	 * @param password the password
	 * @param users the users
	 * @param admins the admins
	 */
	public SignInService(Username username, Password password, UsersDAO users, AdminsDAO admins) {
		signInID = id++;
		setUsername(username);
		setPassword(password);
		setUsers(users);
		setAdmins(admins);
	}

	/**
	 * Instantiates a new sign in.
	 */
	public SignInService(){
		this(null,null,null,null);
	}
	
	/**
	 * Sign in user.
	 *
	 * @throws UserException , if the user/admin doesnt exists 
	 */
	public void signInUser() throws UserException{
		if (userExists()){
			User u = users.getUserByUsername(username.getUsername());
			if(u.getPassword().equals(password))
				currentUser = u;// CurrentUser
			else
				throw new UserException("Wrong Username or Password.");
			
		}
		else{
			if(adminExists()){
				Admin a = admins.getAdminByUsername(username.getUsername());
				
				if(a.getPassword().equals(password))
					currentAdmin = a;// CurrentAdmin
			}else
				throw new UserException("Wrong Username or Password.");
			
		}
			
	}
	
	/**
	 * Admin exists.
	 *
	 * @return true, if the admin exists in AdminsDAO
	 */
	private boolean adminExists() {
		for (Admin a : admins.getAdminList()) {
			if (a.getUsername().getUsername().equals(username.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * User exists.
	 *
	 * @return true, if the user exists in AdminsDAO
	 */
	private boolean userExists() {
		for (User u : users.getUserList()) {
			if (u.getUsername().getUsername().equals(username.getUsername())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public Username getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(Username username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(Password password) {
		this.password = password;
	}
	
	/**
	 * Sets the users.
	 *
	 * @param users the new users
	 */
	public void setUsers(UsersDAO users) {
		this.users = users;
	}

	/**
	 * Sets the admins.
	 *
	 * @param admins the new admins
	 */
	public void setAdmins(AdminsDAO admins) {
		this.admins = admins;
	}
	
	/**
	 * Gets the current user.
	 *
	 * @return the current user
	 */
	public User getCurrentUser(){
		return currentUser;
	}
	
	/**
	 * Gets the current admin.
	 *
	 * @return the current admin
	 */
	public Admin getCurrentAdmin(){
		return currentAdmin;
	}
	
	/**
	 * Gets the sign in id.
	 *
	 * @return the sign in id
	 */
	public int getSignInID() {
		return signInID;
	}
	
	
	
	
}
