/*
 * 
 */
package buddychallenge.gui.presenters;

import buddychallenge.dao.PostsDAO;
import buddychallenge.entities.User;
import buddychallenge.exceptions.PostException;
import buddychallenge.gui.views.interfaces.AddPostView;
import buddychallenge.rules.PostingRules;
import buddychallenge.services.AddPostService;

// TODO: Auto-generated Javadoc
/**
 * The Class AddPostPresenter.
 */
public class AddPostPresenter {
	
	/** The view. */
	private AddPostView view;
	
	/** The text. */
	private String text;
	
	/** The service. */
	private AddPostService service;
	
	/** The creator. */
	private User creator;
	
	/** The rule. */
	private PostingRules rule;
	
	/** The posts. */
	private PostsDAO posts;
	
	/**
	 * Instantiates a new adds the post presenter.
	 *
	 * @param view the view
	 * @param creator the creator
	 * @param posts the posts
	 */
	public AddPostPresenter(AddPostView view, User creator, PostsDAO posts){
		this.view = view;
		this.setCreator(creator);
		this.setPosts(posts);
	}
	
	/**
	 * Instantiates a new adds the post presenter.
	 *
	 * @param view the view
	 */
	public AddPostPresenter(AddPostView view) {
		this.view = view;
	}

	/**
	 * Sets the adds the post service.
	 *
	 * @param service the new adds the post service
	 */
	public void setService(AddPostService service){
		this.service = service;
	}
	
	/**
	 * Start.
	 */
	public void start(){
		view.setAddPostPresenter(this);
		view.open();
	}
	
	/**
	 * Adds the post.
	 */
	public void addPost() {
		setService(new AddPostService(text, creator, rule, posts));
		try {
			service.addPost();
			view.close();
		} catch (PostException e) {
			view.showMessage(e.getMessage());
		}
	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Gets the creator.
	 *
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * Sets the creator.
	 *
	 * @param creator the new creator
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * Gets the rule.
	 *
	 * @return the rule
	 */
	public PostingRules getRule() {
		return rule;
	}

	/**
	 * Sets the rule.
	 *
	 * @param rule the new rule
	 */
	public void setRule(PostingRules rule) {
		this.rule = rule;
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
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}


}
