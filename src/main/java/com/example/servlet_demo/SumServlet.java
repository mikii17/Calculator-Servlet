package com.example.servlet_demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sum", value = "/sum")
public class SumServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;

        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel=\"stylesheet\" href=\"index.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<main>");
        out.println("<h1>Sum is</h1>");
        out.println("<p>" + sum  + "</p>");
        out.println("</main>");
        out.println("</body>");
        out.println("</html>");
    }
}
