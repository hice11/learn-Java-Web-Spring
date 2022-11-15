package week03.day2.주소록객체배열;

public class Contact {
	/*
	 속성
	 - 이름
	 - 전화번호
	 - 이메일 주소
	 - 생일
	*/
	private String name;
	private String phoneNumber  ;
	private String  mailAddress; 
	private String  birthday;
	 
	//디폴트생성자
	public Contact() {
		
	}
	//생성자
	public Contact(String name, String phoneNumber , String mailAddress, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mailAddress = mailAddress;
		this.birthday = birthday;	
	}
	
	
	public void input(String name, String phoneNumber , String mailAddress, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mailAddress = mailAddress;
		this.birthday = birthday;		
		
	}
	
	
	public void printInfo() {
		System.out.println("이름\t: "+name);
		System.out.println("전화번호\t: "+phoneNumber);
		System.out.println("이메일\t: "+mailAddress);
		System.out.println("생일\t: "+birthday);
		
	}
	
}
