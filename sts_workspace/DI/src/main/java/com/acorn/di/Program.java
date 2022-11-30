package com.acorn.di;

public class Program {
	
	//멤버변수 인스턴스변수
	int x;
	int y;
	Calculator calculator;  // 의존, dependency (의존성)
	
	//주입 받는다. 세터 주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Program() {	}

	public Program(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int numberAdd() {
		return calculator.add(x, y);
	}
	
	public int numberSub() {
		return calculator.sub(x, y);
	}
	
	public static void main(String[] args) {
		Program p = new Program(3,5);
		
		//Calculator 주입하는 코드
		p.setCalculator(new Pch());
		
		System.out.println(p.numberSub());
		
		//주입하는 코드만 변경
		p.setCalculator(new Pch2());
		
		System.out.println(p.numberSub());
	}
	

}
