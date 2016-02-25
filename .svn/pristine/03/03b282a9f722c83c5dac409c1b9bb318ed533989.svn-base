/*
 * 
 */
package buddychallenge.services;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;

// TODO: Auto-generated Javadoc
/**
 * The Class HomePage.
 */
public class HomePageService {
	
	/** The current user. */
	private User currentUser;
	
	/** The posts. */
	private PostsDAO posts;
	
	/**
	 * Instantiates a new home page.
	 *
	 * @param currentUser the current user
	 * @param posts the posts
	 */
	public HomePageService(User currentUser, PostsDAO posts){
		this.setCurrentUser(currentUser);
		this.setPosts(posts);
	}
	
	/**
	 * Instantiates a new home page.
	 */
	public HomePageService(){
		this(new User(), new PostsDAO());
	}
	
	/**
	 * Gets the posts of buddies as string.
	 *
	 * @return the posts as string
	 */
	public List<String> getPostsAsString(){
		List<User> buddies = currentUser.getBuddies();
		List<String> postsAsString = new ArrayList<String>();
		for(User u : buddies){
			for(Post p : posts.getPostList()){
				if(p.getUser().equals(u))
					postsAsString.add(u.getFirstname() + " " + u.getLastname() + ":\n" + p.getText());
			}
		}
		
		return postsAsString;
		
	}

	/**
	 * Gets the current user.
	 *
	 * @return the current user
	 */
	public User getCurrentUser() {
		return currentUser;
	}

	/**
	 * Sets the current user.
	 *
	 * @param currentUser the new current user
	 */
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
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
