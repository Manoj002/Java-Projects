package com.rajeshpatkar;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class F1 implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, 
            FilterChain chain) throws IOException, ServletException {
        doBeforeProcessing(request, response);
        chain.doFilter(request, response);
        doAfterProcessing(request, response);
    }

    @Override
    public void destroy() {
        
    }

    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
        throws ServletException, IOException{
        response.getOutputStream().println("<h1>Header</h1>");
    }

    private void doAfterProcessing(ServletRequest request, ServletResponse response) 
        throws ServletException, IOException{
        response.getOutputStream().println("<h1>Footer</h1>");
    }
    
}
