package com.example.servlet_demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "calculator", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    public void  doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String method = req.getMethod();
        if (method.equals("get") || method.equals("GET")){
            String op = req.getParameter("op");
            if(op.equals("add")){
                RequestDispatcher dispatcher = req.getRequestDispatcher("sum");
                dispatcher.forward(req, res);
            }
            else if(op.equals("mul")){
                RequestDispatcher dispatcher = req.getRequestDispatcher("mul");
                dispatcher.forward(req, res);
            }
        }
    }
}
