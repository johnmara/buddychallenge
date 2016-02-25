/*
 * 
 */
package buddychallenge.dao;

import java.util.ArrayList;
import java.util.List;

import buddychallenge.entities.Admin;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

// TODO: Auto-generated Javadoc
/**
 * The Class AdminsDAO.
 */
public class AdminsDAO {

/** The admin list. */
static List<Admin> adminList;
	
	/**
	 * Instantiates a new admins dao.
	 */
	public AdminsDAO(){
		setAdminList(new ArrayList<Admin>());
		adminList.add(new Admin(new Username("zafiris"), new Password("a199412")));
	}
	
	/**
	 * Instantiates a new admins dao.
	 *
	 * @param adminList the admin list
	 */
	public AdminsDAO(List<Admin> adminList){
		setAdminList(adminList);
	}
	

	/**
	 * Adds the admin.
	 *
	 * @param admin the admin
	 */
	public void addAdmin(Admin admin) {
		adminList.add((Admin)admin);
	}
	
	/**
	 * Removes the admin.
	 *
	 * @param admin the admin
	 */
	public void removeAdmin(Admin admin) {
		adminList.remove((Admin)admin);
	}
	
	/**
	 * Gets the admin by id.
	 *
	 * @param id the id
	 * @return the admin by id
	 */
	public Admin getAdminByID(int id){
		for (Admin a : adminList){
			if (a.getAdminID() == id){
				return a;
			}
		}
		return null;
	}
	
	/**
	 * Gets the admin by username.
	 *
	 * @param adminname the adminname
	 * @return the admin by username
	 */
	public Admin getAdminByUsername(String adminname){
		for (Admin a : adminList){
			if (a.getUsername().getUsername().equals(adminname)){
				return a;
			}
		}
		return null;
	}
	
	/**
	 * Sets the admin list.
	 *
	 * @param adminList the new admin list
	 */
	public void setAdminList(List<Admin> adminList){
		AdminsDAO.adminList = new ArrayList<Admin>(adminList);
	}
	
	/**
	 * Gets the admin list.
	 *
	 * @return the admin list
	 */
	public List<Admin> getAdminList() {
		return new ArrayList<Admin>(adminList);
	}
}
