package day09;

public class Class1 {
	public static void main(String[] args) {
		MyClassEx m1 = new MyClassEx();
		m1.go();
		m1.go2();
		//여기는 추상클래스 / go2사용함
	}

}

//상속 : 코드 복사 붙여넣기
//상속을 받은 쪽에서 만들어줘야하게끔 강요 == 추상
abstract class MyClass1{
	//추상 클래스
	//메서드를 만들어도 되고 만들다 말아도 됨
	//구현()
	public void go() {
		System.out.println("이거는 추상클래스");
	}
	
	//구현x, 선언만 있음 == 추상메서드
	//상속받은 쪽에서 만들어줘야함
	abstract public void go2();
}

class MyClassEx extends MyClass1{

	@Override
	public void go2() {
		System.out.println("go2 사용");
		// TODO Auto-generated method stub
		
	}
	//MyClass1 코드가 복붙되었음
	//대신, 선언만 있는 메서드는 반드시 수정(오버라이딩)해줘야한다.
	//어떻게? 빨간줄에 마우스 갖다붙여서
	//add unimplement method
}