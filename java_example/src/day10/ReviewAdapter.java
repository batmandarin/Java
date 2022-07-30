package day10;

public abstract class ReviewAdapter implements review{
	//인터페이스는 {]가 무조건 없어야함
	//추상클래스는 {}가 있어도 되고 없어도 됨
	//추상클래스 : 인터페이스를 상속받기 전 일부만 구현해서 상속하고 싶을때 추상클래스를 거침
	@Override
	abstract public void func1();
	//위는 생략해도 됨, 추상클래스고 이미 펑크2만 있는 채에도 얘도 어댑터로 포함되어 있음
	//adapter = 둘을 연결해주는 매개체
	@Override
	public void func2(int num) {
		System.out.println(num+"를 받은 함수2");
	}
}
