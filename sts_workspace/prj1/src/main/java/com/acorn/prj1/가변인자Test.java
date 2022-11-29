package com.acorn.prj1;

public class 가변인자Test {
	
	public void a(String s) {
		System.out.println(s);
	}
	
	public void a(String s, String s2) {
		System.out.println(s);
		System.out.println(s2);
	}
	
	//가변인자
	public void b(String ...str) {
		for(String s : str) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		가변인자Test t = new 가변인자Test();
		t.a("hi");
		t.a("hi1", "hi2");
		
		t.b("hi1","hi2","hi3");
		
	}
	

}
