/*
 * 
 */
package buddychallenge.gui.presenters;

import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.gui.views.interfaces.BuddyRequestView;
import buddychallenge.services.BuddyRequestService;

// TODO: Auto-generated Javadoc
/**
 * The Class BuddyRequestPresenter.
 */
public class BuddyRequestPresenter {
	
	/** The view. */
	private BuddyRequestView view;
	
	/** The service. */
	private BuddyRequestService service;
	
	/** The receiver. */
	private User sender, receiver;
	
	/**
	 * Instantiates a new buddy request presenter.
	 *
	 * @param view the view
	 * @param sender the sender
	 * @param receiver the receiver
	 */
	public BuddyRequestPresenter(BuddyRequestView view, User sender, User receiver){
		this.view = view;
		this.sender = sender;
		this.receiver = receiver;
		setService(new BuddyRequestService(this.sender,this.receiver));
	}
	
	public BuddyRequestPresenter(BuddyRequestView view){
		this(view, null, null);
	}
	
	public void setSender(User sender) {
		this.sender = sender;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	/**
	 * Start.
	 */
	public void start(){
		view.setBuddyRequestPresenter(this);
		view.open();
	}
	
	/**
	 * Sets the buddy request service.
	 *
	 * @param service the new buddy request service
	 */
	public void setService(BuddyRequestService service){
		this.service = service;
	}

	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public Question getQuestion() {
		return service.getQuestion();
	}

	/**
	 * Send questions and their answers to the service.
	 */
	public void sendQuestions() {
		boolean error = false;
		
		if(view.getAnswer1() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion1(), view.getAnswer1());
		
		if(view.getAnswer2() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion2(),view.getAnswer2());
		
		if(view.getAnswer3() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion3(),view.getAnswer3());
		
		if(view.getAnswer4() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion4(),view.getAnswer4());
		
		if(view.getAnswer5() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion5(),view.getAnswer5());
		
		service.calculate();
		
		if(error){
			view.showMessage("Not all questions have been answered");
		}
		else{
			if(service.isResult()){
				view.showMessage("You have a new Buddy");
				view.close();
			}
			else{
				view.showMessage("You don't match");
				view.close();
			}
		}
		
	}

	public void cancel() {
		view.close();
		
	}
	
}
