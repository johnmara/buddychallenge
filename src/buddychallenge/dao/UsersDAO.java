/*
 * 
 */
package buddychallenge.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import buddychallenge.entities.User;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class UsersDAO.
 */
public class UsersDAO {
	
	/** The user list. */
	static List<User> userList;

	//PostsDAO posts;
	
	/*public void setPosts(PostsDAO posts){
		this.posts = posts;
	}*/

	/**
	 * Instantiates a new users dao.
	 */
	public UsersDAO(){
		
		setUserList(new ArrayList<User>());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		Date date = null;
		try {
			date = sdf.parse("24-11-1994");
		} catch (ParseException pe) {
	
		}
		User mara = new User(new Username("mara"), new Password("a199412"), new EmailAddress("mara@hotmail.com"), 
				"John", "Mara", Gender.Gender1, date);
		userList.add(new User(new Username("bill"), new Password("a199412"), new EmailAddress("b.drosat@hotmail.com"), 
				"Bill", "Drosats", Gender.Gender1, date));
		userList.add(new User(new Username("teoo"), new Password("a199412"), new EmailAddress("b.drosat@hotmail.com"), 
				"Teo", "Mara", Gender.Gender2, date));
		userList.add(mara);

		/*try {
			Post p = new Post("geia sou",mara,new PublicPostingRuleImpl());
			mara.createPost(p);
			posts.addPost(p);
			
		} catch (PostException e) {
			e.printStackTrace();
		}*/

		
		
	}
	
	/**
	 * Instantiates a new users dao.
	 *
	 * @param userList the user list
	 */
	public UsersDAO(List<User> userList){
		setUserList(userList);
	}
	

	/**
	 * Adds the user.
	 *
	 * @param user the user
	 */
	public void addUser(User user) {
		userList.add((User)user);
	}
	
	/**
	 * Removes the user.
	 *
	 * @param user the user
	 */
	public void removeUser(User user) {
		userList.remove((User)user);
	}
	
	/**
	 * Gets the user by id.
	 *
	 * @param id the id
	 * @return the user by id
	 */
	public User getUserByID(int id){
		for (User u : userList){
			if (u.getUserID() == id){
				return u;
			}
		}
		return null;
	}
	
	/**
	 * Gets the user list by name.
	 *
	 * @param name the name
	 * @return the user list by name
	 */
	public List<User> getUserListByName(String name){
		List<User> userListReturn = new ArrayList<User>();
		if(name.contains(" ")){
			StringTokenizer token = new StringTokenizer(name, " ");
			while(token.hasMoreTokens()){
				String tokenString = token.nextToken();
				for(User u : UsersDAO.userList){
					if(like(u.getFirstname(), tokenString) || like(u.getLastname(), tokenString))
						userListReturn.add(u);
				}
			}
		}else{
			for(User u : UsersDAO.userList){
				if(like(u.getFirstname(), name) || like(u.getLastname(), name))
					userListReturn.add(u);
			}
		}
		
		return userListReturn;
	}
	
	/**
	 * Like.
	 *
	 * @param str the str
	 * @param expr the expr
	 * @return true, if successful
	 */
	private static boolean like(String str, String expr) {
	    expr = expr.toLowerCase(); 
	    expr = expr.replace(".", "\\."); //
	    expr = expr.replace("?", ".");
	    expr = expr.replace("%", ".*");
	    str = str.toLowerCase();
	    return str.matches(expr);
	}
	
	/**
	 * Gets the user by username.
	 *
	 * @param username the username
	 * @return the user by username
	 */
	public User getUserByUsername(String username){
		for (User u : userList){
			if (u.getUsername().getUsername().equals(username)){
				return u;
			}
		}
		return null;
	}
	
	/**
	 * Sets the user list.
	 *
	 * @param userList the new user list
	 */
	public void setUserList(List<User> userList){
		UsersDAO.userList = new ArrayList<User>(userList);
	}
	
	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	public List<User> getUserList() {
		return new ArrayList<User>(userList);
	}

}
