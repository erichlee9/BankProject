package models;
//used to track the status of accounts
/*status possibilities:
 * pending, open, closed, denied
 */
public class AccountStatus {
	private int statusId;
	private String status;
	
	
public AccountStatus() {
	// TODO Auto-generated constructor stub
}


public int getStatusId() {
	return statusId;
}


public void setStatusId(int statusId) {
	this.statusId = statusId;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}



}
