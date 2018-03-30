package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class loginServlet
 */

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out =  response.getWriter();
		out.append("USER_NAME:"+request.getParameter("userName"));
		out.flush();
		//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		//Class.forName("oracle.jdbc.driver.OracleDriver");  
		//String driverName="com.mysql.jdbc.Driver";
		Class.forName("com.mysql.jdbc.Driver");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
