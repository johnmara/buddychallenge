package buddychallenge.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import buddychallenge.entities.Report;

public class ReportsDAO {

	public static List<Report> reportList;
	
	public ReportsDAO(){
		reportList = new ArrayList<Report>(); 
	}
	
	public void addReport(Report r){
		reportList.add(r);
	}
	
	public Report getReportByID(int id){
		for(Report r: reportList){
			if(r.getReportID() == id){
				return r;
			}
		}
		return null;
	}
	
	public List<Report> getList(){
		return new ArrayList<Report>(reportList);
	}
	
	public void deleteReport(int id){
		
		Iterator<Report> iter = reportList.iterator();

		while (iter.hasNext()) {
		    Report r = iter.next();

		    if (r.getReportID() == id)
		        iter.remove();
		}
		
		/*for(Report r: reportList){
			if(r.getReportID() == id){
				reportList.remove(r);
			}
		}*/
	}
}
