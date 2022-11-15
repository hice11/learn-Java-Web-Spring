package prjDay1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tenTotal.ch")
public class Servlet2 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//처리
		//1~10
		int sum=0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		//출력
		PrintWriter out = response.getWriter();
		out.print(sum);
	}
	
	
}
