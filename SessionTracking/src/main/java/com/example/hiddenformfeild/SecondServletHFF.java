package com.example.hiddenformfeild;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SecondServletHFF
 */
@WebServlet("/SecondServletHFF")
public class SecondServletHFF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServletHFF() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set the response type to HTML
        response.setContentType("text/html;charset=UTF-8");
 
        // Read the values submitted through the hidden fields
        String username = request.getParameter("username");
        String city = request.getParameter("city");
 
        // Check whether both values are available
        if (username == null || city == null) {
            response.getWriter().println("Required details are missing.");
            return;
        }
 
        // Display the received values
        response.getWriter().println(
            "<html><body>"
            + "<h2>Details Received Successfully!</h2>"
            + "<p>Name: " +(username) + "</p>"
            + "<p>City: " + (city) + "</p>"
            + "</body></html>"
        );
	}
 
}
