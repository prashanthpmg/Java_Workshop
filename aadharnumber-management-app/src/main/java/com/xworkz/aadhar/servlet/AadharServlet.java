package com.xworkz.aadhar.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class AadharServlet extends HttpServlet {

    public AadharServlet(){
        System.out.println("AadharServlet created now it can handle the"+ "request and response ");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response)  {
        System.out.println("doGet method invoked");

    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse response)throws IOException{
            System.out.println("doPost method invoked");

            String username =req.getParameter("username");
            String aadharNumber =req.getParameter("aadhar number");
            System.out.println("username is:"+username);
            System.out.println("aadhar number is:"+aadharNumber);

        //send the response back to the browser
        PrintWriter write = response.getWriter();
        response.setContentType("text/html");
        write.print("<html>");
        write.print("<head>");
        write.print("<title>"+"aadhar card"+"</title>");
        write.print("</head>");
        write.print("<body>");

        write.print("<h1>"+"Entered Details are:"+"</h1>");
        write.print("<h2>"+username+"<h2>");
        write.print("<h2>"+aadharNumber+"</h2>");


        write.print("</body>");
        write.print("</html>");

    }




    }


