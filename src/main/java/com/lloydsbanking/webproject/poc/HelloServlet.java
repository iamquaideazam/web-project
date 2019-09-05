package com.lloydsbanking.webproject.poc;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lloydsbanking.webproject.poc.account.AccountRepository;
/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/users")
public class HelloServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
      resp.setContentType("text/plain");
      AccountRepository accountRepo = AccountRepository.getObject();
      
      String message = accountRepo.getList().toString();
      
      resp.getWriter().write(message);
   }
}