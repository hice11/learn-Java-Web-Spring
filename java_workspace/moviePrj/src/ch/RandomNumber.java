package ch;

import java.util.ArrayList;

public class RandomNumber {

	int n1,n2,n3,n4;
	long reservationNumber;
	
	
	public RandomNumber() {
		n1 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n2 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n3 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n4 = (int)(Math.random()*999+1); //1 ~ 999 사이
		reservationNumber = (long)(n1*Math.pow(10, 11))+(long)(n2*Math.pow(10, 7))+(long)(n3*Math.pow(10, 3))+n4;
	}
	
	public void printNumber() {
		System.out.printf("%04d-%04d-%04d-%03d", n1,n2,n3,n4);
	}

	public long getReservationNumber() {
		return reservationNumber;
	}
	
	public void addList(ArrayList<RandomNumber> numberList) {
		boolean equal=true;
		while(!equal) {
			numberList.add(new RandomNumber());
			if(numberList.size()>1) {
				for (int i = 0; i < numberList.size(); i++) {
					if(numberList.get(i).getReservationNumber()==numberList.get(numberList.size()-1).getReservationNumber())
						equal = true;
				}//for
				if (equal) {
					numberList.remove(numberList.size()-1);
				}//if
			}//if
			
			
		}//while
	}

	public static void main(String[] args) {
		
		int n1 = 1234;
		//n1은 1부터 9999
		int n2 = 5678;
		//n2은 1부터 9999
		int n3 = 9123;
		//n3은 1부터 9999
		int n4 = 456;
		//n4는 1부터 999
		
		n1 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n2 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n3 = (int)(Math.random()*9999+1); //1 ~ 9999 사이
		n4 = (int)(Math.random()*999+1); //1 ~ 999 사이
		
		//한 숫자로 더하기
		long num = (long)(n1*Math.pow(10, 11))+(long)(n2*Math.pow(10, 7))+(long)(n3*Math.pow(10, 3))+n4;
		
		String number = "1234-5678-9123-456";
		//예매번호 출력
		//System.out.printf("%04d-%04d-%04d-%03d", n1,n2,n3,n4);
		
		ArrayList<RandomNumber> numberList = new ArrayList<>();
		boolean equal=false;
		
		//numberList.add(new RandomNumber());
		//numberList.get(0).printNumber();
		
		//중복 거르기
		//numberList.add(new RandomNumber());
		//numberList.add(new RandomNumber());
		loop: while(true) {
			numberList.add(new RandomNumber());
			if(numberList.size()>1) {
				for (int i = 0; i < numberList.size(); i++) {
					if(numberList.get(i).getReservationNumber()==numberList.get(numberList.size()-1).getReservationNumber())
						equal = true;
				}//for
				if (equal) {
					numberList.remove(numberList.size()-1);
				}else break loop;
			}else break loop;
		}//while
		System.out.println(numberList.size());
		loop: while(true) {
			numberList.add(new RandomNumber());
			if(numberList.size()>1) {
				for (int i = 0; i < numberList.size(); i++) {
					if(numberList.get(i).getReservationNumber()==numberList.get(numberList.size()-1).getReservationNumber())
						equal = true;
				}//for
				if (equal) {
					numberList.remove(numberList.size()-1);
				}else break loop; 
			}else break loop;
		}//while

		
		
		for (int i = 0; i < numberList.size(); i++) {
			numberList.get(i).printNumber();
		}
		
		

	}

}
