package com.skyice.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/c1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码解决中文乱码
        req.setCharacterEncoding("gbk");
        resp.setCharacterEncoding("gbk");

        //任何类型加字符串都会转成String类型
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");
        //设置Cookie过期时间
        cookie.setMaxAge(24*60*60);
        //添加Cookie
        resp.addCookie(cookie);

//        获取Cookie
        Cookie[] cookies = req.getCookies();
        PrintWriter writer = resp.getWriter();

        //遍历输出
        if (cookies != null) {
            writer.write("上一次访问时间: ");
            //遍历Cookie
            for (int i = 0; i <= cookies.length; i++) {
                Cookie cookie1 = cookies[i];
                //获取cookie名字
                if (cookie1.getName().equals("lastLoginTime")) {
                    //如果有，获取里面的值
                    long last = Long.parseLong(cookie1.getValue());
                    Date date = new Date(last);
                    writer.write(date.toString());
                }

            }
        } else {
            writer.write("这是您第一次访问网站");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
