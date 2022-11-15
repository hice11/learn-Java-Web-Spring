package mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.sc")
public class Login extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		//데이터 입력받기
		
		String id ="";
		String pw_ ="1";
		int pw = 0;
		try {
			id =request.getParameter("id");
			pw_ = request.getParameter("pw");
			System.out.println("아이디:"+id);
			pw = Integer.parseInt(pw_);
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
		//출력
		// 회원정보 확인하는 작업 (예상)
		PrintWriter out = response.getWriter();
		try {
			/*
			//  회원인 경우
			//User user = (User)request.getAttribute("userInfo");
			if ( id.equals(user.getId()) && pw == user.getPw() ) {
				//브라우저에 응답할 jsp 페이지로 포워딩
				RequestDispatcher r = request.getRequestDispatcher("/resultIndex.jsp");  //로그인 후 페이지
				r.forward(request, response);
			}else {
			}
			//  회원이 아닌 경우
			 */
			User user = (User)request.getAttribute("userInfo");
			out.print(user);
			out.println("<p>로그인 할 수 없습니다.</p>");
			out.println("<a href=\"index.html\" style=\"color:blue; text-decoration:none\">홈으로</a>");
			
		} catch (NullPointerException e) {
			out.println("<p>로그인 할 수 없습니다.</p>");
			out.println("<a href=\"index.html\" style=\"color:blue; text-decoration:none\">홈으로</a>");
		}
		
		
		
	}
	
	
	
}
