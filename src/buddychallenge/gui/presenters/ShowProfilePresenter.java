/*
 * 
 */
package buddychallenge.gui.presenters;

import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.gui.BuddyRequestJFrame;
import buddychallenge.gui.ShowPostDetailsJFrame;
import buddychallenge.gui.views.interfaces.ShowProfileView;
import buddychallenge.services.ShowProfileService;
import buddychallenge.util.Gender;


// TODO: Auto-generated Javadoc
/**
 * The Class ShowProfilePresenter.
 */
public class ShowProfilePresenter {

	/** The profile user. */
	private User currentUser, profileUser;
	
	/** The posts. */
	private PostsDAO posts;
	
	/** The show profile serv. */
	private ShowProfileService service;
	
	/** The view. */
	private ShowProfileView view;
	
	private ReportsDAO reports;

	/**
	 * Instantiates a new show profile presenter.
	 *
	 * @param view the view
	 * @param currentUser the current user
	 * @param profileUser the profile user
	 * @param posts the posts
	 */
	public ShowProfilePresenter(ShowProfileView view, User currentUser, User profileUser, PostsDAO posts,ReportsDAO reports) {
		this.view = view;
		this.currentUser = currentUser;
		this.profileUser = profileUser;
		this.posts = posts;
		this.reports = reports;
		setService(new ShowProfileService(this.currentUser, this.profileUser, this.posts));
	}
	
	/**
	 * Instantiates a new show profile presenter.
	 *
	 * @param view the view
	 */
	public ShowProfilePresenter(ShowProfileView view) {
		this(view, new User(), new User(), new PostsDAO(), new ReportsDAO());
	}
	
	/**
	 * Sets the show profile serv.
	 *
	 * @param showProfileServ the new show profile serv
	 */
	public void setService (ShowProfileService service) {
		// todo
		this.service = service;
	}

	/**
	 * Start.
	 */
	public void start() {
		view.setShowProfilePresenter(this);
		view.open();
	}
	
	/**
	 * Gets the posts.
	 *
	 * @return the posts
	 */
	public List<Post> getPosts(){
		return service.getPostList();
	}
	
	/**
	 *	Show the post details
	 *
	 * 
	 */
	public void showPostDetails() {
		if(view.getSelectedValue() != null){
			String postText = view.getSelectedValue();
			int pos1 = postText.indexOf(":");
			int pos2 = postText.indexOf(",");
			postText = postText.substring(pos1+1,pos2);
			postText = postText.trim();
			Post post = posts.getPostByID(Integer.parseInt(postText));
			try{
				new ShowPostDetailsPresenter(new ShowPostDetailsJFrame(), currentUser, post,reports,posts).start();
			}catch(NullPointerException e){
				view.showMessage(e.getMessage());
			}
		}
		
		
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
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public Gender getGender(){
		return service.getProfileGender();
	}
	
	/**
	 * Gets the current user.
	 *
	 * @return the current user
	 */
	public User getCurrentUser(){
		return this.currentUser;
	}
	
	/**
	 * Gets the profile user.
	 *
	 * @return the profile user
	 */
	public User getProfileUser(){
		return this.profileUser;
	}
	
	/**
	 * Action.
	 */
	public void action(){
		
	}
	
	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}

	/**
	 * Adds the buddy.
	 */
	public void addBuddy() {
		new BuddyRequestPresenter(new BuddyRequestJFrame(view.getMainFrame()),currentUser,profileUser).start();
		
	}

}
