package week03.day4;

public class Hero {

	//인스턴스 변수
	String name;
	int hp;
	
	//
	static int count;
	
	//생성자
	public Hero() {
		
	}
	public Hero(String name,int hp) {
		count++;
		this.name=name;
		this.hp=hp;
	}
	
	public void punch() {
		System.out.println(name+"펀치"+hp);
	}
	
	//
	public static void main(String[] args) {
		Hero h1 = new Hero("아서스",200);
		Hero h2 = new Hero("레오닉",180);
		Hero h3 = new Hero("제이나",170);
		
		System.out.println(Hero.count);
	}
	
	
	
}
