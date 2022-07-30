package day10;

public class StringClass2 {
public static void main(String[] args) {
	String info1 = "STAname=A01price=001000num=01ED";
	String info2 = "STAname=A02price=001000num=02ED";
	String info3 = "STAname=A03price=001000num=03ED";
	Quiz2 q2 = new Quiz2();
	q2.go(info1);
	q2.go(info2);
	q2.go(info3);
}
}

class Quiz2{
	
	//info는 주문 내역 (통신패킷)
	//보안을 위해서 시작은 무조건 STA로 시작, 마지막은 ED로 끝나야 함
	//상품명은 name 다음에, 가격은 price= 다음에, 수량은 num=다음에
	//A01 : 에스프레소, A02 : 아메리카노, A03 : 카푸치노, A04 : 카페라떼
	
	public void go(String info) {
		
			
	}
	
}
