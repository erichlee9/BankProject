package models;
//used to track what type of account is being created
/*type possibilites:
 * checking, savings
 */
public class AccountType {
	private int typeId;
	private String type;
	
	
public AccountType() {
	// TODO Auto-generated constructor stub
}


public int getTypeId() {
	return typeId;
}


public void setTypeId(int typeId) {
	this.typeId = typeId;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}



}
