package com.example.filter.headerfilterexample.config.filters;
import com.example.filter.headerfilterexample.config.filters.HeaderContainer.HeaderContainer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class HeaderFilter implements Filter {

    private final HeaderContainer headerContainer;

    public HeaderFilter(HeaderContainer headerContainer){
        this.headerContainer = headerContainer;
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Enumeration<String> hedearRequest = request.getHeaderNames();
        while(hedearRequest.hasMoreElements()){
            String headerName = hedearRequest.nextElement();
            String valueHeader = request.getHeader(headerName);
            this.headerContainer.addHeader(headerName,valueHeader);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
