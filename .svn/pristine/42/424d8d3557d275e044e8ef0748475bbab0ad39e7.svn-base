package buddychallenge.gui.presenters;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.entities.Question;
import buddychallenge.gui.views.interfaces.QuestionManageView;
import buddychallenge.services.QuestionManageService;


public class QuestionManagePresenter {

	private QuestionManageView view;
	private QuestionManageService service;

	public QuestionManagePresenter(QuestionManageView view) {
		this.view = view;

	}

	public void start() {
		view.setPresenter(this);
		view.open();
	}

	public void setService(QuestionManageService service) {
		this.service = service;
	}

	public void addQuestion() {
		Question q = new Question();
		q.setQuestion(view.getQuestionString());
		List<String> options = new ArrayList<String>();
		options.add(view.getOption1String());
		options.add(view.getOption2String());
		q.setOptions(options);
		this.setService(new QuestionManageService(q));
		this.service.addQuestion();
	}
	
	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}

}
