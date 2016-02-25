/*
 * 
 */
package buddychallenge.gui.presenters;

import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.entities.User;
import buddychallenge.gui.views.interfaces.HomePageView;
import buddychallenge.services.HomePageService;

// TODO: Auto-generated Javadoc
/**
 * The Class HomePagePresenter.
 */
public class HomePagePresenter{
	
	/** The service. */
	private HomePageService service;
	
	/** The current user. */
	private User currentUser;
	
	/** The posts. */
	private PostsDAO posts;
	
	/** The view. */
	private HomePageView view;
	
	/**
	 * Instantiates a new home page presenter.
	 *
	 * @param view the view
	 * @param currentUser the current user
	 * @param posts the posts
	 */
	public HomePagePresenter(HomePageView view, User currentUser, PostsDAO posts){
		this.view = view;
		this.currentUser = currentUser;
		this.posts = posts;
		this.setService(new HomePageService(this.currentUser, this.posts));
	}
	
	/**
	 * Sets the home page serv.
	 *
	 * @param service the new home page serv
	 */
	public void setService(HomePageService service){
		this.service = service;
	}
	
	/**
	 * Start.
	 */
	public void start(){
		view.setHomePagePresenter(this);
		view.open();
	}
	
	
	/**
	 * Gets the posts.
	 *
	 * @return the posts
	 */
	public List<String> getPosts() {
		return this.service.getPostsAsString();
	}
	
	/**
	 * Gets the profile name.
	 *
	 * @return the profile name
	 */
	public String getProfileName() {
		User u = this.service.getCurrentUser();
		return u.getFirstname() + " " + u.getLastname();
	}
	
	
	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}

}
