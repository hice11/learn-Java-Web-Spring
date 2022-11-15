package prjDay3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 정보조회하는 서비스
@WebServlet("/foodInfoAll")
public class Servlet3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//모든 정보 조회
		ArrayList<Food> list = new ArrayList<>();
		list.add(new Food("빼빼로", 1500));
		list.add(new Food("초코송이", 800));
		list.add(new Food("솜사탕", 2000));
		
		//모든 회원 정보 (model)
		// model 심기
		request.setAttribute("foodList", list);
		
		//지정된 view forword
		// 두줄을 한줄로
		request.getRequestDispatcher("/foodView.jsp").forward(request, response);
		
	}
	
	
}
