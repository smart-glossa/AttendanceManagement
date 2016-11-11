package profile;

import java.io.InputStream;

public class ProfileVO {

	int userId = 1;
	String firstname;
	String lastname;
	String email;
	String address;
	String address1;
	String city;
	String state;
	String zcode;
	String gschool;
	String date;
	InputStream photo;

	// userId
	public int getuserId() {
		return userId;
	}

	public ProfileVO setuserId(int userId) {
		this.userId = userId;
		return this;
	}

	// firstname
	public String getName() {
		return firstname;
	}

	public ProfileVO setName(String firstname) {
		this.firstname = firstname;
		return this;
	}

	// lastname
	public String getlastname() {
		return lastname;
	}

	public ProfileVO setlastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	// email
	public String getemail() {
		return email;
	}

	public ProfileVO setemail(String email) {
		this.email = email;
		return this;
	}

	// address
	public String getaddress() {
		return address;
	}

	public ProfileVO setaddress(String address) {
		this.address = address;
		return this;
	}

	// address1
	public String getaddress1() {
		return address1;
	}

	public ProfileVO setaddress1(String address1) {
		this.address1 = address1;
		return this;
	}

	// city
	public String getcity() {
		return city;
	}

	public ProfileVO setctz(String city) {
		this.city = city;
		return this;
	}

	// state
	public String getstate() {
		return state;
	}

	public ProfileVO setstate(String state) {
		this.state = state;
		return this;
	}

	// zcode
	public String getzcode() {
		return zcode;
	}

	public ProfileVO setzcode(String zcode) {
		this.zcode = zcode;
		return this;
	}

	// gschool
	public String getgschool() {
		return gschool;
	}

	public ProfileVO setgschool(String gschool) {
		this.gschool = gschool;
		return this;
	}

	// date
	public String getdate() {
		return date;
	}

	public ProfileVO setdate(String date) {
		this.date = date;
		return this;
	}

	// photo
	public InputStream getphoto() {
		return photo;
	}

	public ProfileVO setphoto(InputStream inputStream) {
		this.photo = inputStream;
		return this;
	}
}
