import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import buddychallenge.rules.BuddiesPostingRuleImpl;
import buddychallenge.rules.PostingRules;
import buddychallenge.rules.PublicPostingRuleImpl;
import buddychallenge.services.BuddyRequestService;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;
import buddychallenge.entities.Admin;
import buddychallenge.entities.Post;
import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.exceptions.PostException;

public class Main {

	static List<User> users = new ArrayList<User>();
	static List<Admin> admins = new ArrayList<Admin>();
	static List<Question> questions = new ArrayList<Question>();
	static int r;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;

		// create admins
		Admin admin1 = new Admin(new Username("admin1"), new Password("aaa111"));
		Admin admin2 = new Admin(new Username("admin2"), new Password("aaa111"));
		admins.add(admin1);
		admins.add(admin2);

		// creation of questions
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

		// create users
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = null;
		try {
			date1 = sdf1.parse("12-12-1990");
		} catch (ParseException e) {
			System.err.println("Problem while parsing the date.");
		}
		User mara = new User(new Username("mara"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);
		User bill = new User(new Username("bill"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);
		User teoo = new User(new Username("teoo"), new Password("aaa111"),
				new EmailAddress("aa@aa.aa"), "firsttt", "lasttt",
				Gender.Gender1, date1);

		mara.addQuestion(
				q1,
				q1.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q1.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q1.getOptions().get(Integer.parseInt("1") - 1))
										.length()));
		mara.addQuestion(
				q2,
				q2.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q2.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q2.getOptions().get(Integer.parseInt("1") - 1))
										.length()));

		mara.addQuestion(
				q3,
				q3.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q3.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q3.getOptions().get(Integer.parseInt("1") - 1))
										.length()));
		users.add(mara);
		bill.addQuestion(
				q1,
				q1.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q1.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q1.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		bill.addQuestion(
				q2,
				q2.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q2.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q2.getOptions().get(Integer.parseInt("2") - 1))
										.length()));

		bill.addQuestion(
				q4,
				q4.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q4.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q4.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		users.add(bill);
		teoo.addQuestion(
				q1,
				q1.getOptions()
						.get(Integer.parseInt("1") - 1)
						.substring(
								(q1.getOptions().get(Integer.parseInt("1") - 1)
										.indexOf(".") + 1),
								(q1.getOptions().get(Integer.parseInt("1") - 1))
										.length()));
		teoo.addQuestion(
				q2,
				q2.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q2.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q2.getOptions().get(Integer.parseInt("2") - 1))
										.length()));

		teoo.addQuestion(
				q3,
				q3.getOptions()
						.get(Integer.parseInt("2") - 1)
						.substring(
								(q3.getOptions().get(Integer.parseInt("2") - 1)
										.indexOf(".") + 1),
								(q3.getOptions().get(Integer.parseInt("2") - 1))
										.length()));
		users.add(teoo);

		System.out
				.print("What to do?\n\t1.Sign Up\n\t2.Sign In\n\t3.exit\n(Write number)>");
		answer = sc.nextLine();
		while (!checkAnswer(answer)) {
			System.out.println("Not valid answer. Try again.\n>");
			answer = sc.nextLine();
		}

		while (!answer.equals("3")) {
			if (answer.equals("1")) {

				// username
				System.out.println("Give Username: ");
				answer = sc.nextLine();
				Username username = new Username(answer);
				while (!username.isValid()) {
					System.out
							.println("Not valid Username. Length must be between 3 and 10 and starts with a"
									+ " latin character. Please try again: ");
					answer = sc.nextLine();
					username.setUsername(answer);
				}

				// password
				System.out.println("Give Password: ");
				answer = sc.nextLine();
				Password pass = new Password(answer);
				while (!pass.isValid()) {
					System.out
							.println("Not valid Password. Length must be at least 5 characters and "
									+ "contains at least one latin character and one number. Please try again: ");
					answer = sc.nextLine();
					pass.setPassword(answer);
				}

				// email
				System.out.println("Give e-mail: ");
				answer = sc.nextLine();
				EmailAddress email = new EmailAddress(answer);
				while (!email.isValid()) {
					System.out.println("Not valid email address. Try again: ");
					answer = sc.nextLine();
					email.setEmail(answer);
				}

				// firstname
				System.out.println("Give your firstname: ");
				answer = sc.nextLine();
				String firstname = answer;
				while (answer.isEmpty()) {
					System.out.println("Give a firstname: ");
					answer = sc.nextLine();
					firstname = answer;
				}

				// lastname
				System.out.println("Give your lastname: ");
				answer = sc.nextLine();
				String lastname = answer;
				while (answer.isEmpty()) {
					System.out.println("Give a lastname: ");
					answer = sc.nextLine();
					lastname = answer;
				}

				// gender
				System.out
						.println("Give your gender: \n1.Male\n2.Female\nEnter number> ");
				answer = sc.nextLine();
				Gender gender;
				while (!checkTwoOptions(answer)) {
					System.out
							.println("Give your gender: \n1.Male\n2.Female\nEnter number> ");
					answer = sc.nextLine();
				}
				if (answer.equals("1"))
					gender = Gender.Gender1;
				else
					gender = Gender.Gender2;

				// birthdate
				System.out.println("Give your birthdate(dd-mm-yyyy): ");
				answer = sc.nextLine();
				while (answer.isEmpty()) {
					System.out.println("Give your birthdate(dd-mm-yyyy): ");
					answer = sc.nextLine();
				}
				SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
				Date date = null;
				try {
					date = sdf.parse(answer);
				} catch (ParseException e) {
					System.err.println("Problem while parsing the date.");
				}

				System.out.println("New user created successfully.");
				User created = new User(username, pass, email, firstname,
						lastname, gender, date);
				System.out
						.println("Time to answer some question about your personal interests. ");

				for (int i = 0; i < 3; i++) {
					r = random(questions.size());
					while (created.hasQuestion(questions.get(r))) {
						r = random(questions.size());
					}
					Question q = questions.get(r);
					System.out.println("Question" + (i + 1) + ": ");
					System.out.println(q); // override
					answer = sc.nextLine();
					String option = q.getOptions().get(
							Integer.parseInt(answer) - 1);
					created.addQuestion(
							q,
							option.substring(option.indexOf(".") + 1,
									option.length()));
				}
				users.add(created);

				System.out
						.print("What to do?\n\t1.Sign Up\n\t2.Sign In\n\t3.exit\n(Write number)>");
				answer = sc.nextLine();
				while (!checkAnswer(answer)) {
					System.out.println("Not valid answer. Try again.\n>");
					answer = sc.nextLine();
				}
				// login
			} else if (answer.equals("2")) {
				System.out.println("Give Username: ");
				String username = sc.nextLine();
				System.out.println("Give password: ");
				String password = sc.nextLine();
				if (getUserByUsername(username) != null) {
					User currentUser = getUserByUsername(username);
					if (checkLogin(username, password)) {
						System.out.println("Logged in successfully");
						while (!answer.equals("5")) {
							System.out
									.print("What to do?\n\t1.search buddy\n\t2.show buddies\n\t3.add post\n\t4.show profile"
											+ "\n\t5.logout\n>");
							answer = sc.nextLine();
							@SuppressWarnings("unused")
							Map<Question, String> answers = new HashMap<Question, String>();
							// SearchBuddy
							if (answer.equals("1")) {
								System.out.println("Enter username: ");
								String friend = sc.nextLine();
								while (getUserByUsername(friend) == null) {
									System.out.println("User not found");
									System.out.println("Give another user");
									friend = sc.nextLine();
								}
								System.out
										.println("1.Add Buddy\n2.Show Profile");
								answer = sc.nextLine();
								while (!checkTwoOptions(answer)) {
									System.out.println("Not valid answer");
									System.out
											.println("1.Add Buddy\n2.Show Profile");
									answer = sc.nextLine();
								}
								if (answer.equals("1")) {
									BuddyRequestService request = new BuddyRequestService(
											currentUser,
											getUserByUsername(friend));
									if (request.isResult()) {
										System.out
												.println("Friend added successfully");
									} else {
										System.out.println("You dont match");
									}

								} else {
									getUserByUsername(friend).printPosts(
											currentUser);
								}

							}
							// ShowBuddies
							else if (answer.equals("2")) {
								if (currentUser.getBuddies().size() > 0) {
									currentUser.printBuddies();
								} else {
									System.out.println("No friends to show");
								}
							}
							// add post
							else if (answer.equals("3")) {
								System.out.println("Give text:");
								String text = sc.nextLine();
								while (text.isEmpty()) {
									System.out.println("No text found.");
									System.out.println("Give text:");
									text = sc.nextLine();
								}
								System.out
										.println("Give privacy:\n1.Only Buddies\n2.Public(Not recommended)");
								answer = sc.nextLine();
								while (!checkTwoOptions(answer)) {
									System.out.println("Not valid Option");
									System.out
											.println("Give privacy:\n1.Only Buddies\n2.Public(Not recommended)");
									answer = sc.nextLine();
								}
								@SuppressWarnings("unused")
								Post p;
								PostingRules rule;
								if (answer.equals("1")) {
									rule = new BuddiesPostingRuleImpl();
								} else {
									rule = new PublicPostingRuleImpl();
								}
								try {
									p = new Post(text, currentUser, rule);
								} catch (PostException e) {
									System.out.println(e.getMessage());
								}
							} else if (answer.equals("4")) {
								currentUser.printPosts();
							}
						}
					} else {
						System.out.println("Wrong password");
					}
				} else if (getAdminByUsername(username) != null) { // admin
																	// login
					Admin admin = getAdminByUsername(username);
					System.out
							.println("You have successfully logged in as admin!");
					while (!answer.equals("5")) {
						System.out
								.print("What to do?\n\t1.search user\n\t2.show reports\n\t3.question manage"
										+ "\n\t4.create admin\n\t5.logout\n(Write number)>");
						answer = sc.nextLine();

						// SearchUser
						if (answer.equals("1")) {

							System.out.println("Enter username: ");
							String usr = sc.nextLine();
							while (getUserByUsername(usr) == null) {
								System.out.println("User not found");
								System.out.println("Give another user");
								usr = sc.nextLine();
							}
							User searchedUser = getUserByUsername(usr);
							searchedUser.printPosts();
							// ShowReports
						} else if (answer.equals("2")) {
							System.out.println(admin.getReports().toString());
							// QuestionManagement
						} else if (answer.equals("3")) {
							System.out
									.print("What to do?\n\t1.add question\n\t2.edit question\n\t3.delete question"
											+ "\n\t4.exit\n(Write number)>");
							answer = sc.nextLine();
							while (!answer.equals("4")) {

								// AddQuestion
								if (answer.equals("1")) {

									System.out.println("Give question:");
									String question = sc.nextLine();
									System.out
											.println("Give Options(Seperated by commas , ex option1,option2)");
									String optionsString = sc.nextLine();
									StringTokenizer options = new StringTokenizer(
											optionsString, ",");
									List<String> optionList = new ArrayList<String>();
									while (options.hasMoreTokens()) {
										optionList.add(options.nextToken());
									}
									questions.add(new Question(question,
											optionList));

								}
								// EditQuestion

								// Delete Question
								else if (answer.equals("3")) {
									for (Question q : questions) {
										System.out.println(q
												.getQuestionsAdmin());
									}
									System.out
											.println("Give id of the question you want to delete: ");
									answer = sc.nextLine();
									questions.remove(getQuestionByID(Integer
											.parseInt(answer)));
								}
								System.out
										.print("What to do?\n\t1.add question\n\t2.edit question\n\t3.delete question"
												+ "\n\t4.exit\n(Write number)>");
								answer = sc.nextLine();
							}
						}

					}
				} else {
					System.out.println("User not found");
				}
				System.out
						.print("What to do?\n\t1.Sign Up\n\t2.Sign In\n\t3.exit\n(Write number)>");
				answer = sc.nextLine();
				while (!checkAnswer(answer)) {
					System.out.println("Not valid answer. Try again.\n>");
					answer = sc.nextLine();
				}
			}
		}

	}

	public static User getUserByUsername(String username) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().getUsername().equals(username)) {
				return users.get(i);
			}
		}
		return null;
	}

	public static Admin getAdminByUsername(String username) {
		for (int i = 0; i < admins.size(); i++) {
			if (admins.get(i).getUsername().getUsername().equals(username)) {
				return admins.get(i);
			}
		}
		return null;
	}

	public static Question getQuestionByID(int id) {
		for (int i = 0; i < questions.size(); i++) {
			if (questions.get(i).getQuestionID() == id) {
				return questions.get(i);
			}
		}
		return null;
	}

	public static boolean checkLogin(String username, String password) {
		if (password.equals(getUserByUsername(username).getPassword()
				.getPassword())) {
			return true;
		}
		return false;
	}

	public static boolean checkAdminLogin(String username, String password) {
		if (password.equals(getAdminByUsername(username).getPassword()
				.getPassword())) {
			return true;
		}
		return false;
	}

	private static boolean checkAnswer(String answer) {
		if (answer.trim().equalsIgnoreCase("0")
				|| answer.trim().equalsIgnoreCase("1")
				|| answer.trim().equalsIgnoreCase("2")
				|| answer.trim().equalsIgnoreCase("3")) {
			return true;
		}
		return false;
	}

	private static boolean checkTwoOptions(String answer) {
		if (answer.trim().equalsIgnoreCase("1")
				|| answer.trim().equalsIgnoreCase("2")) {
			return true;
		}
		return false;
	}

	private static int random(int max) {
		Random r = new Random();
		return r.nextInt(max - 1);
	}

}
