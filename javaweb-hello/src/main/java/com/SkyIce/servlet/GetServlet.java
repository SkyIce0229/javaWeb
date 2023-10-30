package com.SkyIce.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/get")
public class GetServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        步骤1：创建对象
        ServletContext servletContext = this.getServletContext();

//        步骤2：通过get获取值
        String name = (String) servletContext.getAttribute("name");

        String url = (String) servletContext.getAttribute("url");
//        步骤3：把获取到的值传给浏览器 浏览器的格式为文本格式
        resp.setContentType("text/html");
        //设置编码
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print(name);
        resp.getWriter().print(url);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
