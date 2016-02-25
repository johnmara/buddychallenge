/*
 * 
 */
package buddychallenge.services;

import buddychallenge.dao.PostsDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.exceptions.PostException;
import buddychallenge.rules.PostingRules;


// TODO: Auto-generated Javadoc
/**
 * The Class AddPost.
 */
public class AddPostService {

	/** The id. */
	private static int id;
	
	/** The add post id. */
	private int addPostID;
	
	/** The text. */
	private String text;
	
	/** The creator. */
	private User creator;
	
	/** The rule. */
	private PostingRules rule;
	
	/** The posts. */
	private PostsDAO posts;
	
	/**
	 * Instantiates a new adds the post.
	 *
	 * @param text the text
	 * @param creator the creator
	 * @param rule the rule
	 * @param posts the posts
	 */
	public AddPostService(String text, User creator, PostingRules rule, PostsDAO posts) {
		addPostID = id++;
		setText(text);
		setCreator(creator);
		setRule(rule);
		setPosts(posts);
	}

	/**
	 * Instantiates a new adds the post.
	 */
	public AddPostService(){
		this(null,null,null,null);	
	}
	
	/**
	 * Creates new Post.
	 *
	 * @throws PostException , if the text of post is empty.
	 */
	public void addPost() throws PostException{
		if(!text.isEmpty()){
			if(creator != null)
				posts.addPost(new Post(text, creator, rule));
			else
				throw new PostException("User Not Found");
		}else 
			throw new PostException("Empty Text");
		
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
	 * Sets the posts.
	 *
	 * @param posts the new posts
	 */
	public void setPosts(PostsDAO posts) {
		this.posts = posts;
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
	 * Gets the adds the post id.
	 *
	 * @return the adds the post id
	 */
	public int getAddPostID() {
		return addPostID;
	}
	
	
	
	
	
}
