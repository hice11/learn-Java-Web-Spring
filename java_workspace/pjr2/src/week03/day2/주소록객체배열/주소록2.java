package week03.day2.주소록객체배열;

public class 주소록2 { 	 
	int index=0;
	private Contact[] list = new Contact[3];  //연락처배열	  
	 
	
	//입력받기
	public void input(String name,String phoneNumber,String mailAddress,String birthday) {
		//방법1
//		Contact contact = new Contact();
//		contact.input(name, phoneNumber, mailAddress, birthday);
//		list[index] = contact;
		//방법2
//		list[index] = new Contact();
//		list[index].input(name, phoneNumber, mailAddress, birthday);
		//방법3 생성자 사용
		list[index] = new Contact(name, phoneNumber, mailAddress, birthday);
		
		index++;
		if(index>2) index=0;
	}
	
	//출력하기
	public void printInfo() {
		System.out.println("=======저장된 연락처=======");
		for (int i = 0; i < 3; i++) {
			System.out.println("========== "+(i+1)+" ==========");
			list[i].printInfo();
		}
	}
	
}
