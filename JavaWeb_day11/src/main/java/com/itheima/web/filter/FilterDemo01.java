package com.itheima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/filtertest.jsp")
public class FilterDemo01 implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain Chain) throws IOException, ServletException {
        System.out.println("1放行前");
      Chain.doFilter(servletRequest,servletResponse);
        System.out.println("3 放行后");
    }

    @Override
    public void destroy() {

    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
