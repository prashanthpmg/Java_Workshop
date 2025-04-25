package com.xworkz.playomanagement.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class PlayoServlet extends HttpServlet {
    //const
    public PlayoServlet(){
        System.out.println("Playo app will be run");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)  {
        System.out.println("doget method invoked");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        System.out.println("doPost method invoked");
        String username = req.getParameter("username");
        System.out.println("username is:"+username);
        String email = req.getParameter("email");
        System.out.println("email is:"+email);
        String contact = req.getParameter("contact");
        System.out.println("contact number is:"+contact);
        String players = req.getParameter("players");
        System.out.println("number of player is:"+players);

        String cost = req.getParameter("cost");
        System.out.println("cost per player is:"+cost);
        int totalamount =Integer.parseInt(cost)*Integer.parseInt(players);
        PrintWriter write=res.getWriter();
        res.setContentType("text/html");
        write.print("<head>");
        write.print("<title>"+"Playo app");
        write.print("</title>");
        write.print("</head>");
        write.print("<body>");
        write.print("<h1>"+"Entered details are:"+"</h1>");
        write.print("<h2>"+username+"</h2>");
        write.print("<h2>"+email+"</h2>");
        write.print("<h2>"+contact+"</h2>");
        write.print("<h2>"+players+"</h2>");
        write.print("<h2>"+cost+"</h2>");
        write.print("<h2>"+totalamount+"</h2>");


        write.print("</body>");
        write.print("</html>");



    }




}