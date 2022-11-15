package review;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/review")
public class ReviewServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("title", "재미있는책");
		jsonObject.put("review", "정말 재미있어요 !");
		System.out.println(jsonObject);
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("title", "무서운책");
		jsonObject2.put("review", "정말 무서워요 !");
		System.out.println(jsonObject2);
		
		JSONArray jArray = new JSONArray();
		jArray.add(jsonObject);
		jArray.add(jsonObject2);
		
		System.out.println(jArray);
		
		JSONObject result = new JSONObject();
		result.put("result", jArray);
		
		System.out.println(result);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=utf-8");
		response.getWriter().print(result);
		
	}
	

}
