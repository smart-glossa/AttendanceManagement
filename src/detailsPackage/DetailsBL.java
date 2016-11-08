package detailsPackage;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;


public class DetailsBL {
	public static DetailsBL getObject() {
		return new DetailsBL();
	}

	public DetailsVO AddDetail(String name, String email, String address, String ctz, String gschool, String date,
			InputStream inputStream) throws ClassNotFoundException, SQLException {
		DetailsVO detail = new DetailsVO().setName(name).setemail(email).setaddress(address).setctz(ctz).setgschool(gschool).setdate(date).setphoto(inputStream);
		DetailsClass.getObject().AddDetail(detail);
		return detail;
	}
}
