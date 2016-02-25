package buddychallenge.gui.presenters;

import buddychallenge.gui.views.interfaces.AdminManageView;
import buddychallenge.services.AdminManageService;
import buddychallenge.util.Password;
import buddychallenge.util.Username;

public class AdminManagePresenter {

	private AdminManageView view;
	private AdminManageService service;

	public AdminManagePresenter(AdminManageView view) {
		this.view = view;

	}

	public void start() {
		view.setPresenter(this);
		view.open();
	}

	public void setService(AdminManageService service) {
		this.service = service;
	}

	public void addAdmin() {
		this.setService(new AdminManageService(new Username(view
				.getUserNameString()), new Password(view.getPasswordString())));
		this.service.addAdmin();
	}
	
	/**
	 * Cancel.
	 */
	public void cancel() {
		view.close();
	}

}
