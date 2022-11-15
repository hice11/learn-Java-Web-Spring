package review;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Test {

	public static void main(String[] args) {
		
		//json 테스트
		
		/*
		ArrayList<Review> list = new ArrayList<>();
		list.add(new Review("book1","book review1 "));			
		list.add(new Review("book2","book review2!!!"));

		JSONArray jArray = new JSONArray();//배열이 필요할때

		for (int i = 0; i < list.size(); i++)//배열
		{
			JSONObject sObject = new JSONObject();//배열 내에 들어갈 json
			sObject.put("title", list.get(i).getTitle());
			sObject.put("review", list.get(i).getReview());	               

			jArray.add(sObject);
		}           

		JSONObject obj = new JSONObject();              
		obj.put("item", jArray);//배열을 넣음

		System.out.println(obj.toString());
		*/
		
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


	}////

}

