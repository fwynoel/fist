package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = this.getServletConfig().getInitParameter("dburl");
			String url="jdbc:mysql://localhost:3306/"+dburl;
			//String dbname="root";
			//String password="fwynoel";
			String dbname = getServletConfig().getInitParameter("dbname");
			String password = getServletConfig().getInitParameter("password");
			
			String init_param = getServletConfig().getInitParameter("dbname");
	        String init_param1 = getServletConfig().getServletContext().getInitParameter("dbname");
	        String init_param2 = getServletContext().getInitParameter("dbname");
			
	        System.out.println("dburl:"+dburl);
			System.out.println("dbname:"+dbname);
			System.out.println("password:"+password);
			System.out.println("init_param:"+init_param);
			System.out.println("init_param1:"+init_param1);
			System.out.println("init_param2:"+init_param2);
			Connection conn = DriverManager.getConnection(url,dbname,password) ;
			if(conn != null){
				out.println("success!");
			}else{
				out.println("fail!");
			}
			out.flush();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
