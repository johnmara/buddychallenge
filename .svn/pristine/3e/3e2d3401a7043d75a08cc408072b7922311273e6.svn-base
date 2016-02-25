/*
 * 
 */
package buddychallenge.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import buddychallenge.entities.Post;

// TODO: Auto-generated Javadoc
/**
 * The Class PostsDAO.
 */
public class PostsDAO {

	/** The post list. */
	static List<Post> postList;

	/**
	 * Instantiates a new posts dao.
	 */
	public PostsDAO() {
		setPostList(new ArrayList<Post>());
	}

	/**
	 * Adds the post.
	 *
	 * @param post the post
	 */
	public void addPost(Post post) {
		postList.add((Post) post);
	}
	
	/**
	 * Gets the post.
	 *
	 * @param post the post
	 * @return the post
	 */
	public Post getPost(Post post){
		for(Post p : postList){
			if(p.getPostID() == post.getPostID())
				return p;
		}
		
		return null; 
	}
	
	/**
	 * Gets the post by String.
	 *
	 * @param text the post's text
	 * @return the post
	 */
	public Post getPostByText(String text) {
		for(Post p : postList){
			if(p.getText().equalsIgnoreCase(text))
				return p;
		}
		return null;
	}

	/**
	 * Sets the post list.
	 *
	 * @param postList the new post list
	 */
	private void setPostList(ArrayList<Post> postList) {
		PostsDAO.postList = new ArrayList<Post>(postList);
	}

	/**
	 * Gets the post list.
	 *
	 * @return the post list
	 */
	public List<Post> getPostList() {
		return new ArrayList<Post>(postList);
	}

	public Post getPostByID(int id) {
		for(Post p: postList){
			if(p.getPostID() == id){
				return p;
			}
		}
		return null;
	}
	
	public void deletePost(Post post){
		post.getUser().deletePost(post);
		Iterator<Post> iter = postList.iterator();

		while (iter.hasNext()) {
		    Post p = iter.next();

		    if (p.getPostID() == post.getPostID())
		        iter.remove();
		}
		
		/*for(Post p : postList){
			if(p.getPostID() == post.getPostID())
				postList.remove(post);
		}*/
	}
}
