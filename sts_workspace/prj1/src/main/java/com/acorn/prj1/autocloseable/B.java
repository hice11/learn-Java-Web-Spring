package com.acorn.prj1.autocloseable;

public class B implements MyAutoCloseable {

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(" 종료합니다");
	}

}
