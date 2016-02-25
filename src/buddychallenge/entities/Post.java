/*
 * Describes A Post.
 */
package buddychallenge.entities;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.exceptions.PostException;
import buddychallenge.rules.PostingRules;

// TODO: Auto-generated Javadoc
/**
 * The Class Post.
 */
public class Post {
	
	/** The id. */
	private static int id;
	
	/** The post id. */
	private int postID;
	
	/** The text. */
	private String text;
	
	/** The user. */
	private User user;
	
	/** The rule. */
	private PostingRules rule;
	
	/** The comments. */
	private List<Comment> comments;
	
	
	
	/**
	 * Instantiates a new post.
	 *
	 * @param text the String Instance, the text of post
	 * @param user the User Instance, the creator of post
	 * @param rule the PostingRules Instance, the rule of post
	 * @throws PostException the post exception
	 */
	public Post(String text, User user, PostingRules rule) throws PostException {
		postID = id++;
		if(text.isEmpty())
			throw new PostException("Post text can not be empty");
		else 
			setText(text);
		setUser(user);
		setRule(rule);
		setComments(new ArrayList<Comment>());
		user.createPost(this);
	}
	
	/**
	 * Instantiates a new post.
	 *
	 * @throws PostException the post exception
	 */
	public Post() throws PostException{
		this("Nothing", null , null);
	}

	/**
	 * Gets the post id.
	 *
	 * @return the post id
	 */
	public int getPostID() {
		return postID;
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
	 * @throws PostException the post exception
	 */
	public void setText(String text) throws PostException{
		if(text.isEmpty())
			throw new PostException("Post text can not be empty");
		else
			this.text = text;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the comments.
	 *
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return new ArrayList<Comment>(comments);
	}

	/**
	 * Sets the comments.
	 *
	 * @param comments the new comments
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	/**
	 * Creates the comment.
	 *
	 * @param c the Comment instance that will be created
	 */
	public void createComment(Comment c){
		comments.add(c);
	}
	
	/**
	 * Delete coment.
	 *
	 * @param com the Comment instance that will be deleted
	 */
	public void deleteComent(Comment com){
		if(comments.contains(com))
			comments.remove(com);
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
	 * @param rule the PostingRules instance
	 */
	public void setRule(PostingRules rule) {
		this.rule = rule;
	}

	
}
