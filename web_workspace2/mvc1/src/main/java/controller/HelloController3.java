package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Score;


@WebServlet("/hi3")
public class HelloController3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//입력
		// 회원정보 get, post
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		
		//처리 - 모델
		// 학생정보 담을 수 있는 객체를 만들어서 사용 model
		Score score = new Score(name, kor, eng);
		// 콘솔로 테스트
		System.out.println(score);
		
		//출력 , view 거쳐서
		request.setAttribute("score", score);
		request.getRequestDispatcher("WEB-INF/view/scoreView.jsp").forward(request, response);
		
	}//
	
}
