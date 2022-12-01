package com.acorn.prj3;

public class Member2 {
	
	String id;
	String name;
	String addr;
	String sns;
	
	public Member2() {
		// TODO Auto-generated constructor stub
	}

	public Member2(String id, String name, String addr, String sns) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.sns = sns;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSns() {
		return sns;
	}

	public void setSns(String sns) {
		this.sns = sns;
	}

	@Override
	public String toString() {
		return "Member2 [id=" + id + ", name=" + name + ", addr=" + addr + ", sns=" + sns + "]";
	}

	
	

}
