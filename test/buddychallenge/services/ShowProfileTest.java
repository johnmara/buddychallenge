package buddychallenge.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.Post;
import buddychallenge.entities.User;
import buddychallenge.exceptions.BuddyException;
import buddychallenge.exceptions.PostException;
import buddychallenge.exceptions.UserException;
import buddychallenge.rules.BuddiesPostingRuleImpl;
import buddychallenge.rules.PublicPostingRuleImpl;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class ShowProfileTest {
	
	static ShowProfileService showprofile;
	
	static User currentUser, profileUser;
	
	static PostsDAO posts;
	static UsersDAO users;

	@BeforeClass
	public static void setUpBeforeClass() throws UserException, ParseException {
		users = new UsersDAO();
		posts = new PostsDAO();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");

		SignUpService signup = new SignUpService(new Username("test"), new Password("test123"), new EmailAddress("test@address.com"), 
				Gender.Gender1, "Test", "Test", sdf1.parse("24-11-1994"), users);
		
		SignUpService signup2 = new SignUpService(new Username("test2"), new Password("test1243"), new EmailAddress("test2@address.com"), 
				Gender.Gender1, "Test2", "Test2", sdf1.parse("20-12-2014"), users);
		
		signup.signUpUser();
		users = signup.getUsers();
		
		signup2.signUpUser();
		users = signup2.getUsers();
		
		SignInService signIn = new SignInService(new Username("test"),new Password("test123"), users, new AdminsDAO());
		signIn.signInUser();
		currentUser = signIn.getCurrentUser();
		profileUser = users.getUserByUsername("test2");
	}

	@Test
	public void testShowBuddyProfile() throws BuddyException, PostException {
		currentUser.addBuddy(profileUser);
		profileUser.addBuddy(currentUser);
		
		AddPostService addPostDetails = new AddPostService("Test post [buddies only]", profileUser, new BuddiesPostingRuleImpl(), posts);
		addPostDetails.addPost();
		posts = addPostDetails.getPosts();
		
		showprofile = new ShowProfileService(currentUser, profileUser, posts);
		List<Post> returnedPosts =  showprofile.getPostList();
		assertTrue(posts.getPostList().equals(returnedPosts));
	}
	
	@Test
	public void testShowPublicProfile() throws BuddyException, PostException {

		AddPostService addPostDetails = new AddPostService("Test post [buddies only]", profileUser, new BuddiesPostingRuleImpl(), posts);
		addPostDetails.addPost();
		posts = addPostDetails.getPosts();
		
		showprofile = new ShowProfileService(currentUser, profileUser, posts);
		List<Post> returnedPosts =  showprofile.getPostList();
		assertFalse(posts.getPostList().equals(returnedPosts));
	}
	
	@Test
	public void testShowPublicProfileBuddies() throws BuddyException, PostException {
		currentUser.addBuddy(profileUser);
		profileUser.addBuddy(currentUser);
		
		AddPostService addPostDetails = new AddPostService("Test post [public only]", profileUser, new PublicPostingRuleImpl(), posts);
		addPostDetails.addPost();
		posts = addPostDetails.getPosts();
		
		showprofile = new ShowProfileService(currentUser, profileUser, posts);
		List<Post> returnedPosts =  showprofile.getPostList();
		assertTrue(posts.getPostList().equals(returnedPosts));
	}
	
	@After
	public void releaseRes(){
		currentUser.removeBuddy(profileUser);
		profileUser.removeBuddy(currentUser);
	}

}
