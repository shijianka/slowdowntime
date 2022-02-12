package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("get...");
        String method = req.getMethod();
        System.out.println(method);

        //获取所有参数的Map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String s : map.keySet()) {
            System.out.print(s + ":");

            //获取值
            String[] strings = map.get(s);
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();


        }
        System.out.println("----------------------");

        //根据key获取参数值
        String[] hoppies = req.getParameterValues("hoppy");
        for (String hoppy : hoppies) {
            System.out.println(hoppy);
        }

        //根据key获取单个参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
