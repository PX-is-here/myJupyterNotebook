package cc.openhome;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                      throws ServletException, IOException {
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        
        String page;
        if("caterpillar".equals(name) && "12345678".equals(passwd)) {
            if(request.getSession(false) != null) {
                request.changeSessionId();
            }
            request.getSession().setAttribute("login", name);
            page = "user";
        }
        else {
            page = "login.html";
        }
        response.sendRedirect(page);
    }
} 