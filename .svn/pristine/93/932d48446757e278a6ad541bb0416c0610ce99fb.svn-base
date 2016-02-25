package buddychallenge.entities;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.exceptions.BuddyException;
import buddychallenge.util.Username;


public class UserTest {

	static User user1,user2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		user1 = new User();
		user2 = new User();
	}
	
	//Test if given Username is set correctly
	@Test
	public void testGiveUsername() {
		user1.setUsername(new Username("John"));
		assertTrue(user1.getUsername().toString().equals("John"));
	}// Same for the other fields
	
	//Test if 2 users being buddies correctly
	@Test
	public void testAddBuddy() throws BuddyException{
		user1.addBuddy(user2);
		user2.addBuddy(user1);
		assertTrue(user1.hasBuddy(user2) && user2.hasBuddy(user1));	
	}
	
	//Test if 1 user can be buddy with himself(Expect BuddyException)
	@Test(expected=BuddyException.class)
	public void testBuddyHimself() throws BuddyException{
		user1.addBuddy(user1);
	}
	
	//Test if 1 user can be buddy with an already buddy(Expect BuddyException)
	@Test(expected=BuddyException.class)
	public void testBuddyWithBuddy() throws BuddyException{
		user1.addBuddy(user2);
		
	}
	
	
	//Test if equals(User u) method works correctly
	@Test
	public void testEqualsMethod(){
		assertTrue(user1.equals(user1));
	}
	
	@Test
	public void testNotEqualsMethod(){
		assertFalse(user1.equals(user2));
	}
	
	
	//Test if a question is added corretly in a User instance
	@Test
	public void testAddQuestionOnUser(){
		Question q = new Question();
		List<String> testOptList = new ArrayList<String>();
		testOptList.add("test1");
		testOptList.add("test2");
		q.setQuestion("Test Question");
		q.setOptions(testOptList);
		user1.addQuestion(q,q.getOptions().get(0));
		assertTrue(user1.getQuestions().containsKey(q) && user1.getQuestions().containsValue("test1"));
	}

}
