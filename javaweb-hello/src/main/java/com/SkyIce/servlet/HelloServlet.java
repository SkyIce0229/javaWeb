package com.SkyIce.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/h1")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().print("Hello Servlet");

//        Aservlet向Bservlet传值
//        步骤1： 先创建Servletcontext对象
        ServletContext servletContext = this.getServletContext();
//        步骤2：setAttribute保存值
        servletContext.setAttribute("name","lam");
        resp.getWriter().println("数据上传成功");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
