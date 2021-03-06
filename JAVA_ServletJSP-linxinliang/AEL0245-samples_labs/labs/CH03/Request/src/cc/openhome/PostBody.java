package cc.openhome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postbody")
public class PostBody extends HttpServlet {
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println(bodyContent(request.getReader()));
        out.println("</body>");
        out.println("</html>");
    }

    private String bodyContent(BufferedReader reader) {
    	return String.join(
    		"<br>", 
    		reader.lines().collect(Collectors.toList())
    	);
    } 
}
