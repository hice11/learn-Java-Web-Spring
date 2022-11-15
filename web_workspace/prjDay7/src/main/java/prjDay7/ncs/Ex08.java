package prjDay7.ncs;

import java.util.ArrayList;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방법1
		Book book1 = new Book("BA1001","Front길잡이","김작가");
		Book book2 = new Book("BC1002","JAVA길잡이","이작가");
		Book book3 = new Book("BD1003","서블릿길잡이","박작가");
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
		//방법1 배열 사용
		Book[] books = new Book[3];
		books[0] = new Book("BA1001","Front길잡이","김작가");
		books[1] = new Book("BC1002","JAVA길잡이","이작가");
		books[2] = new Book("BD1003","서블릿길잡이","박작가");
		
		for(Book bk : books) {
			System.out.println(bk);
		}
		
		///////////////////////////////////////
		//방법3 ArrayList (가변길이배열)
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("BA1001","Front길잡이","김작가"));
		list.add(new Book("BC1002","JAVA길잡이","이작가"));
		list.add(new Book("BD1003","서블릿길잡이","박작가"));
		
		for(Book bk2 : list) {
			System.out.println(bk2);
		}
		
		
	}

}
