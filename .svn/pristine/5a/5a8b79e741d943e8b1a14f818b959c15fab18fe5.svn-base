/*
 * 
 */
package buddychallenge.gui.presenters;

import buddychallenge.dao.QuestionsDAO;
import buddychallenge.entities.Question;
import buddychallenge.entities.User;
import buddychallenge.gui.views.interfaces.AnswerQuestionnaireView;
import buddychallenge.services.SignUpQuestionnaire;

// TODO: Auto-generated Javadoc
/**
 * The Class AnswerQuestionnairePresenter.
 */
public class AnswerQuestionnairePresenter {

	/** The view. */
	private AnswerQuestionnaireView view;

	/** The answer questionnaire serv. */
	private SignUpQuestionnaire service;
	

	/**
	 * Instantiates a new answer questionnaire presenter.
	 *
	 * @param view the view
	 * @param questions the questions
	 * @param currentUser the current user
	 */
	public AnswerQuestionnairePresenter(AnswerQuestionnaireView view,
			QuestionsDAO questions, User currentUser) {
		this.view = view;
		setService(new SignUpQuestionnaire(currentUser,questions,7));
	}

	/**
	 * Instantiates a new answer questionnaire presenter.
	 *
	 * @param view the view
	 */
	public AnswerQuestionnairePresenter(AnswerQuestionnaireView view) {
		this(view, new QuestionsDAO(), null);
	}

	/**
	 * Sets the answer questionnaire serv.
	 */
	public void setService(SignUpQuestionnaire service) {
		this.service = service;
	}

	/**
	 * Start.
	 */
	public void start() {
		view.setAnswerQuestionnairePresenter(this);
		view.open();
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
	 * Submit.
	 */
	public void submit() {
		boolean error = false;
		if(view.getAnswer1() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion1(),view.getAnswer1());
		
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
		
		if(view.getAnswer6() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion6(),view.getAnswer6());
		
		if(view.getAnswer7() == null)
			error = true;
		else
			service.answerQuestion(view.getQuestion7(),view.getAnswer7());
		
		if(error){
			view.showMessage("Not all questions have been answered");
		}
		else{
			view.showMessage("Answers submitted successfully to user "+service.getUser().getUsername().getUsername() );
			service.getUser().setHasAnswered(true);
			view.close();
		}
	}

	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();	
	}

}
