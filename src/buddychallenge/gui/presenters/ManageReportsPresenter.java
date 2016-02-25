package buddychallenge.gui.presenters;

import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Report;
import buddychallenge.gui.views.interfaces.ManageReportsView;
import buddychallenge.services.ManageReportsService;

public class ManageReportsPresenter {
	ManageReportsView view;
	ManageReportsService service;
	Report r;

	public ManageReportsPresenter(ManageReportsView view, ReportsDAO reports,
			PostsDAO posts) {
		this.view = view;
		setService(new ManageReportsService(reports, posts));
	}

	public void start() {
		view.setManageReportsPresenter(this);
		view.open();
	}

	public void setService(ManageReportsService service) {
		this.service = service;
	}

	public List<String> getReportsList() {
		return service.getReportsListString();
	}

	public void showReportDetails() {
		if(view.getSelectedValue() != null){
			String reportText = view.getSelectedValue();
			int pos1 = reportText.indexOf(":");
			int pos2 = reportText.indexOf(",");
			reportText = reportText.substring(pos1+1,pos2);
			reportText = reportText.trim();
			r = service.getReportByID(Integer.parseInt(reportText));
			view.showMessage("ID: "+r.getReportID()+",Post: "+r.getPost().getText()+"\nReason: "+r.getReason()+"\nCategory: "+r.getCategory().toString() + "\nCreator: "+r.getPost().getUser().getFirstname()+" "+r.getPost().getUser().getLastname()+"\nReported By: "+r.getUser().getFirstname()+" "+r.getUser().getLastname());		
		}
	}

	public void deletePost() {
		service.deletePost(r);
	}

	public void deleteReport() {
		service.deleteReport(r);
	}

	public void cancel() {
		view.close();
		
	}

}
