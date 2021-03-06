package buddychallenge.services;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.dao.QuestionsDAO;
import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class SignUpQuestionnaireTest {
	
	QuestionsDAO questions;
	User mara;

	@Before
	public void setUp() throws Exception {
		questions = new QuestionsDAO();
		
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
		
		questions.addQuestion(q1);
		questions.addQuestion(q2);
		questions.addQuestion(q3);
		questions.addQuestion(q4);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = null;
		try {
			date1 = sdf1.parse("12-12-1990");
		} catch (ParseException e) {
			System.err.println("Problem while parsing the date.");
		}
		mara = new User(new Username("mara"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);
	}

	@Test
	public void testUserAnswers() {
		SignUpQuestionnaire signup = new SignUpQuestionnaire(mara,questions,3);
		Question q0 = signup.getQuestion(0);
		Question q1 = signup.getQuestion(1);
		Question q3 = signup.getQuestion(3);
		signup.answerQuestion(q0, "rock");
		signup.answerQuestion(q1, "blue");
		signup.answerQuestion(q3, "adidas");
		assertEquals(mara.getQuestions().get(q0),"rock");
		
		assertNotSame(mara.getQuestions().get(q3),"nike");
	}

}