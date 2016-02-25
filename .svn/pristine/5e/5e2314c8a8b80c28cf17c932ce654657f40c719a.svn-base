package buddychallenge.services;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.dao.PostsDAO;
import buddychallenge.dao.ReportsDAO;
import buddychallenge.entities.Report;

public class ManageReportsService {
	private ReportsDAO reports;
	private PostsDAO posts;
	
	public ManageReportsService(ReportsDAO reports, PostsDAO posts){
		this.reports = reports;
		this.posts = posts;
	}

	public ReportsDAO getReports() {
		return reports;
	}

	public void setReports(ReportsDAO reports) {
		this.reports = reports;
	}

	public Report getReportByID(int id) {	
		return reports.getReportByID(id);
	}

	public List<String> getReportsListString() {
		List<String> reportsListString = new ArrayList<String>();
		for(Report r : reports.getList()){
			reportsListString.add("ID: "+r.getReportID()+",Post: "+r.getPost().getText());
		}
		return reportsListString;
	}

	public void deletePost(Report r) {
		posts.deletePost(r.getPost());
		reports.deleteReport(r.getReportID());
	}
	
	public void deleteReport(Report r) {
		reports.deleteReport(r.getReportID());
	}
}
