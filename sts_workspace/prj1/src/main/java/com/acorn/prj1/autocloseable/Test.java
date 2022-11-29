package com.acorn.prj1.autocloseable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		B b = new B();
		
		a.close();
		b.close();
		
		MyAutoCloseable[] autos = {a,b};
		
		for(MyAutoCloseable auto : autos) {
			auto.close();
		}

	}

}
