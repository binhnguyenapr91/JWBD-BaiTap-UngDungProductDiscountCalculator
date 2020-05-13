package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/result")
public class Result extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String description = req.getParameter("description");
		String price = req.getParameter("price");
		String discountPercent = req.getParameter("discountPercent");
		float discountAmount = (float) req.getAttribute("discountAmount");
		float result =(float)req.getAttribute("result");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Result Page</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h2>Discount Calculator</h2>");
		writer.println("Description: "+description+"</br>");
		writer.println("Price: "+price+"</br>");
		writer.println("Discount amount: "+discountAmount+"</br>");
		writer.println("Discount percent"+discountPercent+"</br>");
		writer.println("Need to pay: "+result+"</br>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
