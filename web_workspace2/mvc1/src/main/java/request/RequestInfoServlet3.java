package request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request3")
public class RequestInfoServlet3  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("request.getMethod()="+request.getMethod());      // 요청 방법
		System.out.println("request.getProtocol()="+request.getProtocol());  // 프로토콜의 종류와 버젼 HTTP/1.1
		System.out.println("request.getScheme()="+request.getScheme());      // 프로토콜

		System.out.println("request.getServerName()="+request.getServerName()); // 서버 이름 또는 ip주소
		System.out.println("request.getServerPort()="+request.getServerPort()); // 서버 포트
		System.out.println("request.getRequestURL()="+request.getRequestURL()); // 요청 URL
		System.out.println("request.getRequestURI()="+request.getRequestURI()); // 요청 URI
		System.out.println("request.getContextPath()="+request.getContextPath()); // context path
		System.out.println("request.getServletPath()="+request.getServletPath()); // servlet path
		System.out.println("request.getQueryString()="+request.getQueryString()); // 쿼리 스트링

		System.out.println("request.getLocalName()="+request.getLocalName()); // 로컬 이름
		System.out.println("request.getLocalPort()="+request.getLocalPort()); // 로컬 포트


	}

}

