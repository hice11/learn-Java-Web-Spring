package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Score;
import model.ScoreDAO;

//학생정보조회
@WebServlet("/h4")
public class HelloController4 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//모델
		ScoreDAO dao = new ScoreDAO();
		ArrayList<Score> list = dao.list();
		//콘솔 테스트
		for( Score score:list ) {
			System.out.println(score);
		}
		
		//
		request.setAttribute("list", list);
		
		//view 거쳐서 출력
		request.getRequestDispatcher("WEB-INF/view/scoreList.jsp").forward(request, response);
		
	}//
	
}
