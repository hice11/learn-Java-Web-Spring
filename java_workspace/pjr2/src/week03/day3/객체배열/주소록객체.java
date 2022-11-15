package week03.day3.객체배열;


public class 주소록객체 {
	
	private String name;
	private String phoneNumber;
	private String mailAddress;
	private String birthday;
	
	//생성자
	public 주소록객체(String name,String phoneNumber,String mailAddress,String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mailAddress = mailAddress;
		this.birthday = birthday;
	}
	 
	//데이터 입력
	public void input(String name,String phoneNumber,String mailAddress,String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mailAddress = mailAddress;
		this.birthday = birthday;
	}
	
	//데이터 출력
	public void printInfo() {
		System.out.println("이름\t: "+name);
		System.out.println("전화번호\t: "+phoneNumber);
		System.out.println("이메일\t: "+mailAddress);
		System.out.println("생일\t: "+birthday);
	}
	
}
