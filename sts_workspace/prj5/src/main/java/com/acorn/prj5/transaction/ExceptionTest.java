package com.acorn.prj5.transaction;

public class ExceptionTest {



	public void methodA() throws Exception   {

		try {			
			throw new Exception();	  //일부러 예외를 일으킴 , 테스트를 위해서 	  
		}catch( Exception e) {
			System.out.println("methodA가 처리할 예외사항 내용");
			throw e;
		}				
	}


	public static void main(String[] args) { 		 
		ExceptionTest  example = new ExceptionTest();
		try {
			example.methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생시 이 부분은 내가 맡아서 처리할께 ");
		}	

	}

}
