package buddychallenge.gui.presenters;

import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Comment;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.gui.views.interfaces.ShowPostDetailsView;
import buddychallenge.services.PostDetailsService;

public class ShowPostDetailsPresenter {
	
	private ShowPostDetailsView view;
	private User currentUser;
	private Post post;
	private PostDetailsService service;

	public ShowPostDetailsPresenter(
			ShowPostDetailsView view, User currentUser,
			Post post,ReportsDAO reports, PostsDAO posts) {
		
		this.view = view;
		this.currentUser = currentUser;
		this.post = post;
		this.service = new PostDetailsService(post,currentUser,reports,posts);
		
	}
	
	/**
	 * Start.
	 */
	public void start() {
		view.setShowPostDetailsPresenter(this);
		view.open();
	}
	
	/**
	 * Add comment to post.
	 */
	public void addComment() {
		service.addComment(view.getCommentString(), currentUser, post);
		view.showMessage("Comment Added SuccessFully");
	}
	
	/**
	 * Get comments of post.
	 */
	public List<Comment> getComments() {
		return service.getCommentsByPost(post);
	}
	
	/**
	 * Get post's text
	 */
	public String getPostText() {
		return post.getText();
	}
	
	/**
	 * Report the post.
	 */
	public void reportPost() {
		service.reportPost(view.getReasonString(), view.getCategory());
		view.showMessage("Report will be reviewed by admins");
	}
	
	/**
	 * Sets the show profile serv.
	 *
	 * @param ShowPostDetailsServ the new show post details serv
	 */
	public void setService (PostDetailsService service) {
		// todo
		this.service = service;
	}
	
	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}

	

}
