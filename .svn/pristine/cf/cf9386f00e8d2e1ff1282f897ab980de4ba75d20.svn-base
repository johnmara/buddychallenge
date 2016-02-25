/*
 * 
 */
package buddychallenge.gui.presenters;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.QuestionsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.dao.UsersDAO;
import buddychallenge.entities.Admin;
import buddychallenge.entities.User;
import buddychallenge.exceptions.UserException;
import buddychallenge.gui.AdminHomePageJPanel;
import buddychallenge.gui.AnswerQuestionnaireJFrame;
import buddychallenge.gui.HomePageJTabbedPane;
import buddychallenge.gui.views.interfaces.SignInView;
import buddychallenge.services.SignInService;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class SignInPresenter.
 */
public class SignInPresenter {
	
	/** The view. */
	private SignInView view;
	
	/** The signin serv. */
	private SignInService service;
	
	/** The users. */
	private UsersDAO users;
	
	/** The posts. */
	private PostsDAO posts;
	
	/** The admins. */
	private AdminsDAO admins;
	
	/** The questions. */
	private QuestionsDAO questions;
	
	/** The reports. */
	private ReportsDAO reports;
	
	/**
	 * Instantiates a new sign in presenter.
	 *
	 * @param view the view
	 * @param users the users
	 * @param posts the posts
	 * @param admins the admins
	 * @param questions the questions
	 */
	public SignInPresenter(SignInView view, UsersDAO users, PostsDAO posts,AdminsDAO admins,QuestionsDAO questions,ReportsDAO reports){
		this.view = view;
		this.users = users;
		this.posts = posts;
		this.admins = admins;
		this.questions = questions;
		this.reports = reports;
	}
	
	/**
	 * Instantiates a new sign in presenter.
	 *
	 * @param view the view
	 */
	public SignInPresenter(SignInView view){
		this(view,new UsersDAO(), new PostsDAO(), new AdminsDAO(),new QuestionsDAO(), new ReportsDAO());
	}
	
	/**
	 * Sets the sign in serv.
	 *
	 * @param signInServ the new sign in serv
	 */
	public void setService(SignInService service){
		service.setUsers(users);
		service.setAdmins(admins);
		this.service = service;
	}
	
	/**
	 * Start.
	 */
	public void start(){
		view.setSignInPresenter(this);
		view.open();
	}
	
	/**
	 * Gets the username string.
	 *
	 * @return the username string
	 */
	public String getUsernameString(){
		return view.getUsernameString();
	}
	
	/**
	 * Gets the password string.
	 *
	 * @return the password string
	 */
	public String getPasswordString(){
		return view.getPasswordString();
	}
	
	/**
	 * Action.
	 *
	 * @return true, if successful
	 */
	public boolean action(){
		Username username = new Username(getUsernameString());
		Password password = new Password(getPasswordString());
		
		boolean error = false;
		SignInService service = new SignInService();
		if(username.isValid() && password.isValid()){
			service.setUsername(username);
			service.setPassword(password);
		}
		else{
			error = true;
			view.showMessage("Wrong Username or Password.");
		}
		
		if(!error){
			setService(service);
			try {
				this.service.signInUser();
				User currentUser = this.service.getCurrentUser();
				if(currentUser == null){
					Admin currentAdmin = this.service.getCurrentAdmin();
					new AdminHomePageJPanel(view.getMainFrame(),currentAdmin,reports,posts).open(); 
				}
				if(currentUser != null){
					if(currentUser.getHasAnswered()){
						view.close();
						new HomePageJTabbedPane(view.getMainFrame(),users, posts, currentUser,reports).open();
					}
					else{
						new AnswerQuestionnairePresenter(new AnswerQuestionnaireJFrame(view.getMainFrame()), questions, currentUser).start();
					}
				}
				

			} catch (UserException ue) {
				view.showMessage(ue.getMessage());
			}
		}
		
		return error;
		
		
	}
	
	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}
}
