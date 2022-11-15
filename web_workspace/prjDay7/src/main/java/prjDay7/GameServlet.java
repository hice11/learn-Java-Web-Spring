package prjDay7;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/game")
public class GameServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//		
		HashSet<String>  luckeyNames = new HashSet<>();		
		String[] names= {"고기현", "김소영" , "김영현", "김준서" ,"박초희" , "원재호" ,"유다현", "유효열" , "이용재" , "이호진" ,"임영빈", "임지수" , "조은진" , "조재연" ,"천지수", "함희원","홍윤성"};
		
		Random r = new Random();		
		
		while(luckeyNames.size() <3) {
			int index  =r.nextInt(17);		
			luckeyNames.add(names[index]);
		}
		
		
		 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("result", luckeyNames);
		request.getRequestDispatcher("game/gameResult.jsp").forward(request, response);
		
	}

	
}
