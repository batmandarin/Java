package day09;

public class InterfaceImpl implements Interface1 {
	public static void main(String[] args) {
		InterfaceImpl i1 = new InterfaceImpl();//아래에 오버라이드 입력하니까 ImPL쪽 퍼블릭 클래스 이름 오류 사라짐
		i1.go();
	}
	
	@Override
	public void go() {
		//인터페이스에 있는 함수를 재정의(수정)해줘야함
		System.out.println("인터페이스에서 상속받은 함수");
	}
}
