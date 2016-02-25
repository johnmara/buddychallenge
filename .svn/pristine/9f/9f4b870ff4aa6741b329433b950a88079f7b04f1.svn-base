package buddychallenge.gui.stubs;

import javax.swing.JFrame;

import buddychallenge.entities.Question;
import buddychallenge.gui.presenters.BuddyRequestPresenter;
import buddychallenge.gui.views.interfaces.BuddyRequestView;

public class BuddyRequestStub implements BuddyRequestView {

	private boolean opened = false;
	private int messagesSent;
	private Question q1,q2,q3,q4,q5;
	private String a1,a2,a3,a4,a5;

	@Override
	public void open() {
		opened = true;

	}

	public boolean isOpened() {
		return opened;
	}

	@Override
	public void close() {
		opened = false;

	}

	@Override
	public void setBuddyRequestPresenter(
			BuddyRequestPresenter buddyRequestPresenter) {

	}

	@Override
	public Question getQuestion1() {
		return q1;
	}

	@Override
	public String getAnswer1() {
		// TODO Auto-generated method stub
		return a1;
	}

	@Override
	public Question getQuestion2() {
		// TODO Auto-generated method stub
		return q2;
	}

	@Override
	public String getAnswer2() {
		// TODO Auto-generated method stub
		return a2;
	}

	@Override
	public Question getQuestion3() {
		// TODO Auto-generated method stub
		return q3;
	}

	@Override
	public String getAnswer3() {
		// TODO Auto-generated method stub
		return a3;
	}

	@Override
	public Question getQuestion4() {
		// TODO Auto-generated method stub
		return q4;
	}

	@Override
	public String getAnswer4() {
		// TODO Auto-generated method stub
		return a4;
	}

	@Override
	public Question getQuestion5() {
		// TODO Auto-generated method stub
		return q5;
	}

	@Override
	public String getAnswer5() {
		// TODO Auto-generated method stub
		return a5;
	}

	@Override
	public void showMessage(String message) {
		messagesSent++;
	}
	
	public int getMessagesSent() {
		return messagesSent;
	}


	@Override
	public JFrame getPreviusFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQ1(Question q1) {
		this.q1 = q1;
	}

	public void setQ2(Question q2) {
		this.q2 = q2;
	}

	public void setQ3(Question q3) {
		this.q3 = q3;
	}

	public void setQ4(Question q4) {
		this.q4 = q4;
	}

	public void setQ5(Question q5) {
		this.q5 = q5;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public void setA4(String a4) {
		this.a4 = a4;
	}

	public void setA5(String a5) {
		this.a5 = a5;
	}

}
