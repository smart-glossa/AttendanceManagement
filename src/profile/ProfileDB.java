package profile;

import java.sql.SQLException;
import java.sql.Statement;

import dataBasePackage.databaseClass;

public class ProfileDB {

	public static ProfileDB getObject() {
		return new ProfileDB();
	}

	public void AddDetail(ProfileVO detail) throws ClassNotFoundException, SQLException {
		Statement statement = databaseClass.getInstance().getCreatedStatement();
		String query = "insert into profile(firstname,lastname,email,address,address1,city,state,zcode,gschool,date,photo)('"
				+ detail.getName() + "','" + detail.getlastname() + "','" + detail.getemail() + "','"
				+ detail.getaddress() + "','" + detail.getaddress1() + "','" + detail.getcity() + "','"
				+ detail.getstate() + "','" + detail.getzcode() + "','" + detail.getgschool() + "','" + detail.getdate()
				+ "','" + detail.getphoto() + "')";
		statement.execute(query);

	}

}
