/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author neild
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        if(request.getParameter("first") != null){
            if(request.getParameter("second") != null){
           
               String firstString = request.getParameter("first");
               String secondString = request.getParameter("second");
               String opt = request.getParameter("btn");
           
               try{
                   
                    if(opt.equals("+")){
                        int first = Integer.parseInt(firstString);
                        int second = Integer.parseInt(secondString);

                        int sum = first + second;
                        request.setAttribute("message","Result: "+ sum);
                    }
                    if(opt.equals("-")){
                        int first = Integer.parseInt(firstString);
                        int second = Integer.parseInt(secondString);

                        int sub = first - second;
                        request.setAttribute("message","Result: "+ sub);
                    }
                    
                    if(opt.equals("*")){
                        int first = Integer.parseInt(firstString);
                        int second = Integer.parseInt(secondString);

                        int mult = first * second;
                        request.setAttribute("message","Result: "+ mult);
                    }
                    
                    if(opt.equals("%")){
                        int first = Integer.parseInt(firstString);
                        int second = Integer.parseInt(secondString);

                        int mod = first % second;
                        request.setAttribute("message","Result: "+ mod);
                    }
                    
               }catch(Exception ex){
                   request.setAttribute("message", "Result: invalid");
               }         
        }
        
      }
        else{
            request.setAttribute("message", "Result: invalid");
        }
        
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  

}
