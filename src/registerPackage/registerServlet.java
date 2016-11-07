package registerPackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
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
			case registerConstant.REQ_INSERTUSEROPERATION:
				UserRegister(request, response);
				break;
			case registerConstant.REQ_USERLOGINOPERATION:
				Userlogin(request, response);

			default:
				break;
			}
		} catch (Exception e) {

		}
	}

	private void UserRegister(HttpServletRequest request, HttpServletResponse response)
			throws JSONException, IOException {

		JSONObject reg = new JSONObject();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cfmpassword = request.getParameter("cfmpassword");
		try {
			registerVO register = registerBL.getObject().RegisterUser(firstname, lastname, email, password,
					cfmpassword);
			// reg.put("firstname", register.Getfirstname());
			reg.put("status", 1);

			
		} catch (Exception e) {
			reg.put("message", "Internal Error Occur");
			reg.put("status", 0);
		}
		response.getWriter().print(reg);
	}

	private void Userlogin(HttpServletRequest request, HttpServletResponse response) throws JSONException, IOException {
		JSONObject all = new JSONObject();
		JSONArray logins = new JSONArray();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			List<registerVO> alluser = registerBL.getObject().Userlogin(email, password);
			JSONObject get = new JSONObject();
			for (registerVO vo : alluser) {

				if (vo.GetuserId() != 1l) {
					if (email.equals(email) && password.equals(password)) {
                        all.put("status", 1); 
						get.put("userName", vo.Getfirstname());
						get.put("lastname", vo.Getlastname());
						
						logins.put(get);
					} else {
						JSONObject res = new JSONObject();
						res.put("Message", "invalid password/userName");
						logins.put(res);

					}
					// logins.put(get);

				}
			}
		} catch (Exception e) {
			all.put("Status", 0);
			all.put("Message", "Internal Error Occurs");
			e.printStackTrace();
		}
		response.getWriter().print(logins);
	}

}
