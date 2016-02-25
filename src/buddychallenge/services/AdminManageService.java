package buddychallenge.services;

import buddychallenge.dao.AdminsDAO;
import buddychallenge.entities.Admin;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class AdminManageService {
	
	private Username username;
	private Password password;
	
	private AdminsDAO admins;
	
	public AdminManageService(Username username, Password password){
		this.setUsername(username);
		this.setPassword(password);
		this.admins = new AdminsDAO();
	}
	
	public AdminManageService(){
		this(null,null);
	}

	public void addAdmin() {
		admins.addAdmin(new Admin(username, password));
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
		this.username = username;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

}
