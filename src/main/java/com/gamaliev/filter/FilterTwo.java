package com.gamaliev.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by USER on 20.12.2016, 9:31.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class FilterTwo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterTwo init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FilterTwo --->>>");
        response.getWriter().println("FilterTwo");
        chain.doFilter(request, response);
        System.out.println("FilterTwo <<<---");
    }

    @Override
    public void destroy() {
        System.out.println("FilterTwo destroy");
    }
}
