package day06;

public class Class5 {
	public static void main(String[] args) {
		Class5Ex c = new Class5Ex();
		c.num1 = 10;  //public
		c.num2 = 20;  //protected
		c.num3 = 30;  //default
		c.num(40);  //private
		System.out.println(c.num1);
		//변수는 private, 메서드는 public : 너의 정보를 은닉할 수 있게 캡슐화를 해야한다.
		//함수를 좀 만들어 써라 (주목적)
	}
}

//캡슐, 접근권한제어자, 정보은닉 : 구라(사실x)
class Class5Ex{
	//접근권한제어자
	//public, protected , default, private
	public int num1;  //public : 어디서든 사용가능
	protected int num2; //protected : 
	int num3;  //default  = 기본값, 같은 패키지 내에서 사용 가능
	private int num4; //private : 내 클래스 안에서만 사용 가능
	
	void test() {
		num1 = 10;
		num2 = 20;
		num3 = 30;
		num4 = 40;
	}
	
	public void num(int num4) {
		this.num4 = num4;
		System.out.println(this.num4);
	}
}
