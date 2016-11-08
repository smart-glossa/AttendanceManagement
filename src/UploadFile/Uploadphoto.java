package UploadFile;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Uploadphoto
 */
@WebServlet("/Uploadphoto")
@MultipartConfig(maxFileSize = 16177215) 
public class Uploadphoto extends HttpServlet {
	 
	  
	 //  private String dbURL = "jdbc:mysql://localhost:3306/attendence";
	   // private String dbUser = "root";
	   // private String dbPass = "root";
	     
	    protected void doPost(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {
	//         gets values of text fields
	        String firstname = request.getParameter("firstname");
	        String lastname = request.getParameter("lastname");
	         
	        InputStream inputStream = null; // input stream of the upload file
	         
	        // obtains the upload file part in this multipart request
	        Part photo = request.getPart("photo");
	        if (photo != null) {
	            // prints out some information for debugging
	            System.out.println(photo.getName());
	            System.out.println(photo.getSize());
	            System.out.println(photo.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = photo.getInputStream();
	        }
	         
	        Connection conn = null; // connection to the database
	        String message = null;  // message will be sent back to client
	        PreparedStatement statement=null;
	        try {
	            // connects to the database
	        	 //Class.forName("com.mysql.jdbc.Driver");
	        	
					try {
						Class.forName("com.mysql.jdbc.Driver");
						 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", "root");
						 String sql = "INSERT INTO contacts(firstname, lastname, photo) values (?, ?, ?)";
						 conn.prepareStatement(sql);
				            statement.setString(1, firstname);
				            statement.setString(2, lastname);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	           // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	           
					 
	            // constructs SQL statement
	           
	             
	            if (inputStream != null) {
	                // fetches input stream of the upload file for the blob column
	                statement.setBlob(3, inputStream);
	            }
	 
	            // sends the statement to the database server
			int row = statement.executeUpdate();
	            if (row > 0) {
	                message = "File uploaded and saved into database";
	            }
	        } catch (SQLException ex) {
	            message = "ERROR: " + ex.getMessage();
	            ex.printStackTrace();
	            }
	            // sets the message in request scope
	            request.setAttribute("Message", message);
	             
	            // forwards to the message page
	            getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
	        }
	    }