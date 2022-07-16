package day07;

public class Extends1 {
	public static void main(String[] args) {
		//객체화와 go 사용
		ex4 ms1 = new ex4();
		ms1.go();
	}
}

class ex1{
	private String str;
	
	//함수 이름이 같아도 인자() 부분이 다르면 다른 함수로 인식 : 메서드 오버로딩
	ex1(){
		
	}
	
	ex1(String str) {
		this.str = str;
	}
	
	public void go() {
		System.out.println(str+"1번");
	}
}

class ex2 extends ex1{
	//ex2의 코드가 복사 붙여넣기가 됨
}

//super : 부모의(코드의 원래 주인) : ex의 원래 go함수 동일하게 활용
//ex3을 만든 이유 : 별을 달려고
//코드 복사 붙여넣기만 하면 별을 달 수가 없음
//상속을 하고 수정이 필요하면 수정이 필요한 함수를 다시 만듦
//수정 : 동일한 함수를 다시 만들면 됨
class ex3{ 
	
	private String str;
	
	//함수 이름이 같아도 인자() 부분이 다르면 다른 함수로 인식 : 메서드 오버로딩
	ex3(){
		
	}
	
	ex3(String str) {
		this.str = str;
	}
	
	public void go() {
		System.out.println("=======");
		System.out.println(str+"1번");
		System.out.println("=======");
	}
}

//수정 : 동일한 함수를 다시 만들어주면 됨
class ex4 extends ex3{
	public void go() {
		super.go();
		System.out.println("종료");
	}
}



class ex5{
	private String str;
	
	//함수 이름이 같아도 인자() 부분이 다르면 다른 함수로 인식 : 메서드 오버로딩
	ex5(){
		
	}
	
	ex5(String str) {
		this.str = str;
	}
	
	public void go() {
		System.out.println("*********");
		System.out.println(str+"1번");
		System.out.println("*********");
	}
}

//기본의 클래스를 복붙하고 싶으면 extends를 사용
//수정이 필요하면 그 해당 함수만 다시 만들면 됨
