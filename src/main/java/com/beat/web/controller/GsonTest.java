package com.beat.web.controller;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by beatkirito on 2016/3/27.
 */
@WebServlet(name = "GsonTest",urlPatterns = "/GsonTest")
public class GsonTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");

        Gson gson = new Gson();

        Object o = new Object() {

            public Integer id = 0;
            public String s = "Hello";
        };

        String jsonString = gson.toJson(o);
        System.out.println(jsonString);

        response.getWriter().println(jsonString);

    }
}
