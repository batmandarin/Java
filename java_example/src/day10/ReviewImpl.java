package day10;

public class ReviewImpl extends ReviewAdapter{
	static String str = "hello";  //static : 정적
	
	public static void main(String[] args) {
		review r1 = new ReviewImpl(); //인터페이스를 상속받으면 자료형을 인터페이스형으로 볼 수 있다.
		r1.func1();
		r1.func2(11);
		
		final int number = 12;  //final로 만든 변수는 수정이 불가능함
		//number = 13;  //불가능
		
	}

	@Override
	public void func1() {
		String str = "";    //함수 안에서 만든 변수는 함수 사용과 동시에 만들어지고 함수가 종료되면 없어짐
		// TODO Auto-generated method stub
		System.out.println("impl에서 구현");
	}
}

class Review2{
	public void go() {
		ReviewImpl.str = "객체화없이 정적변수 대입/사용";
		//우선순위가 높은곳 대신 용량이 적은 곳에 저장됨 - 스태틱
		//static변수는 프로그램 성능을 저하할 수 있으므로 사용을 최대한 최소화
		//스태틱이 많을 수록 프로그램 성능과 속도에 영향을 미침 쓰기엔 편한데
	}
}
