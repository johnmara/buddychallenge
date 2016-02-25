package buddychallenge.gui.stubs;

import javax.swing.JFrame;

import buddychallenge.gui.presenters.SearchPresenter;
import buddychallenge.gui.views.interfaces.SearchView;

public class SearchStub implements SearchView {
	
	private int messagesSent;
	private boolean opened = false;
	private String profileNameString;
	

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
	public void setSearchPresenter(SearchPresenter presenter) {
		
	}

	public void setProfileNameString(String profileNameString) {
		this.profileNameString = profileNameString;
	}
	
	public String getProfileNameString() {
		return this.profileNameString;
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

	@Override
	public String getSelectedValue() {
		return null;
	}


}