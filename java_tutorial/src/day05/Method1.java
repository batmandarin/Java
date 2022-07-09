package day05;

public class Method1 {
public static void main(String[] args) {
	myprint();
	myprint();
	add2(4,5); //무조건플러스는 두개를 채워줘야함 프러스만 괄호안단독으로불가능//앞과 뒤에 숫자를 넘겨줌
	add2(1,1);
	add3(3,5,6);
	absMinus(-2, -3);
	absMinus2(10, -4);     //6
	
	//return이 있을 경우 그 값을 변수에 담는다.
	int result = absMinus2(10, -4);
	System.out.println(result);
}

//myprint 기호 : 안녕하세요 반갑습니다. 를 보여주는 기능

static void myprint() {
	System.out.println("안녕하세요 반갑습니다.");
}
//+ 와 동일한 기능
static void add2(int num1, int num2) {
	System.out.println(num1+num2);
}
//기존의 -는 절댓값기능이 없음 => 직접 만들어 써야함
//add3 : 숫자3개를 더하는 기호(연산자)
static void add3(int num1, int num2, int num3) {
	System.out.println(num1+num2+num3);
}
static void absMinus(int num1, int num2) {
	//num1과 num2를 각각 절댓값으로 만들어서 (절댓값 : 음수는 양수로)
	//num1 - num2를 출력
	int abs1 = num1 , abs2 = num2;
	if(num1 < 0) {
		abs1 = num1 =-1;
		
    }
	if(num2 < 0) {
		abs2 = num2 = -1;
	}
	
	
	System.out.println(abs1 - abs2);
}

static int absMinus2(int num1, int num2) {
	int abs1 = num1 , abs2 = num2;
	if(num1 < 0) {
		abs1 = num1 =-1;
		
    }
	if(num2 < 0) {
		abs2 = num2 = -1;
	}
	
	
	//System.out.println(abs1 - abs2);
	return abs1 - abs2;  //return : 주는것 ㅇㅇ
}
} 

//메소드 : 클래스 안에 있는 함수
