package registerPackage;

import java.sql.SQLException;
import java.util.List;

import org.json.JSONException;

import registerPackage.registerClass;

public class registerBL {
	public static registerBL getObject() {
		return new registerBL();
	}

	public registerVO RegisterUser(String firstname, String lastname, String email, String password, String cfmpassword)
			throws ClassNotFoundException, SQLException {
		registerVO register = new registerVO().Setfirstname(firstname).Setlastname(lastname).Setemail(email)
				.Setpassword(password).Setcfmpassword(cfmpassword);
		registerClass.getObject().RegisterUser(register);
		return register;

	}

	public List<registerVO> Userlogin(String email, String password)
			throws ClassNotFoundException, SQLException, JSONException {
		return registerClass.getObject().UserLogin(email, password);
	}
}
