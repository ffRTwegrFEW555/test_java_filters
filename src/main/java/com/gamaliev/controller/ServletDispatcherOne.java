package com.gamaliev.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by USER on 20.12.2016, 9:26.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class ServletDispatcherOne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDispatcherOne --->>>");
        System.out.println(req.getPathInfo());
        resp.getWriter().println(req.getAttribute("FilterOne"));
        resp.getWriter().println("ServletDispatcherOne");
        System.out.println("ServletDispatcherOne <<<---");
    }
}
