package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calculator")
public class Calculator extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String description = req.getParameter("description");
		float price = Float.parseFloat(req.getParameter("price"));
		float discountPercent = Float.parseFloat(req.getParameter("discountPercent"));
		float discountAmount = (float) (price * discountPercent * 0.01);
		float result = price - discountAmount;
		req.setAttribute("result", result);
		req.setAttribute("discountAmount", discountAmount);
		RequestDispatcher rd = req.getRequestDispatcher("result");		
		rd.forward(req, resp); 
		System.out.println(result);
		
	}
	
}
