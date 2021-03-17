package miu.cs472;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dictServlet
 */
@WebServlet("/dictServlet")
public class dictServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DbConnection dbcon;
	
    public dictServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException {
		dbcon = new DbConnection("jdbc:mysql://localhost:3306/entries", "root", "1234");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// TODO Auto-generated method stub
		
		System.out.println("in post method");
		PrintWriter out = resp.getWriter();
		String att = req.getParameter("Requested");
		System.out.println("word: "+ att);
		try {
			System.out.println("in try block");
			List<DictionaryDB> list = dbcon.DictionaryList(att);
		int count = 0;
			for (DictionaryDB Data : list) {
				count++;
				//System.out.println("word: " + Data.getWord() + ", type: " +  Data.getWordtype() + "Dis : " + Data.getDefinition());
				//if(Data.getWord()== att)				{
					
					out.print("<p >Word:"+Data.getWord()+ "<br>wordType:"+ Data.getWordtype()+"<br>Discription:" +Data.getDefinition()+  "</p>");
					
					//DictionaryDB.getInstance().setData(Data.getWord(), Data.getWordtype(),Data.getDefinition());

					// return success
					//resp.setStatus(200);
					//break;
				//}
				
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	
	}
}

