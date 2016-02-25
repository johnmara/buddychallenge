/*
 * 
 */
package buddychallenge.services;

import java.util.Date;


import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;
import buddychallenge.exceptions.UserException;

// TODO: Auto-generated Javadoc
/**
 * The Class SignUp.
 */
public class SignUpService {

	/** The id. */
	private static int id;
	
	/** The sign up id. */
	private int signUpID;
	
	/** The username. */
	private Username username;
	
	/** The password. */
	private Password password;
	
	/** The email. */
	private EmailAddress email;
	
	/** The gender. */
	private Gender gender;
	
	/** The lastname. */
	private String firstname, lastname;
	
	/** The birthdate. */
	private Date birthdate;
	
	/** The users. */
	private UsersDAO users;

	/**
	 * Instantiates a new sign up.
	 *
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param gender the gender
	 * @param firstname the firstname
	 * @param lastname the lastname
	 * @param birthdate the birthdate
	 * @param users the users
	 */
	public SignUpService(Username username, Password password, EmailAddress email,
			Gender gender, String firstname, String lastname, Date birthdate,
			UsersDAO users) {
		signUpID = id++;
		setUsername(username);
		setPassword(password);
		setEmail(email);
		setGender(gender);
		setFirstname(firstname);
		setLastname(lastname);
		setBirthdate(birthdate);
		setUsers(users);
	}

	/**
	 * Instantiates a new sign up.
	 */
	public SignUpService() {
		this(null, null, null, null, null, null, null, null);
	}

	/**
	 * Sign up user.
	 *
	 * @throws UserException , if User exists.
	 */
	public void signUpUser() throws UserException {
		if (userExists()){
			throw new UserException("User Already Exists.");}
		else {
			users.addUser(new User(username,password,email,
					firstname,lastname,gender,birthdate));
		}

	}

	/**
	 * User exists.
	 *
	 * @return true, if the user exists on UsersDAO
	 */
	boolean userExists() {
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public EmailAddress getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(EmailAddress email) {
		this.email = email;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the firstname.
	 *
	 * @param firstname the new firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the lastname.
	 *
	 * @param lastname the new lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	 * Gets the users.
	 *
	 * @return the users
	 */
	public UsersDAO getUsers() {
		return users;
	}

	/**
	 * Gets the birthdate.
	 *
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * Sets the birthdate.
	 *
	 * @param birthdate the new birthdate
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * Gets the sign up id.
	 *
	 * @return the sign up id
	 */
	public int getSignUpID() {
		return signUpID;
	}

}
