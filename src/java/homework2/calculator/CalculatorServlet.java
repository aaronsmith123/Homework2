/*

Copyright © 2016 Aaron Smith & Xenia Zantello

 */
package homework2.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework2.user.User;
/**
 *
 * @author Aaron
 */
public class CalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";
        String action = request.getParameter("action");
        
        if (action == null) {
        action = "CalculatorServlet";  
        }
        
        
        if (action.equals("CalculatorServlet")) {
        System.out.println("CalculatorServlet action: " + action);
        String amount = request.getParameter("amount");
        String rate = request.getParameter("rate");
        String year = request.getParameter("year");
        String future = request.getParameter("future");
        
        
        
        
        User user = new User(amount, rate, year, future);

        request.setAttribute("user", user);
        }
        
        url = "/calculate.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}