/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.auth;

import dal.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;

/**
 *
 * @author sonnt
 */
public abstract class BaseAuthenticationController extends HttpServlet {
    private boolean isAuthen(HttpServletRequest req)
    {
        return req.getSession().getAttribute("account") != null;
    }
    
    protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException;
    protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(isAuthen(req))
        {
            //write content
            Account account = (Account)req.getSession().getAttribute("account");
            doPost(req, resp, account);
        }
        else
            resp.getWriter().println("access denied!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(isAuthen(req))
        {
            //write content
            Account account = (Account)req.getSession().getAttribute("account");
            doGet(req, resp, account);
        }
        else
            resp.getWriter().println("access denied!");
    }
    
}
