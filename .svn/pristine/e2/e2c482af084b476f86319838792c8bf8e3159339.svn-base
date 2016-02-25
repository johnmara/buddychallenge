/*
 * Desrcibes A User Entity.
 */
package buddychallenge.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import buddychallenge.exceptions.BuddyException;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User {
	
	/** The id. */
	private static int id;
	
	/** The user id. */
	private int userID;
	
	/** The username. */
	private Username username;
	
	/** The password. */
	private Password password;
	
	/** The mail. */
	private EmailAddress mail;
	
	/** The firstname. */
	private String firstname;
	
	/** The lastname. */
	private String lastname;
	
	/** The gender. */
	private Gender gender;
	
	/** The birthdate. */
	private Date birthdate;
	
	/** The has answered. */
	private boolean hasAnswered; //user has aswered the questions
	
	/** The questions. */
	private Map<Question, String> questions;

	/** The buddies. */
	private List<User> buddies;
	
	/** The posts. */
	private List<Post> posts;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		this(null, null, null, "Uknown", "Uknown", null, null);
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param username the Username that user's choose
	 * @param password the password that user's choose
	 * @param mail the mail that user's choose
	 * @param firstname the firstname that user's choose
	 * @param lastname the lastname that user's choose
	 * @param gender the gender that user's choose
	 * @param birthdate the birthdate that user's choose
	 */
	public User(Username username, Password password, EmailAddress mail,
			String firstname, String lastname, Gender gender, Date birthdate) {
		userID = id++;
		setUsername(username);
		setPassword(password);
		setMail(mail);
		setFirstname(firstname);
		setLastname(lastname);
		setGender(gender);
		setBirthdate(birthdate);
		setQuestions(new HashMap<Question, String>());
		setBuddies(new ArrayList<User>());
		setPosts(new ArrayList<Post>());
	}

	// methods of User

	

	/**
	 * Checks for buddy.
	 *
	 * @param buddy, User instance that will be check if is buddy with the user.
	 * @return true, if the 2 users are buddies
	 */
	public boolean hasBuddy(User buddy) {
		for (User user : buddies) {
			if (buddy.equals(user)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Creates the post.
	 *
	 * @param post, Post instance that will be created
	 */
	public void createPost(Post post) {
		posts.add(post);
	}

	/**
	 * Delete post.
	 *
	 * @param post, Post instance that will be deleted
	 */
	public void deletePost(Post post) {
		posts.remove(post);
	}

	/**
	 * Adds the buddy.
	 *
	 * @param user, User Instance that would be buddy with the user.
	 * @throws BuddyException, if they are already buddies or trying to be buddy with himself
	 */
	public void addBuddy(User user) throws BuddyException {
		if (this.equals(user))
			throw new BuddyException("You can not be buddy with yourself");
		else if(this.hasBuddy(user))
			throw new BuddyException("You are already buddies");
		else
			buddies.add(user);
	}

	/**
	 * Removes the buddy.
	 *
	 * @param user the User instance that will be removed from buddies list.
	 */
	public void removeBuddy(User user) {
		buddies.remove(user);
	}

	// getters and setters
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserID() {
		return userID;
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
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public EmailAddress getMail() {
		return mail;
	}

	/**
	 * Sets the mail.
	 *
	 * @param mail the new mail
	 */
	public void setMail(EmailAddress mail) {
		this.mail = mail;
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
	 * Gets the genre.
	 *
	 * @return the genre
	 */
	public Gender getGenre() {
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
	 * Gets the buddies.
	 *
	 * @return the buddies
	 */
	public List<User> getBuddies() {
		return new ArrayList<User>(buddies);
	}

	/**
	 * Sets the buddies.
	 *
	 * @param buddies the new buddies
	 */
	public void setBuddies(List<User> buddies) {
		this.buddies = buddies;
	}

	/**
	 * Gets the posts.
	 *
	 * @return the posts
	 */
	public List<Post> getPosts() {
		return new ArrayList<Post>(posts);
	}

	/**
	 * Sets the posts.
	 *
	 * @param posts the new posts
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof User) {
			return this.getUserID() == ((User) o).getUserID();
		}
		return false;
	}

	/**
	 * Gets the questions.
	 *
	 * @return the questions
	 */
	public Map<Question, String> getQuestions() {
		return new HashMap<Question, String>(questions);
	}

	/**
	 * Sets the questions.
	 *
	 * @param questions the questions
	 */
	public void setQuestions(Map<Question, String> questions) {
		this.questions = questions;
	}

	/**
	 * Adds the question.
	 *
	 * @param q the q
	 * @param answer the answer
	 */
	public void addQuestion(Question q, String answer) {
		questions.put(q, answer);
	}

	/**
	 * Prints the buddies.
	 */
	public void printBuddies() {
		for (User buddy : buddies) {
			System.out.println(buddy.getUsername());
		}
	}

	/**
	 * Prints the posts.
	 *
	 * @param user the user
	 */
	public void printPosts(User user) {
		String postText = "";
		for (Post p : posts) {
			if (p.getRule().hasAccess(p.getUser(), user)) {
				postText += "Post:\n" + p.getText();
				postText += "\nComments:\n" + p.getComments();
			}
			System.out.println(postText);
		}
	}

	/**
	 * Prints the posts.
	 */
	public void printPosts() {
		String postText = "";
		for (Post p : posts) {
			postText += "Post:\n" + p.getText();
			postText += "\nComments:\n" + p.getComments();
			System.out.println(postText);
		}
	}

	
	/**
	 * Checks for question.
	 *
	 * @param q the Question Instance
	 * @return true, if the questions are the same.
	 */
	public boolean hasQuestion(Question q){
		for (Map.Entry<Question, String> q2: getQuestions().entrySet()) { 
			if (q2.getKey().equals(q)) { 
				return true;
			}
		} 
		return false;
	}

	/**
	 * Gets the checks for answered.
	 *
	 * @return the checks for answered
	 */
	public boolean getHasAnswered() {
		return hasAnswered;
	}

	/**
	 * Sets the checks for answered.
	 *
	 * @param hasAnswered the new checks for answered
	 */
	public void setHasAnswered(boolean hasAnswered) {
		this.hasAnswered = hasAnswered;
	}
	 
}
