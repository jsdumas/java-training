package io.jsd.training.webapp.trainingcenter.javax.webservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/logout")
public class Logout extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		req.getSession().invalidate();
//		req.getRequestDispatcher("/logout").forward(req, resp);
		
		resp.sendRedirect(req.getContextPath()+"/login.jsf");
	}

	
}
