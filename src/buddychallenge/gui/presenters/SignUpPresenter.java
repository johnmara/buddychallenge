/*
 * 
 */
package buddychallenge.gui.presenters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import buddychallenge.dao.QuestionsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.exceptions.UserException;
import buddychallenge.gui.AnswerQuestionnaireJFrame;
import buddychallenge.gui.SignUpJPanel;
import buddychallenge.gui.views.interfaces.SignUpView;
import buddychallenge.services.SignUpService;
import buddychallenge.util.EmailAddress;
import buddychallenge.util.Gender;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class SignUpPresenter.
 */
public class SignUpPresenter {

	/** The view. */
	private SignUpView view;

	/** The signup serv. */
	private SignUpService service;
	
	/** The users. */
	private UsersDAO users;
	
	/** The questions. */
	private QuestionsDAO questions;

	/**
	 * Instantiates a new sign up presenter.
	 *
	 * @param view the view
	 * @param users the users
	 * @param questions the questions
	 */
	public SignUpPresenter(SignUpView view, UsersDAO users,
			QuestionsDAO questions) {
		this.view = view;
		this.users = users;
		this.questions = questions;
	}

	/**
	 * Instantiates a new sign up presenter.
	 *
	 * @param view the view
	 */
	public SignUpPresenter(SignUpView view) {
		this(view, new UsersDAO(), new QuestionsDAO());
	}

	/**
	 * Sets the sign up serv.
	 *
	 * @param signupServ the new sign up serv
	 */
	public void setService(SignUpService service) {
		service.setUsers(users);
		this.service = service;
	}

	/**
	 * Start.
	 */
	public void start() {
		view.setSignUpPresenter(this);
		view.open();
	}

	/**
	 * Action.
	 */
	public boolean action() throws UserException{

		Username username = new Username(getUsernameString());
		Password password = new Password(getPasswordString());
		EmailAddress email = new EmailAddress(getEmailString());
		String firstname = new String(getFirstName());
		String lastname = new String(getLastName());
		Gender gender = getGenderPos() == 0 ? Gender.Gender1
				: Gender.Gender2;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		Date date = null;
		boolean error = false;
		try {
			date = sdf.parse(getBirthDateString());
		} catch (ParseException pe) {
			view.showMessage(pe.getMessage());
			error = true;
		}
			
		setService(new SignUpService());
		
		if (username.isValid())
			service.setUsername(username);
		else{
			view.showMessage("Invalid Username");
			error = true;
		}
		if (password.isValid()){
			service.setPassword(password);
		}
		else{
			view.showMessage("Invalid password");
			error = true;
		}
		
		if (email.isValid())
			service.setEmail(email);
		else{
			view.showMessage("Invalid email");
			error = true;
		}
		service.setFirstname(firstname);
		service.setLastname(lastname);
		service.setGender(gender);

		if (date != null)
			service.setBirthdate(date);
		else{
			view.showMessage("Invalid date");
			error = true;
		}		
		if(!error){
			
				service.signUpUser();
				view.showMessage("User "+ username.getUsername() +" created successfully");
				view.close();
				if(view instanceof SignUpJPanel){
						new AnswerQuestionnairePresenter(new AnswerQuestionnaireJFrame(view.getMainFrame()), questions, 
					users.getUserByUsername(username.toString())).start();
				}
			
		}
		
		return error;
	}
	
	public String getUsernameString(){
		return view.getUsernameString();
	}
	
	public String getPasswordString() {
		return view.getPasswordString();
	}
	
	public String getEmailString() {
		return view.getEmailString();
	}
	
	public String getFirstName() {
		return view.getFirstName();
	}
	
	public String getLastName() {
		return view.getLastName();
	}
	
	public int getGenderPos() {
		return view.getGenderPos();
	}
	
	public String getBirthDateString() {
		return view.getBirthDateString();
	}

	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}

}
