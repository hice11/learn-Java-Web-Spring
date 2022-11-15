package mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join.sc")
public class Join extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		//데이터 입력받기
		String name="";
		String id="";
		int pw=0;
		int grade=0;
		int cls=0;
		try {
			name =request.getParameter("name");
			id =request.getParameter("id");
			
			String pw_ =request.getParameter("pw");		
			pw = Integer.parseInt(pw_);
			
			String grade_ =request.getParameter("grade");
			grade = Integer.parseInt(grade_);
			
			String cls_ =request.getParameter("cls");
			cls = Integer.parseInt(cls_);
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
		//데이터 저장
		User user = new User(name, id, pw, grade, cls);
		
		//출력 페이지
		//PrintWriter out = response.getWriter();
		//out.println("<p>회원가입 완료!</p>");
		//out.println("<p>로그인을 해주세요.</p>");
		//out.println("<a href=\"login.html\" style=\"color:blue; text-decoration:none\">로그인</a>");
		
		//request에 Model 심기
		request.setAttribute("userInfo", user); // key, value(데이터)
		
		//RequestDispatcher r = request.getRequestDispatcher("/resultIndex.jsp");  //로그인 후 페이지
		RequestDispatcher r = request.getRequestDispatcher("/userInfo.jsp");
		r.forward(request, response);
	}
	
}
