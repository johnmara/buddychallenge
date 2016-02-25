/*
 * 
 */
package buddychallenge.gui.presenters;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.gui.AddPostJFrame;
import buddychallenge.gui.views.interfaces.ProfileView;
import buddychallenge.services.ShowProfileService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProfilePresenter.
 */
public class ProfilePresenter {
	
	/** The view. */
	private ProfileView view;
	
	/** The posts. */
	private PostsDAO posts;
	
	/** The current user. */
	private User currentUser;
	
	/** The service. */
	private ShowProfileService service;
	
	/**
	 * Instantiates a new profile presenter.
	 *
	 * @param view the view
	 * @param posts the posts
	 * @param currentUser the current user
	 */
	public ProfilePresenter(ProfileView view,PostsDAO posts, User currentUser){
		this.view = view;
		this.setPosts(posts);
		this.setCurrentUser(currentUser);
		this.setService(new ShowProfileService(this.currentUser, this.currentUser, this.posts));
	}
	
	/**
	 * Sets the show profile service.
	 *
	 * @param service the new show profile service
	 */
	public void setService(ShowProfileService service){
		this.service = service;
	}
	
	/**
	 * Start.
	 */
	public void start(){
		view.setProfilePresenter(this);
		view.open();
	}
	
	/**
	 * Adds the post action.
	 */
	public void addPostAction() {
		new AddPostPresenter(new AddPostJFrame(view.getMainFrame()), currentUser, posts).start();
	}
	
	/**
	 * Gets the profile name.
	 *
	 * @return the profile name
	 */
	public String getProfileName(){
		return service.getProfileName();
	}
	
	/**
	 * Gets the buddies as string.
	 *
	 * @return the buddies as string
	 */
	public List<String> getBuddiesAsString(){
		List<String> buddiesAsString = new ArrayList<String>();
		for(User u : service.getCurrentuser().getBuddies()){
			buddiesAsString.add(u.getFirstname()+" " +u.getLastname());
		}
		return buddiesAsString;
	}
	
	/**
	 * Gets the posts as string.
	 *
	 * @return the posts as string
	 */
	public List<String> getPostsAsString(){
		List<String> postsAsString = new ArrayList<String>();
		for(Post p : service.getMyPosts()){
			postsAsString.add(p.getText());
		}
		return postsAsString;
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


	
}
