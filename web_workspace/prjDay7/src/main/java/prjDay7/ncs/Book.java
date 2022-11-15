package prjDay7.ncs;

public class Book {

	/*
	문제7) 책정보를 저장할 수 있는 Book클래스를 작성하시오
	-생성자와 toString 매서드를 Override 하시오     (10점)
	-책정보 (책코드 , 책이름,  저자)
	책코드: bookCode : int
	책이름: bookTitle : String
	저자 : author  : String
	*/
	String bookCode;
	String bookTitle;
	String author;
	
	public Book() {}
	public Book(String bookCode, String bookTitle, String author) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author =author;
	}
	
	@Override
	public String toString() {
		
		return bookCode+", "+bookTitle+", "+author;
	}
	
	
}
