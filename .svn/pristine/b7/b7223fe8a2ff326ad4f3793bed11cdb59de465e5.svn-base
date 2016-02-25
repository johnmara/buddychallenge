package buddychallenge.gui;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.gui.presenters.BuddyRequestPresenter;
import buddychallenge.gui.stubs.BuddyRequestStub;
import buddychallenge.services.BuddyRequestService;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class BuddyRequestTest {

	private BuddyRequestPresenter presenter;
	private BuddyRequestStub stub;
	private BuddyRequestService service;
	private User sender, receiver;
	private Question q1,q2,q3,q4,q5;

	@Before
	public void setUp() throws Exception {
		initializeData();
		stub = new BuddyRequestStub();
		service = new BuddyRequestService(sender, receiver);
		presenter = new BuddyRequestPresenter(stub, sender, receiver);
		presenter.setService(service);

	}

	private void initializeData() {
		List<Question> questions = new ArrayList<Question>();
		List<User> users = new ArrayList<User>();

		q1 = new Question();
		q1.setQuestion("What music do you like?");
		q1.addOption("1.rock");
		q1.addOption("2.rnb");

		q2 = new Question();
		q2.setQuestion("What colour do you like?");
		q2.addOption("1.blue");
		q2.addOption("2.red");

		q3 = new Question();
		q3.setQuestion("Uni?");
		q3.addOption("1.aueb");
		q3.addOption("2.papei");

		q4 = new Question();
		q4.setQuestion("Brand");
		q4.addOption("1.adidas");
		q4.addOption("2.nike");

		q5 = new Question();
		q5.setQuestion("Team");
		q5.addOption("1.osfp");
		q5.addOption("2.pao");

		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = null;
		try {
			date1 = sdf1.parse("12-12-1990");
		} catch (ParseException e) {
			System.err.println("Problem while parsing the date.");
		}
		sender = new User(new Username("sender"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);
		receiver = new User(new Username("receiver"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);
		users.add(sender);
		
		receiver.addQuestion(
				q1,
				q1.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q1.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q1.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		receiver.addQuestion(
				q2,
				q2.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q2.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q2.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		
		receiver.addQuestion(
				q3,
				q3.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q3.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q3.getOptions().get(Integer.parseInt("2") - 1))
										.length()));

		receiver.addQuestion(
				q4,
				q4.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q4.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q4.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		
		receiver.addQuestion(
				q5,
				q5.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q5.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q5.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		users.add(receiver);
	}

	@Test
	public void wiring() {
		presenter.start();
		assertTrue(stub.isOpened());
	}
	/**
	 * Check if questions and answers have beeb sent successfully from GUI to service 
	 */
	@Test
	public void checkValues() {
		List<Question> qlist = new ArrayList<Question>(receiver.getQuestions().keySet());
		stub.setQ1(qlist.get(0)); stub.setQ2(qlist.get(1)); stub.setQ3(qlist.get(2)); stub.setQ4(qlist.get(3)); stub.setQ5(qlist.get(4));
		stub.setA1("2"); stub.setA2("2"); stub.setA3("2"); stub.setA4("2"); stub.setA5("2");
		presenter.sendQuestions();
		String[] expecteds = {"2","2","2","2","2"};
		String[] actuals = {service.getAnswers().get(q1),service.getAnswers().get(q2),service.getAnswers().get(q3),
				service.getAnswers().get(q4),service.getAnswers().get(q5)};
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void closing() {
		presenter.start();
		presenter.cancel();

		assertFalse(stub.isOpened());
	}

}
