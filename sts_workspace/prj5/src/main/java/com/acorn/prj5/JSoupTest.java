package com.acorn.prj5;

import java.io.IOException;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;


public class JSoupTest {

	public static void main(String[] args) {
		
		// 웹 크롤링, 스크래핑
		
		String URL = "https://weather.naver.com/rgn/cityWetrMain.nhn";
		Document doc;
		try {
			doc = Jsoup.connect(URL).get();
			
			// 클래스가 .leve14_1 가지고 있는 태그들 뽑아옴	
			org.jsoup.select.Elements elem = doc.select("h2");
			
			System.out.println( elem.text());
			
			//space기준으로 분리함
			String[] strs = elem.text().split(" ");
			
			for(String str: strs ) {
				System.out.println(str);
			}			
		} catch (IOException e) {			 
			e.printStackTrace();
		}
	} 

}
