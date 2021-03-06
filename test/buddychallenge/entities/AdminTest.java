package buddychallenge.entities;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


import buddychallenge.exceptions.PostException;
import buddychallenge.rules.BuddiesPostingRuleImpl;
import buddychallenge.util.Category;
import buddychallenge.util.Password;
import buddychallenge.util.Username;


public class AdminTest {

	static Admin admin;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		admin = new Admin(new Username("admin"), new Password("aaa111!@#"));
	}


	//Test if given Username is set correctly
	@Test
	public void testGiveUsername() {
		assertTrue(admin.getUsername().toString().equals("admin"));
	}// Same for the other fields
	
	@Test
	public void testCreateQuestion(){
		List<String> optionsT = new ArrayList<String>();
		optionsT.add("t1");
		optionsT.add("t2");
		Question q = admin.createQuestion("Test", optionsT);
		assertTrue(q.getQuestion().equalsIgnoreCase("Test") && q.getOptions().equals(optionsT));
	}
	
	@Test
	public void testGetReports() throws PostException{
		User user1 = new User();
		User user2 = new User();
		Post post = new Post("Test Post", user1, new BuddiesPostingRuleImpl());
		Report r = new Report("Test Report", Category.category1,post,user2);
		admin.addReport(r);
		assertTrue(admin.getReports().contains(r));
	}
	
	//Admin deletes a post after a report
	@Test
	public void testDeletePost() throws PostException{
		User user = new User();
		User user2 = new User();
		Post post = new Post("Test post", user, new BuddiesPostingRuleImpl());
		Report r = new Report("Test Report", Category.category1,post,user2);
		admin.deletePost(r);
		assertFalse(user.getPosts().contains(post));
	}

}
