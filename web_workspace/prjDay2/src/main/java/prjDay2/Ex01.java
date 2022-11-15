package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 문제1번
@WebServlet("/ex01")
public class Ex01 extends HttpServlet {


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("start");
		
		//입력
		String su1_ = request.getParameter("su1");
		String su2_ = request.getParameter("su2");
		int su1=0;
		int su2=0;

		//null 처리
		if(su1_ != null && su2_ != null) {
			su1 = Integer.parseInt(su1_);
			su2 = Integer.parseInt(su2_);
		}
		
				
		//처리
		int result = su1+su2;
		//출력
		System.out.println(result);
		PrintWriter out = response.getWriter();
		out.println(result);
		
	}
	
	
}
