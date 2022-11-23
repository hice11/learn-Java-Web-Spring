package day2.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("aa.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String str;
		while((str=reader.readLine())!=null) {
			list.add(str);
		}
		
		Stream<String> stream = list.stream();
		stream.filter(s->s.contains("거침없이")).forEach(s->System.out.println(s));
		
		 //stream.filter( s -> s.startsWith("BB")).forEach( s-> System.out.println(s));


	}

}
