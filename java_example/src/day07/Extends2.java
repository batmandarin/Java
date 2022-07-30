package day07;

public class Extends2 {
		public static void main(String[] args) {
			Member ma  = new Member();
			Human mb = new Human();
			mb.Info("이주순", 23);
			ma.go();
		}
}

class Human{
	protected String name;  //private는 무조건 내 클래스 안 함수 입력 공간에서만 사용 가능
	double weight;
	protected int age;      //protected  :상속받은 곳까지는 허용해줌
	public double height; //default : 내 package 안에서만 활용 가능
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Info() {
		this.name = name;
		this.age = age;
		System.out.println("이름은 "+name+"이고, 나이는 "+age);
	}
}//public : 어디서든지 활용 가능

class Member extends Human{
	
	Member(String name, int age){
		super(name, age);
		this.name = name;
		this.age = age;
		System.out.println("회원의 이름은"+this.name+"이고, 나이는"+this.age);
	}
	//함수 이름은 동일해도 인자()가 다르면 다른 함수로 취급함 : 오버로딩
	public void Info() {
	}
	
	
	public void go() {
		name = "A";
		age = 1;
		height = 31.4;
		weight = 85;
		System.out.println("실행");
	}
}