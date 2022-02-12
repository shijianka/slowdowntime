package com.itheima.web.cookie;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bServlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie

        //获取cookie数组
        Cookie[] cookies = req.getCookies();


        //遍历cookie

        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if("username".equals(name)){
                String value = cookie.getValue();
                System.out.println("username"+value);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            this.doGet(req,resp);
    }
}
