package com.liubb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        System.out.println("构造LoginServer");
    }

    public void init(ServletConfig config) {
        System.out.println("init(ServletConfig)");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.write("service");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");// 设置编码格式UTF-8
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String html = null;
        if (name.equals("刘彬彬") && password.equals("123")) {
            html = "<div style='color:red'>登录成功</div>";
        } else {
            html = "<div style='color:green'>登录失败</div>";
        }
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.write(html);
    }
}
