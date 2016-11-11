package profile;

import java.io.InputStream;
import java.sql.SQLException;

public class ProfileBL {
	public static ProfileBL getObject() {
		return new ProfileBL();
	}

	public ProfileVO AddDetail(String firstname, String lastname, String email, String address, String address1,
			String city, String state, String zcode, String gschool, String date, InputStream inputStream)
			throws ClassNotFoundException, SQLException {
		ProfileVO detail = new ProfileVO().setName(firstname).setlastname(lastname).setemail(email).setaddress(address)
				.setaddress1(address1).setctz(city).setstate(state).setzcode(zcode).setgschool(gschool).setdate(date)
				.setphoto(inputStream);
		ProfileDB.getObject().AddDetail(detail);
		return detail;
	}
}
