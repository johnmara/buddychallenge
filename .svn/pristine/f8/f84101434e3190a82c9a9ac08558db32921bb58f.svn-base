package buddychallenge.services;

import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Comment;
import buddychallenge.entities.Post;
import buddychallenge.entities.Report;
import buddychallenge.entities.User;
import buddychallenge.util.Category;

public class PostDetailsService {
	
	private Post post;
	private User viewer;
	private ReportsDAO reports;
	private PostsDAO posts;
	
	public PostDetailsService(Post post,User viewer,ReportsDAO reports, PostsDAO posts){
		this.setPost(post);
		this.setViewer(viewer);
		setReports(reports);
		setPosts(posts);
	}
	
	public PostDetailsService(){
		this(null,null,null,null);
	}
	
	public void reportPost(String reason, Category category ){
		reports.addReport(new Report(reason, category, post, viewer));
	}
	
	public void addComment(String commentString, User user, Post post) {
		Comment comment = new Comment(commentString, user);
		Post p = posts.getPost(post);
		p.createComment(comment);
		posts.deletePost(p);
		posts.addPost(p);
		
	}
	
	public List<Comment> getCommentsByPost(Post p){
		return p.getComments();
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getViewer() {
		return viewer;
	}

	public void setViewer(User viewer) {
		this.viewer = viewer;
	}

	public ReportsDAO getReports() {
		return reports;
	}

	public void setReports(ReportsDAO reports) {
		this.reports = reports;
	}
	
	public void setPosts(PostsDAO posts) {
		this.posts = posts;
	}


}
