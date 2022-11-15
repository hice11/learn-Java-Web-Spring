package week03.day2.주소록객체배열;

public class 주소록 {

	/*
	 속성
	 - 이름
	 - 전화번호
	 - 이메일 주소
	 - 생일
	*/
	
	int index=0;
	/*
	 속성
	 - 이름
	 - 전화번호
	 - 이메일 주소
	 - 생일
	*/
	
	private String[] name = new String[10];
	private String[] phoneNumber = new String[10];
	private String[] mailAddress = new String[10];
	private String[] birthday = new String[10];
	
	/*
	 기능
	 - 연락처 입력
	 - 연락처 출력
	*/
	
	//입력받기
	public void input(String name,String phoneNumber,String mailAddress,String birthday) {
		this.name[index] = name;
		this.phoneNumber[index] = phoneNumber;
		this.mailAddress[index] = mailAddress;
		this.birthday[index] = birthday;
		index++;
	}
	
	//출력하기
	public void printInfo() {
		System.out.println("=======저장된 연락처=======");
		for (int i = 0; i < index; i++) {
			System.out.println("========== "+(i+1)+" ==========");
			System.out.println("이름\t: "+name[i]);
			System.out.println("전화번호\t: "+phoneNumber[i]);
			System.out.println("이메일\t: "+mailAddress[i]);
			System.out.println("생일\t: "+birthday[i]);
		}
	}
	
}
