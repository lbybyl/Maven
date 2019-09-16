package com.demo.servlet;

import com.sun.net.httpserver.HttpServer;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServlet extends javax.servlet.http.HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter writer=response.getWriter();
        String vegetable=request.getParameter("vegetable");
        if(vegetable==null){
            vegetable="Tomato";
        }
        writer.println("<html><body>");
        writer.println("<h1>Noodles with" +vegetable+ "</h1>");
        writer.println("</body></html>");
    }
}
