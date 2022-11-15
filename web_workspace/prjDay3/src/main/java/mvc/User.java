package mvc;

public class User {

	private String name;
	private String id;
	private int pw;
	private int grade;
	private int cls;
	
	public User() {	}

	public User(String name, String id, int pw, int grade, int cls) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.grade = grade;
		this.cls = cls;
	}

	@Override
	public String toString() {
		return "User [이름:" + name + " 아이디:" + id + " 학년:" + grade + "학년 반:" + cls + "반]";
	}
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}


	public int getPw() {
		return pw;
	}

	public int getGrade() {
		return grade;
	}

	public int getCls() {
		return cls;
	}
	
	
	
}
