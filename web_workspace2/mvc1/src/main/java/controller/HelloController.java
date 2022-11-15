package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
public class HelloController {

	public static void main(String[] args) {
		System.out.println("hello");
	}
	
}
*/

//get, post 요청
@WebServlet("/hi")
public class HelloController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello");
		
		PrintWriter out = response.getWriter();
		out.println("helloServlet");
		
	}
	
}
