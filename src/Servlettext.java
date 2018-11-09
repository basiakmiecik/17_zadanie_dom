import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/text")
public class Servlettext extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html");
    PrintWriter writer = response.getWriter();

    writer.println(request.getParameter("AreaOfText"));
    writer.println("<br/>");


    String charactersSpaceText = "";
    String charactersText = "";
    String wordNumber = "";

    String wordsWithSpace = (request.getParameter("AreaOfText"));
    char[] arr = wordsWithSpace.toCharArray();
    int space = 0;
    int characters = 0;
    int pal=0;
    boolean palindrom=false;
    for (int i = 0; i < wordsWithSpace.length(); i++) {
        if (arr[i] == ' ') {
            space += 1;
        } else {
            characters += 1;
        }

            if(arr[i]==arr[wordsWithSpace.length()-(i+1)]){
                pal+=1;
        }

    }

    if(arr[wordsWithSpace.length()-1]==' ')
    {
        wordNumber = ("Ilość wyrazów: " + (space));
    } else
        {
        wordNumber = ("Ilość wyrazów: " + (space + 1));
    }

    charactersSpaceText = ("Ilość znakow w tekscie: " + wordsWithSpace.length());
    charactersText = ("Ilość znaków bez spacji: " + characters);
    writer.println("<h2>"+charactersSpaceText+"</h2>");
    writer.println("<h2>"+charactersText+"</h2>");
    writer.println("<h2>"+wordNumber+"</h2>");
    if(pal==wordsWithSpace.length())
    {
        palindrom=true;
    }
    writer.println("<h2>"+"Palindrom: "+palindrom+"</h2>");
}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
