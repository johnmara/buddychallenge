package buddychallenge.services;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

import buddychallenge.services.BuddyRequestService;

public class BuddyRequestTest {
	User user1;
	User user2;

	@Before
	public void setUp() throws Exception {

		List<Question> questions = new ArrayList<Question>();
		List<User> users = new ArrayList<User>();

		Question q1 = new Question();
		q1.setQuestion("What music do you like?");
		q1.addOption("1.rock");
		q1.addOption("2.rnb");

		Question q2 = new Question();
		q2.setQuestion("What colour do you like?");
		q2.addOption("1.blue");
		q2.addOption("2.red");

		Question q3 = new Question();
		q3.setQuestion("Uni?");
		q3.addOption("1.aueb");
		q3.addOption("2.papei");

		Question q4 = new Question();
		q4.setQuestion("Brand");
		q4.addOption("1.adidas");
		q4.addOption("2.nike");

		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = null;
		try {
			date1 = sdf1.parse("12-12-1990");
		} catch (ParseException e) {
			System.err.println("Problem while parsing the date.");
		}
		user1 = new User(new Username("user1"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);
		user2 = new User(new Username("user2"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);

		user1.addQuestion(
				q1,
				q1.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q1.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q1.getOptions().get(Integer.parseInt("1") - 1))
										.length()));
		user1.addQuestion(
				q2,
				q2.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q2.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q2.getOptions().get(Integer.parseInt("1") - 1))
										.length()));

		user1.addQuestion(
				q3,
				q3.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q3.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q3.getOptions().get(Integer.parseInt("1") - 1))
										.length()));
		users.add(user1);
		user2.addQuestion(
				q1,
				q1.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q1.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q1.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		user2.addQuestion(
				q2,
				q2.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q2.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q2.getOptions().get(Integer.parseInt("2") - 1))
										.length()));

		user2.addQuestion(
				q4,
				q4.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q4.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q4.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		users.add(user2);
	}

	@Test
	public void testResultTrue() {
		BuddyRequestService request = new BuddyRequestService(user1,user2); //user1 wants to be a buddy with user2

		Map<Question, String> answers = new HashMap<Question, String>();
		List<Question> keys = new ArrayList<Question>(user2.getQuestions().keySet());
		answers.put(keys.get(0), "2"); answers.put(keys.get(1), "2"); answers.put(keys.get(2), "2");
		request.setAnswers(answers);
		request.calculate();//Result == true -> Successful request
		boolean b = request.isResult();

		if (b) {
			assertTrue(user1.hasBuddy(user2));
			assertTrue(user2.hasBuddy(user1));
		}
		
	}
	
	@Test
	public void testResultFalse() {
		BuddyRequestService request = new BuddyRequestService(user1,user2); //user1 wants to be a buddy with user2
		Map<Question, String> answers = new HashMap<Question, String>();
		List<Question> keys = new ArrayList<Question>(user2.getQuestions().keySet());
		int i=0;
		for(Question q : keys){
			answers.put(q, String.valueOf(i%2==0?2:1));
			i++;
		}
		request.setAnswers(answers);
		request.calculate();//Result == false -> Unsuccessfull request
			assertFalse(user1.hasBuddy(user2));
			assertFalse(user2.hasBuddy(user1));
		request.setAnswers(answers);
		request.calculate();//Result == false -> Unsuccessfull request
		
		request.isResult();
		assertFalse(user1.hasBuddy(user2));
		assertFalse(user2.hasBuddy(user1));
		
	}
}
