/*
 * 
 */
package buddychallenge.services;

import java.util.List;

import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchUser.
 */
public class SearchUserService {
	
	/** The users. */
	private UsersDAO users;
	
	/** The profile name string. */
	private String profileNameString;
	
	/**
	 * Instantiates a new search user.
	 *
	 * @param users the users
	 * @param profileNameString the profile name string
	 */
	public SearchUserService(UsersDAO users, String profileNameString){
		this.users= users;
		this.profileNameString = profileNameString;
	}
	
	/**
	 * Instantiates a new search user.
	 */
	public SearchUserService(){
		this(null, null);
	}
	
	/**
	 * Search user.
	 *
	 * @return the list of users with the profileNameString.
	 */
	public List<User> searchUser(){
		return users.getUserListByName(profileNameString);
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
	 * Sets the users.
	 *
	 * @param users the new users
	 */
	public void setUsers(UsersDAO users) {
		this.users = users;
	}

	/**
	 * Gets the user name string.
	 *
	 * @return the user name string
	 */
	public String getUserNameString() {
		return profileNameString;
	}

	/**
	 * Sets the profile name string.
	 *
	 * @param profileNameString the new profile name string
	 */
	public void setProfileNameString(String profileNameString) {
		this.profileNameString = profileNameString;
	}
	
	

}
