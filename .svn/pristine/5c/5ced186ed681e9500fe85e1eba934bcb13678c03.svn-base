package buddychallenge.services;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.Test;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.exceptions.PostException;
import buddychallenge.exceptions.UserException;
import buddychallenge.rules.PostingRules;
import buddychallenge.rules.PublicPostingRuleImpl;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class AddPostTest {

	static AddPostService addPostDetails;
	static String text;
	static User creator;
	static PostingRules rule;

	static UsersDAO users;
	static PostsDAO posts;

	@BeforeClass
	public static void setUpBeforeClass() throws UserException, ParseException {
		// SignUp User
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		users = new UsersDAO();
		SignUpService signupDetails = new SignUpService(new Username("test"), new Password(
				"test123"), new EmailAddress("test@address.com"),
				Gender.Gender1, "Test", "Test", sdf1.parse("24-11-1994"), users);

		signupDetails.signUpUser();
		users = signupDetails.getUsers();
		posts = new PostsDAO();
	}

	@Test
	public void testSuccessFullAddPost() throws PostException {
		text = new String("Test Post [Public]");
		creator = users.getUserByUsername("test");
		rule = new PublicPostingRuleImpl();

		addPostDetails = new AddPostService(text, creator, rule, posts);
		addPostDetails.addPost();
		Post currentPost = null;
		for (Post p : posts.getPostList()) {
			if (p.getText().equals("Test Post [Public]")
					&& p.getUser().equals(creator))
				currentPost = p;
		}
		if(currentPost != null)
			assertTrue(currentPost.getText().equals("Test Post [Public]") && currentPost.getRule().equals(rule)
					&& currentPost.getUser().equals(creator));

	}
	
	@Test(expected=PostException.class)
	public void testEmptyTextPost() throws PostException{
		text = new String("");
		creator = users.getUserByUsername("test");
		rule = new PublicPostingRuleImpl();

		addPostDetails = new AddPostService(text, creator, rule, posts);
		addPostDetails.addPost();
	}

}
