package com.ndt.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ndt.util.JsonData;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// 在过滤器中检查是否已经登录
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
		Object name = req.getSession().getAttribute("login");
		if (name == null && !req.getRequestURI().endsWith("/") && !req.getRequestURI().endsWith("register")
				&& !req.getRequestURI().endsWith("login.json") && !req.getRequestURI().endsWith("register.json")
				&& !req.getRequestURI().endsWith(".js")&& !req.getRequestURI().endsWith(".css")
				&& !req.getRequestURI().endsWith(".ttf")&& !req.getRequestURI().endsWith(".woff")) {
			/*res.sendRedirect(req.getContextPath()+"/");*/
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(JsonData.fail("/"));
			res.getWriter().println(json);
			System.out.println(json);
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}