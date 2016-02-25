/*
 * Describes An Admin Entity.
 */
package buddychallenge.entities;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class Admin.
 */
public class Admin {
	
	/** The id. */
	private static int id;
	
	/** The admin id. */
	private int adminID;
	
	/** The username. */
	private Username username;
	
	/** The password. */
	private Password password;
	
	/** The reports. */
	private static List<Report> reports;
	
	/**
	 * Instantiates a new admin.
	 *
	 * @param username the username
	 * @param password the password
	 */
	public Admin(Username username, Password password) {		
		adminID = id++;
		setUsername(username);
		setPassword(password);
		setReports(new ArrayList<Report>());
	}
	
	/**
	 * Instantiates a new admin.
	 */
	public Admin() {		
		adminID = id++;
		reports = new ArrayList<Report>();
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public Username getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(Username username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(Password password) {
		this.password = password;
	}
	
	/**
	 * Sets the reports.
	 *
	 * @param reports the new reports
	 */
	public void setReports(List<Report> reports) {
		Admin.reports = new ArrayList<Report>(reports);
	}

	/**
	 * Gets the admin id.
	 *
	 * @return the admin id
	 */
	public int getAdminID() {
		return adminID;
	}
	
	/**
	 * Creates the question.
	 *
	 * @param question the question
	 * @param options the options
	 * @return the question
	 */
	public Question createQuestion(String question, List<String>options) {
		return new Question(question,options);
	}
	
	/**
	 * Adds the option.
	 *
	 * @param q the q
	 * @param option the option
	 * @return the question
	 */
	public Question addOption(Question q, String option){
		q.addOption(option);
		return q;
	}
	
	/**
	 * Removes the option.
	 *
	 * @param q the q
	 * @param option the option
	 * @return the question
	 */
	public Question removeOption(Question q, String option){
		q.removeOption(option);
		return q;
	}
	
	/**
	 * Adds the report.
	 *
	 * @param report the report
	 */
	public void addReport(Report report){
		if(report != null){
			reports.add(report);
		}
	}
	
	/**
	 * Gets the reports.
	 *
	 * @return the reports
	 */
	public List<Report> getReports(){
		return new ArrayList<Report>(reports);
	}
	
	/**
	 * Delete post.
	 *
	 * @param report the report
	 */
	public void deletePost(Report report){
		report.getPost().getUser().deletePost(report.getPost());//Bow
		deleteReport(report);
	}
	
	/**
	 * Delete report.
	 *
	 * @param report the report
	 */
	public void deleteReport(Report report){
		if(reports.contains(report))
			reports.remove(report);
	}
}
