/*
 * Describes A Report Entity.
 */
package buddychallenge.entities;

import buddychallenge.util.Category;

// TODO: Auto-generated Javadoc
/**
 * The Class Report.
 */
public class Report {
	
	/** The id. */
	private static int id;
	
	/** The report id. */
	private int reportID;
	
	/** The reason. */
	private String reason;
	
	/** The category. */
	private Category category;
	
	/** The post. */
	private Post post;
	
	/** The user. */
	private User user;
	
	/**
	 * Instantiates a new report.
	 *
	 * @param reason the reason
	 * @param category the category
	 * @param post the post
	 * @param user the user
	 */
	public Report(String reason, Category category, Post post, User user) {
		reportID = id++;
		setReason(reason);
		setCategory(category);
		setPost(post);
		setUser(user);
	}
	
	/**
	 * Instantiates a new report.
	 */
	public Report(){
		reportID = id++;
	}

	/**
	 * Gets the report id.
	 *
	 * @return the report id
	 */
	public int getReportID() {
		return reportID;
	}

	/**
	 * Gets the reason.
	 *
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the reason.
	 *
	 * @param reason the new reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * Gets the post.
	 *
	 * @return the post
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * Sets the post.
	 *
	 * @param post the new post
	 */
	public void setPost(Post post) {
		this.post = post;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return String.format("Category: %s/nReason: %s/n Post: %s", this.category.toString(), this.reason, this.post.getText());
	}
	
}
