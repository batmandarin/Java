package day14;

public class Sink1 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread human1 = new Thread(toilet, "사람1");
		Thread human2 = new Thread(toilet, "사람2");
		
		human1.start();
		human2.start();
	}
}

//화장실은 1개만__ 사람은 없다
//한 사람이 화장실을 사용하고 있으면 다른 사람은 대기를 해야한다. 들어오면 안된다.
class Toilet implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) { //현재 클래스는 한번에 한명만 사용가능하게끔 동기화
			time = 0;
			System.out.println("화장실 돌아감");
			 while(time > 10) {
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 time++;
				 System.out.println("화장실 사용 중..."+time+"초");
			 }
			 System.out.println("화장실 사용");
		}
	}
}
