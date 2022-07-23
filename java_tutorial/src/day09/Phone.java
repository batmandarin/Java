package day09;

public class Phone {
	public static void main(String[] args) {
		
	}
}

//인터페이스1 : 상속을 여러개 하기 위해서
//인터페이스2 : 반드시 만들어줘야하는 함수를 정해놓기 위해서
//인터페이스3 : 다형성

interface KPhone{
	//전화, 문자
	void call(int num);  //전화
	void msg(int num, String str); //문자
}
//2G = 전화 + 문자 , 3G = 전화 + 문자 + 인터넷, 4G = 전화 + 문자 + 인터넷 + 속도(LTE) , 5G = 전화 + 문자 + 인터넷 + 속도 + 빅데이터
class _2GPhone implements KPhone{
	
	@Override
	public void call(int num) {
		//반드시 만들어줘야하는 기능1
		System.out.println(num+"에 전화합니다.");
	}
	//명세서 같은 역할
	@Override
	public void msg(int num, String str) {
		//반드시 만들어줘야하는 기능2
		System.out.println(num+"에 문자를 보냅니다."+str);
	}
}//3g 폰 : 전화 + 문자 + 인터넷
class Phone3G extends _2GPhone implements KPhone{
	public void net() {
		System.out.println("인터넷 사용");
	}
	
}
class Phone4G extends Phone3G implements KPhone{
	public void LTE(int num) {
		System.out.println("LTE 초고속 데이터에 연결되었습니다. 현재 속도는"+num);
	}
}
class Phone5G extends Phone4G implements KPhone{
	private void BigData(String str) {
		System.out.println(str+"Database");
		// TODO Auto-generated method stub

	}
}
//46분 : 전화 + 문자 = 인터넷  + 속도(LTE)