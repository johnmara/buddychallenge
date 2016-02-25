/*
 * 
 */
package buddychallenge.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.util.Gender;

// TODO: Auto-generated Javadoc
/**
 * The Class ShowProfile.
 */
public class ShowProfileService {

	/** The id. */
	private static int id;
	
	/** The show profile id. */
	private int showProfileID;

	/** The user profile. */
	private User currentuser, userProfile;
	
	/** The posts. */
	private PostsDAO posts;

	/**
	 * Instantiates a new show profile.
	 *
	 * @param currentuser the currentuser
	 * @param userProfile the user profile
	 * @param posts the posts
	 */
	public ShowProfileService(User currentuser, User userProfile, PostsDAO posts) {
		showProfileID = id++;
		setCurrentuser(currentuser);
		setUserProfile(userProfile);
		setPosts(posts);
	}

	/**
	 * Gets the profile name.
	 *
	 * @return the profile name
	 */
	public String getProfileName() {
		return userProfile.getFirstname() + " " + userProfile.getLastname();
	}

	/**
	 * Gets the profile gender.
	 *
	 * @return the profile gender
	 */
	public Gender getProfileGender() {
		return userProfile.getGenre();

	}

	/**
	 * Gets the profile date.
	 *
	 * @return the profile date
	 */
	public Date getProfileDate() {
		if (currentuser.hasBuddy(userProfile))
			return userProfile.getBirthdate();
		return null;
	}

	/**
	 * Gets the post list that satisfies the rules besides the 2 users.
	 *
	 * @return the post list
	 */
	public List<Post> getPostList() {
		List<Post> returnPosts = new ArrayList<Post>();
		for (Post p : posts.getPostList()) {
			if(p.getUser().equals(userProfile) && p.getRule().hasAccess(userProfile, currentuser)){
				returnPosts.add(p);
			}
		}

		return returnPosts;
	}
	
	/**
	 * Gets the my posts.
	 *
	 * @return the my posts
	 */
	public List<Post> getMyPosts(){
		return userProfile.getPosts();
	}

	/**
	 * Gets the show profile id.
	 *
	 * @return the show profile id
	 */
	public int getShowProfileID() {
		return showProfileID;
	}

	/**
	 * Gets the currentuser.
	 *
	 * @return the currentuser
	 */
	public User getCurrentuser() {
		return currentuser;
	}

	/**
	 * Sets the currentuser.
	 *
	 * @param currentuser the new currentuser
	 */
	public void setCurrentuser(User currentuser) {
		this.currentuser = currentuser;
	}

	/**
	 * Gets the user profile.
	 *
	 * @return the user profile
	 */
	public User getUserProfile() {
		return userProfile;
	}

	/**
	 * Sets the user profile.
	 *
	 * @param userProfile the new user profile
	 */
	public void setUserProfile(User userProfile) {
		this.userProfile = userProfile;
	}

	/**
	 * Gets the posts.
	 *
	 * @return the posts
	 */
	public PostsDAO getPosts() {
		return posts;
	}

	/**
	 * Sets the posts.
	 *
	 * @param posts the new posts
	 */
	public void setPosts(PostsDAO posts) {
		this.posts = posts;
	}

}
