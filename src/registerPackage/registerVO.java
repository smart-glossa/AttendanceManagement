package registerPackage;

import java.io.FileFilter;

public class registerVO {
	int userId;
	String firstname;
	String lastname;
	String email;
	String password;
	String cfmpassword;

	public int GetuserId() {
		return userId;
	}

	public registerVO SetuserId(int userId) {
		this.userId = userId;
		return this;
	}

	public String Getfirstname() {
		return firstname;
	}

	public registerVO Setfirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public String Getlastname() {
		return lastname;
	}

	public registerVO Setlastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public String Getemail() {
		return email;
	}

	public registerVO Setemail(String email) {
		this.email = email;
		return this;
	}

	public String Getpassword() {
		return password;
	}

	public registerVO Setpassword(String password) {
		this.password = password;
		return this;
	}

	public String Getcfmpassword() {
		return cfmpassword;
	}

	public registerVO Setcfmpassword(String cfmpassword) {
		this.cfmpassword = cfmpassword;
		return this;
	}
}
