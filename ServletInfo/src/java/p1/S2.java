package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "QuestionServlet", urlPatterns = {"/QuestionServlet"})
public class S2 extends HttpServlet
{
    int index;
    String[] question;
    String[] op1;
    String[] op2;
    String[] op3;
    String[] op4;
    int[] ans;

    @Override
    public void init()
    {
        question = new String[10];
        op1 = new String[10];
        op2 = new String[10];
        op3 = new String[10];
        op4 = new String[10];
        ans = new int[10];
       
        //Loading Data in arrays
            
        for (int i = 0; i < question.length; i++)
        {

            question[i] = "This is Question " + (i+1) + "?";
            op1[i] = "A" + (i+1) + "";
            op2[i] = "B" + (i+1) + "";
            op3[i] = "C" + (i+1) + "";
            op4[i] = "D" + (i+1) + "";
            ans[i] = i+1;

        }

    }

    
  @Override
    public void service(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException
    {
        
        response.setContentType("text/html;charset=UTF-8");try (PrintWriter out = response.getWriter())
        {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> RPIAN Exam System </title>");
            out.println("<style> div.question { padding:25px } </style>");
            out.println(
                "<style> " +
                "button { " +
                "background-color:cyan;" +
                "border-width:0px;" +
                "border-radius:20px " +
                "} " +
                "</style>"
            );
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to the RPIAN Exam System</h1>");    
            
            //Printing current question
           
            out.println("<div class='question'>");
            out.println("<b>" + question[index] + "</b><br>");
            out.println(
                "<input type='checkbox' name='a' value='2'>" + 
                op1[index] + "</input><br>"
            );
            out.println(
                "<input type='checkbox' name='a' value='4'>" + 
                op2[index] + "</input><br>"
            );
            out.println(
                "<input type='checkbox' name='a' value='8'>" + 
                op3[index] + "</input><br>"
            );
            out.println(
                "<input type='checkbox' name='a' value='16'>" + 
                op4[index] + "</input><br>"
            );
            out.println("<label>Answer : " + ans[index] + "</label><br>");
            
            index=(index+1) % 10;
            
            out.println("</div>");
            out.println("<br/><button><a href=''>Refresh</a></button>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}