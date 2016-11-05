package detailsPackage;

import java.sql.Blob;

public class DetailsBL {
	public static DetailsBL getObject(){
		return new DetailsBL();
	}
public DetailsVO AddDetail(String name,String email,String address,String ctz,String gschool,String date,Blob photo){
	DetailsVO detail=new DetailsVO().setName(name).setemail(email).setaddress(address).setctz(ctz).setgschool(gschool).setdate(date).setphoto(photo);
	DetailsClass.getObject().
}
}
