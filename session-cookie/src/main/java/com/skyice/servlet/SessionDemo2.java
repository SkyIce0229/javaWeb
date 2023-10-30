package com.skyice.servlet;

import com.skyice.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/s2")
public class SessionDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码解决中文乱码
        req.setCharacterEncoding("gbk");
        resp.setCharacterEncoding("gbk");
        resp.setContentType("text/html;charset=utf-8");

        //获取Session中保存的值
        //新建Session
        HttpSession session = req.getSession();
        Person sessionAttribute = (Person) session.getAttribute("name");
        resp.getWriter().write(sessionAttribute.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
