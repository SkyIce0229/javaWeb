package com.skyice.servlet;

import com.skyice.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/s1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码解决中文乱码
        req.setCharacterEncoding("gbk");
        resp.setCharacterEncoding("gbk");
        resp.setContentType("text/html;charset=utf-8");

        //创建session
        HttpSession session = req.getSession();
        //向session中保存值
//        session.setAttribute("name","lam");
        session.setAttribute("name",new Person("lam",20));

        //获取sessionID
        String sessionId = session.getId();
        //获取session
        if (session.isNew()) {
            resp.getWriter().write("session创建成功，id："+sessionId);
        } else  {
            resp.getWriter().write("session已存在，id："+sessionId);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
