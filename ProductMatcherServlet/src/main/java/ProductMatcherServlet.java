import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productMatcherServlet.DBConnection;


@WebServlet("/ProductMatcherServlet")
public class ProductMatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductMatcherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Your searched  Product Details<h3>");
		try {
			Connection con = DBConnection.getMyConnection();
			int id = Integer.parseInt(request.getParameter("pId"));
			String str = "select * from eproduct";
			Statement ps = con.createStatement();
			ResultSet ans = ps.executeQuery(str);
			out.println("<table border=2 padding=2>");
			out.println("<tr><th>ID</th><th>Product Name</th><th>Price</th></tr>");
			while (ans.next()) {
				if (ans.getInt("ID") == id) {
					out.println("<tr>");
					out.print("<td>" + ans.getInt("ID") + "</td>");
					out.print("<td>" + ans.getString("name") + "</td>");
					out.print("<td>" + ans.getInt("price") + "</td>");
					out.println("</tr>");
				}
				}
			out.println("</table>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}