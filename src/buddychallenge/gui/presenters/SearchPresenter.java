/*
 * 
 */
package buddychallenge.gui.presenters;

import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.User;
import buddychallenge.gui.ShowProfileJFrame;
import buddychallenge.gui.views.interfaces.SearchView;
import buddychallenge.services.SearchUserService;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchPresenter.
 */
public class SearchPresenter {

	/** The view. */
	private SearchView view;

	/** The search user det. */
	private SearchUserService service;
	
	/** The users. */
	private UsersDAO users;
	
	/** The posts. */
	private PostsDAO posts;
	
	private ReportsDAO reports;
	
	/** The current user. */
	private User currentUser;
	
	/** The profile name string. */
	private String profileNameString;

	/**
	 * Instantiates a new search presenter.
	 *
	 * @param view the view
	 * @param users the users
	 * @param posts the posts
	 * @param currentUser the current user
	 */
	public SearchPresenter(SearchView view, UsersDAO users, PostsDAO posts, User currentUser,ReportsDAO reports) {
		this.view = view;
		this.users = users;
		this.setPosts(posts);
		this.reports = reports;
		this.setCurrentUser(currentUser);
	}

	/**
	 * Instantiates a new search presenter.
	 *
	 * @param view the view
	 */
	public SearchPresenter(SearchView view) {
		this(view, new UsersDAO(), new PostsDAO(), new User(),new ReportsDAO());
	}

	/**
	 * Sets the search user det.
	 *
	 * @param searchUserDet the new search user det
	 */
	public void setService(SearchUserService service) {
		this.service = service;
	}
	
	/**
	 * Sets the profile name string.
	 *
	 * @param profileNameString the new profile name string
	 */
	public void setProfileNameString(String profileNameString){
		if(profileNameString == null || profileNameString.isEmpty())
			view.showMessage("Empty Text!");
		this.profileNameString = profileNameString;
	}

	/**
	 * Start.
	 */
	public void start() {
		view.setSearchPresenter(this);
		view.open();
	}

	/**
	 * Action.
	 *
	 * @return the list
	 */
	public List<User> action() {
		setService(new SearchUserService());
		
		service.setUsers(users);
		service.setProfileNameString(profileNameString);
		
		return service.searchUser();
	}

	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
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

	/**
	 * Show profile.
	 */
	public void showProfile() {
		String id = view.getSelectedValue();
		if(id != null){
			int endIndex = id.indexOf(':');
			id = id.substring(0, endIndex);
			User profileUser = null;
			List<User> userList =  action();
			for(User u : userList){
				if(u.getUserID() == Integer.parseInt(id))
					profileUser = u;
			}
			if(profileUser.getHasAnswered()){
				new ShowProfilePresenter(new ShowProfileJFrame(view.getMainFrame()),
						 getCurrentUser(), profileUser, getPosts(),reports).start();
			}
			else{
				view.showMessage("This user has not activated his account");
			}
		}
		
		
	}

}
