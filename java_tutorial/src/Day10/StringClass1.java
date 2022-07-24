package Day10;

public class StringClass1 {
	public static void main(String[] args) {
		MyString1 ms1 = new MyString1();
		//ms1.go();   //클래스 자료형
		Quiz1 q1 = new Quiz1();
		q1.name();
		q1.hello();
		q1.bye();
		q1.myInfo("신이현");
	}
}

class Quiz1{
	//public void go() {
		String info = ("안녕하세요 저는 홍길동입니다. 잘 부탁드립니다. 안녕히 계세요.");
		
		public void name() {
			String result = "";
			//홍길동
			//1.홍길동을 찾는다. info.indexOf("홍길동")
			int idx = info.indexOf("홍길동");
			//2.찾은 위치로부터 3칸 가서 자른다. info.subString(찾은 위치,찾은위치+3(var3?))
			result = info.substring(idx, idx+3);
			//3.출력한다. syso(result);
			System.out.println(result);
		}
		
		public void hello() {
			//안녕하세요
			String result = "";
			int id = info.indexOf("안녕하세요");
			result = info.substring(id, id+5);
			System.out.println(result);
	    }
		public void bye() {
			//안녕히 계세요
			String result = "";
			int iㅌ = info.indexOf("안녕히 계세요");
			result = info.substring(iㅌ, iㅌ+7);
			System.out.println(result);
		}
		public void myInfo(String name) {
			//안녕하세요. 저는 000입니다. 잘 부탁드립니다.
			String result = "";
			result = info.replace("홍길동", name);
			System.out.println(result);
		}
		
}

class MyString1{
	int var1;   //자료형이 붉은색이고 소문자
	double var2;  //붉은색, 소문자
	String var3;  //까만색, 맨 앞이 대문자
	boolean var4;  //붉은색, 소문자
	//자체적으로 만든 클래스. 자제적으로 만든 함수 기능도 있음
	public void go() {
		//String만 갖고있는 메서드
		var3 = "Hello world";
		//1. equals()라는 함수를 가지고 있음. 같은지 비교하는 함수
		var3.equals("Hello world");  //같으면 true, 다르면 false
		
		//2. contains() : 포함하는지 검사
		var3.contains("world"); //var3에 world가 들어있으면 true, 없으면 false
		
		//3.replace() : 교체
		var3.replace("world", "Java");  //var3에 world가 들어있으면 Java로 바꾼다.
		System.out.println(var3);
		
		//4.length() : 글자 갯수를 알려줌
		var1 = var3.length();   //var3의 글자 갯수를 알려준다.
		System.out.println(var1);
		
		//3. indexOf() : 해당 글자의 위치(방번호)를 알려줌//여러글자 넣을땐 큰따옴표
		var1 = var3.indexOf("Java");  //원래 프로그래밍에서는 위치가 0부터 시작함  //자바로 변결해서 j의 방번호가 됨
		System.out.println("1의 방번호는 : "+var1);  //방번호는 0부터 시작
		
		//6. chatAt() : 방번호를 알려주면 해당 글자를 알려줌(반환)
		char var5 = var3.charAt(10);
		System.out.println("10번째 방에 있는 문자는 "+var5);
		
		//7. subString() : 잘라내기
		var3 = var3.substring(0, 4+1);    //Hello Java!
		System.out.println("0번부터 4번까지 자른 결과 : "+var3);
		
		//8. + : 합치기
		var3 = var3 + "world";
		System.out.println(var3);
	}
}
