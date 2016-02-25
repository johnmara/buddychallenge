package buddychallenge.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.exceptions.PostException;
import buddychallenge.rules.BuddiesPostingRuleImpl;

public class PostTest {
	
	static Post post;
	static User user; 

	@Before
	public void setUp() throws Exception {
		user = new User();
		post = new Post("Test", user, new BuddiesPostingRuleImpl());
	}

	@Test
	public void testPostText() {
		assertEquals(post.getText(),"Test");
	}
	
	@Test
	public void testPostUser(){
		assertEquals(post.getUser(), user);
	}
	
	@Test(expected=PostException.class)
	public void testEmptyText() throws PostException{
		post = new Post("", new User(), new BuddiesPostingRuleImpl());
		Post post2 = new Post();
		post2.setText(new String(""));
		post2.setUser(new User());
		post2.setRule(new BuddiesPostingRuleImpl());
		
	}
	
	@Test
	public void testComment(){
		User user2 = new User();
		Comment comment1 = new Comment("test by user2", user2);
		Comment comment2 = new Comment("test by user", user);
		post.createComment(comment1);
		assertTrue(post.getComments().contains(comment1));
		assertEquals(comment2.getUser(), user);
		
		post.deleteComent(comment1);
		assertFalse(post.getComments().contains(comment1));
	}
}
