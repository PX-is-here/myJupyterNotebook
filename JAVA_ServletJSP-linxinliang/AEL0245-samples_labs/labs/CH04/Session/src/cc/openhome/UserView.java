package cc.openhome;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/user.view")
public class UserView extends HttpServlet {
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response)
                       throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("</head>");
        out.println("<body>");
        out.printf("<h1>%s 已登入</h1>", request.getAttribute("user"));
        out.println("</body>");
        out.println("</html>");
    }
}
