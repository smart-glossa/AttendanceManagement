package detailsPackage;

import java.sql.SQLException;
import java.sql.Statement;

import dataBasePackage.databaseClass;

public class DetailsClass {
	public static DetailsClass getObject() {
		return new DetailsClass();
	}

	public void AddDetail(DetailsVO detail) throws ClassNotFoundException, SQLException {
		Statement statement = databaseClass.getInstance().getCreatedStatement();
		String query = "insert into Details(name,email,address,ctz,gschool,date,photo)('" + detail.getName() + "','"
				+ detail.getemail() + "','" + detail.getaddress() + "','" + detail.getctz() + "','"
				+ detail.getgschool() + "','" + detail.getdate() + "','" + detail.getphoto() + "')";
		statement.execute(query);

	}

}
