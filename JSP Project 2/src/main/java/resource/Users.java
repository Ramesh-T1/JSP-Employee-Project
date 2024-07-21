package resource;

public class Users
{
  private int id;
  private String username;
  private String email;

public Users(int id, String username, String email) {
	this.id = id;
	this.username = username;
	this.email = email;
}

public Users(String username, String email) {
	this.username = username;
	this.email = email;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
