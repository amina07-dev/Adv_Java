package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

		String username = request.getParameter("username");

		Cookie cookie = new Cookie("username", username);// new Cookie("CookieName",cookieValue)

		cookie.setMaxAge(30 * 60);

		response.addCookie(cookie);

		response.getWriter()
				.print("<html> <body>" + "<h2>Welcome, " + username + "!</h2>"
						+ "<form action='SecondServlet' method='get'>" + "<button type='submit'>Read Cookies</button>"
						+ "</form>" + "</body></html>");

	}

}
