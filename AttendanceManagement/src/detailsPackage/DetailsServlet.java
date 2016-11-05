package detailsPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/DetailsServlet")
@MultipartConfig(maxFileSize = 16177215) 
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = -1623656324694499109L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int operation=Integer.parseInt(request.getParameter("operation"));
		try
		{
			switch (operation) {
			case DetailsConstant.ADDDETAILOPERATION:
				AddDetails(request,response);
				break;

			default:
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private void AddDetails(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	String ctz=request.getParameter("ctz");
	String gschool=request.getParameter("gschool");
	String date=request.getParameter("date");
	Part photo=request.getPart("photo");
	try
	{
		
	}catch(Exception e)
	{
		
	}
	}

}
