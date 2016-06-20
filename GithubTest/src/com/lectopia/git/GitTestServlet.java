package com.lectopia.git;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GitTestServlet
 */
public class GitTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Test7950");
		System.out.println("Test0603");
		System.out.println("±ÇÇÑ");
		System.out.println("Git");
		System.out.println("PULL");
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
