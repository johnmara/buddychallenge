package buddychallenge.gui.stubs;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.gui.presenters.ManageReportsPresenter;
import buddychallenge.gui.views.interfaces.ManageReportsView;

public class ManageReportsStub implements ManageReportsView{
	
	private boolean opened = false;
	private int messagesSent;
	private String value;
	@SuppressWarnings("unused")
	private List<String> reports;
	
	@Override
	public void open() {
		opened = true;
	}

	@Override
	public void close() {
		opened = false;
		
	}

	@Override
	public void setManageReportsPresenter(ManageReportsPresenter presenter) {
		
	}
	
	public void setReports(List<String> list){
		this.reports = new ArrayList<String>(list);
	}

	@Override
	public void showMessage(String message) {
		messagesSent++;
		
	}

	@Override
	public String getSelectedValue() {
		return value;
	}
	
	public boolean isOpened(){
		return opened;
	}
	
	public int getMessagesSent(){
		return messagesSent;
	}
	
	public void setSelectedValue(String value){
		this.value = value;
	}

}
