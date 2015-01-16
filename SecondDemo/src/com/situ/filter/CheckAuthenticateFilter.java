package com.situ.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

/**
 * Servlet Filter implementation class CheckAuthenticateFilter
 */
public class CheckAuthenticateFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CheckAuthenticateFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		HttpServletResponse httpResponse=(HttpServletResponse) response;
		HttpSession session=httpRequest.getSession(true);
		if (!((httpRequest.getServletPath().contains("/login.html"))||(httpRequest.getServletPath().contains("/register.html"))||(httpRequest.getServletPath().contains("/renderSignUp.html")) || "/authontication.html".equals(httpRequest.getServletPath()))) {
			System.out.println("new");
			if (null == session.getAttribute("name")) {
				httpResponse.sendRedirect("./login.html");
			}
		}
		System.out.println("httpRequest.getServletPath()"+httpRequest.getServletPath());
		System.out.println("FILTER");
		chain.doFilter(request, response);
		}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
