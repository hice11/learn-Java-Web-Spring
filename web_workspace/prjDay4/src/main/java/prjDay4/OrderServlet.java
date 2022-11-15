package prjDay4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// 세션에서 꺼내기
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		
		if(userId != null) {
			out.println("Order List =====>");
		}else {
			out.println("login again!!");
		}
		
		// 로그인 하지 않은 경우 -> 로그인화면으로 이동
		
		// id에 대한 주문내역정보를 DB로 부터 가져온다
		// model 생성코드
		
		
		
	}
	
	
}
