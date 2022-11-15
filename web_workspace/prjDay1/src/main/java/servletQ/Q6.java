package servletQ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q6.ch")
public class Q6 extends HttpServlet {

	//수를 사용자로부터 받으면 입력한 수에 대한 약수를 구해서 제공하기
	//(약수를 구해주는 서비스)
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		//입력
		String n_ = request.getParameter("n");
		int n = Integer.parseInt(n_);
		//처리
		int[] nums = new int[n];
		int cnt=0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				nums[cnt] = i;
				cnt++;
			}
		}//for
		//출력
		PrintWriter out = response.getWriter();
		out.write("");
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>"); 
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>"); 
		out.write("<Style>");
		out.write("body{"); 
		out.write(" background-color: black;"); 
		out.write(" margin:0 auto;");
		out.write("}");
		out.write("div{"); 
		out.write(" width:300px;"); 
		out.write(" height:150px;");
		out.write(" border: 1px solid white;");
		out.write(" color:white;"); 
		out.write(" line-height:35px;");
		out.write(" font-size:20px;"); 
		out.write(" font-width:bold;");
		out.write(" text-align:center;");
		out.write(" vertical-align: middle;");
		out.write(" padding:10px 5px;");
		out.write(" margin:10px auto;");
		out.write("}"); 
		out.write("h3{"); 
		out.write(" margin:15px auto;");
		out.write("}");
		out.write("</Style>");
		out.write("</head>"); 
		out.write("<body>");
		out.write("<div>");
		out.write("<h3> 약수 구하기 </h3>");
		out.write("숫자 "+n+"의 약수<br>");
		for (int i = 0; i < cnt; i++) {
			if (i!=cnt-1) out.write(nums[i]+", ");
			else out.write(nums[i]+"");
		}
		out.write("</div>"); 
		out.write("</body>"); 
		out.write("</html>");
		
		
		
	}
	
	
}
