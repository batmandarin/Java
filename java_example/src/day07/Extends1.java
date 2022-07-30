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
	//ex1의 코드가 복사 붙여넣기가 됨
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

//상속받고 실행시킬 경우 맨위 클래스명을 상속받는 위치의 클래스로만 고친다 - ex : ex4등등
//수퍼.go는 아까 원래 함수의 go함수에서 해당되는 내용들을 가져오기 위함이고, 애초에  extends라는 함수가 복사 붙여넣기 및 일부 수정을 수월히 하기 위해 생긴 함수
//그래서 아까 새로운 system도 추가하기 위한 새로운 내용이였음
//아까 ex5에 상속하는게 안되던 것도 얘는 이미 내용이 다 있으니 또다른 것을 상속하는게 안되는 거였음
//굳이 extends문에내용이 없어도 컴퓨터는 동일한 함수 내용이 있는걸로 인식, 출력 다 함.
//ex 복사 붙여넣ㄳ: 얘도 go를 가지고 있음
//go를 한번 더 만듬 : 우섡순위가 더 높아짐
//super.를 쓰는 이유는 원래 있던 go함수를 활용하기 위해서
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
