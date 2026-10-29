package com.example.hiddenformfeild;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServletHFF")
public class FirstServletHFF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServletHFF() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Set the response type to HTML
        response.setContentType("text/html;charset=UTF-8");
 
        // Read the details entered by the user
        String username = request.getParameter("username");
        String city = request.getParameter("city");
 
        // Check whether the required values are available
        if (username == null || username.isBlank()
                || city == null || city.isBlank()) {
 
            response.getWriter().println("Please enter your name and city.");
            return;
        }
 
        // Display the details and create a second form
        response.getWriter().println(
            "<html><body>"
 
            + "<h2>Confirm Your Details</h2>"
 
            + "<p>Name: " + (username) + "</p>"
            + "<p>City: " + (city) + "</p>"
 
            // These hidden fields carry the values to SecondServlet
            + "<form action='SecondServletHFF' method='post'>"
 
            + "<input type='hidden' name='username' value='"
            + (username) + "'>"
 
            + "<input type='hidden' name='city' value='"
            + (city) + "'>"
 
            + "<button type='submit'>Confirm Details</button>"
 
            + "</form>"
 
            + "</body></html>"
        );
	}
 
}

