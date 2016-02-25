package buddychallenge.gui.stubs;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.AddPostPresenter;
import buddychallenge.gui.views.interfaces.AddPostView;

import buddychallenge.rules.PostingRules;

public class AddPostStub implements AddPostView {

	private int messagesSent;
	private boolean opened = false;
	private String text;
	private PostingRules rule;

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
	public void setAddPostPresenter(AddPostPresenter presenter) {

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public PostingRules getRule() {
		return rule;
	}

	public void setRule(PostingRules rule) {
		this.rule = rule;
	}

	@Override
	public JFrame getMainFrame() {
		return null;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

	@Override
	public void showMessage(String message) {
		messagesSent++;
	}

}