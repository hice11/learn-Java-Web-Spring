package review;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReviewService {
	
	public String   reviews() {

        
        
        ArrayList<Review> list = new ArrayList<>();
        list.add(new Review("book1", "funny funny "));			
        list.add(new Review("book2", "~~~!!!"));
			 
         JSONObject obj = new JSONObject();
     
           JSONArray jArray = new JSONArray();//배열이 필요할때
           for (int i = 0; i < list.size(); i++)//배열
           {
               JSONObject sObject = new JSONObject();//배열 내에 들어갈 json
               sObject.put("title", list.get(i).getTitle());
               sObject.put("review", list.get(i).getReview());
               
               jArray.add(sObject);
           }          
            obj.put("item", jArray);//배열을 넣음
            System.out.println(obj.toString());
            return   obj.toString();
       
	}

}
