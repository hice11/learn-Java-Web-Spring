package prjDay2;

 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/js0101")
public class 천지수Test extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//콘솔로 미리 확인 가능  @WebServlet이 잘 작동하는지 찍어보기
		System.out.println("Start");
		
		
		//문서 형식 정하기==============================================================
		req.setCharacterEncoding("UTF-8");
		 //내가 받아오는 값에 대해서도 설정이필요하다(?) => 한글이다!
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		

		//입력========================================================================
		String su1_ =req.getParameter("su1");	//반환 값이  Strin
			//getParameter("su1"); => key 값으로, 대소문자를 가림
		String su2_ =req.getParameter("su2");
			//값이 없는 경우, 맨처음에 페이지 로드시 값이 입력 안되어있기때문에 = null;

		String op = req.getParameter("op");	// 사칙연산의 부호 받아옴  +  *  /  -
		
		//오류 잡는 방법1===============================================================
		int su1=0;	//값을 지정해줄수 있음.
		int su2=0;
		if(su1_ !=null && su2_!=null && op != null) {
			su1 = Integer.parseInt(su1_);
			su2 = Integer.parseInt(su2_);
			
			//나는 try-catch로 잡앗는디 왐마야~!
		}
		
		
		//처리
		int result=0;
		
		switch(op) {
		case "add":
			result =su1 +su2;
			break;
		case "minus":
			result =su1 -su2;
			break;
		case "divide":
			result =su1 /su2;
			break;
		case "multiple":
			result =su1 *su2;
			break;
		default:
			result =0;
		}
		
		//출력
		System.out.println(result);	//콘솔창 출력 , 화면 출력  X
		PrintWriter out = resp.getWriter();
		
		out.println(result);

	}

}
