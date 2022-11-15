package prjDay1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tenTotal2")
public class Servlet3 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//입력
		String su_ = request.getParameter("su");  //에러처리 해야함 (null 처리)
		int su = Integer.parseInt(su_);
		
		//처리
		int sum = 0;
		for(int i=1; i<=su; i++) {
			sum += i;
		}
		
		//출력
		PrintWriter out = response.getWriter();
		out.print(sum);
		
		//입력값에 따라 출력값이 달라짐 -> 동적페이지
	}
	
	
}
