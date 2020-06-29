package com.Web.demo.Servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/test")
public class Demo01Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println(request.getMethod() + " " + request.getRequestURL() + " " + request.getProtocol() + "\n========"
                + request.getRemoteAddr() + " " + request.getRemoteHost() + " " + request.getRemoteUser() + " " + request.getRemotePort() + "\n");

        Enumeration<String> e = request.getHeaderNames();
        String s = null;
        while (e.hasMoreElements()){
            s = e.nextElement();
            System.out.println(s + " : " + request.getHeader(s));
        }
    }
}
