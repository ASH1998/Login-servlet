/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASHU
 */
public class LoginServlet extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    String user = req.getParameter("user");
    String pass = req.getParameter("password");
    if ("ashutosh".equals(user) && "password123".equals(pass)){
        response(resp, "LOGIN OK");
    }
    else{
        response(resp, "invalid LOGIN");
        
    }
}

 
    private void response(HttpServletResponse resp, String login_ok) throws IOException { //To change body of generated methods, choose Tools | Templates.
       PrintWriter out;
       out = resp.getWriter();
       out.println("<html>");
       out.println("<body>");
       out.println("<t1>"+login_ok+"</td>");
       out.println("</body>");
       out.println("</html>");
       
    
       
    }

}
