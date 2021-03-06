package com.rajeshpatkar;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "F3", 
         dispatcherTypes = {DispatcherType.INCLUDE},
         servletNames = {"/S2"})

public class F3 implements Filter{
    
    private FilterConfig filterConfig = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, 
            FilterChain chain) throws IOException, ServletException {
        doBeforeProcessing(request, response);
        chain.doFilter(request, response);
        deAfterProcessing(request, response);
    }

    @Override
    public void destroy() {
        
    }

    private void doBeforeProcessing(ServletRequest request, 
            ServletResponse response) throws ServletException, IOException{
        response.getOutputStream().println(
                "<h1>Header is generated by Filter F3</h1>");
    }

    private void deAfterProcessing(ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        response.getOutputStream().println(
                "<h1>Footer is generated by Filter F3</h1>");
    }
    
}
