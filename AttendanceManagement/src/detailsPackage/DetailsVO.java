package detailsPackage;

import java.sql.Blob;

import registerPackage.registerBL;

public class DetailsVO {

	int userId = 1;
	String name;
	String email;
	String address;
	String ctz;
	String gschool;
	String date;
	Blob photo;

	public int getuserId() {
		return userId;
	}

	public DetailsVO setuserId(int userId) {
		this.userId = userId;
		return this;
	}

	public String getName() {
		return name;
	}

	public DetailsVO setName(String name) {
		this.name = name;
		return this;
	}

	public String getemail() {
		return email;
	}

	public DetailsVO setemail(String email) {
		this.email = email;
		return this;
	}

	public String getaddress() {
		return address;
	}

	public DetailsVO setaddress(String address) {
		this.address = address;
		return this;
	}

	public String getctz() {
		return ctz;
	}

	public DetailsVO setctz(String ctz) {
		this.ctz = ctz;
		return this;
	}

	public String getgschool() {
		return gschool;
	}

	public DetailsVO setgschool(String gschool) {
		this.gschool = gschool;
		return this;
	}

	public String getdate() {
		return date;
	}

	public DetailsVO setdate(String date) {
		this.date = date;
		return this;
	}

	public Blob getphoto() {
		return photo;
	}

	public DetailsVO setphoto(Blob photo) {
		this.photo = photo;
		return this;
	}
}
