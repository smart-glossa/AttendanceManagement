package registerPackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import dataBasePackage.databaseClass;

public class registerClass {

	public static registerClass getObject() {
		return new registerClass();

	}

	public void RegisterUser(registerVO user) throws ClassNotFoundException, SQLException {
		Statement statement = databaseClass.getInstance().getCreatedStatement();
		String query = "Insert into register(firstname,lastname,email,password,cfmpassword)value('"
				+ user.Getfirstname() + "'," + "'" + user.Getlastname() + "','" + user.Getemail() + "','"
				+ user.Getpassword() + "','" + user.Getcfmpassword() + "')";
		statement.execute(query);
	}

	public List<registerVO> UserLogin(String email, String password)
			throws ClassNotFoundException, SQLException, JSONException {
		List<registerVO> user = new ArrayList<registerVO>();

		Statement statement = databaseClass.getInstance().getCreatedStatement();
		String query = "select * from register where email='" + email + "'and password='" + password + "'";
		ResultSet rs = statement.executeQuery(query);
		if (rs.next()) {
			registerVO users = new registerVO();
			users.Setfirstname(rs.getString("firstname"));
			users.Setlastname(rs.getString("lastname"));
			user.add(users);

		}
		return user;
	}
}
