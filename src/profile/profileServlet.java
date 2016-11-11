package profile;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class profileServlet
 */
@WebServlet("/profileServlet")
public class profileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int operation = Integer.parseInt(request.getParameter("operation"));
		try {
			switch (operation) {
			case ProfileConstant.ADDDETAILOPERATION:
				AddDetails(request, response);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void AddDetails(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, JSONException {
		JSONObject user = new JSONObject();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String address1 = request.getParameter("address1");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zcode = request.getParameter("zcode");
		String gschool = request.getParameter("gschool");
		String date = request.getParameter("date");
		Part photo = request.getPart("photo");
		InputStream inputStream = null;
		if (photo != null) {
			// debug messages
			System.out.println(photo.getName());
			System.out.println(photo.getSize());
			System.out.println(photo.getContentType());

			// obtains input stream of the upload file
			inputStream = photo.getInputStream();
		}

		try {
			ProfileVO detail = ProfileBL.getObject().AddDetail(firstname, lastname, email, address, address1, city,
					state, zcode, gschool, date, inputStream);
			user.put("name", detail.setName(firstname));
			user.put("status", 1);
		} catch (Exception e) {
			user.put("message", "Internal Error Occur");
			user.put("status", 0);
			e.printStackTrace();
		}

		response.getWriter().print(user);
	}
}
