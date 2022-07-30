package day09;

public class Class2 {
	public static void main(String[] args) {
		StarGangnam EE = new StarGangnam();
		EE.makeCoffee();
		EE.sellCoffee();
		
		StarSinchon WW = new StarSinchon();
		WW.makeCoffee();
		WW.sellCoffee();
		
		StarBupyeong AA = new StarBupyeong();
		AA.makeCoffee();
		AA.sellCoffee();
		
		//다형성 : 객체화를 할 때 상속한 인터페이스의 이름으로 통일
		starbucks star1 = new StarGangnam();
		starbucks star2 = new StarSinchon();
		starbucks star3 = new StarBupyeong();
		starbucks star[] = new starbucks[30];
		
		star[0] = new StarGangnam();
		star[1] = new StarSinchon();
		
		star[0].makeCoffee(); //강남
		star[1].makeCoffee(); //신촌
		//명세서, 설계도
		star[0] = new StarBupyeong();
		star[0].makeCoffee(); //부평
		
		AA = new StarBupyeong();   //StarGangnam EE = new StarBupyeong();  안됨
		//starbucks star1 = new StarBupyeong(); 가능
		//starbucks star2 = new StarSinchon(); 가능
		//다형성 : 코드수정을 줄이고 재사용 비율을 늘린다.
		
		
	}
}

//스타벅스

interface starbucks{
	
	void makeCoffee();
	
	void sellCoffee();
	//커피를 만든다 
	//커피를 판매한다
}

class StarGangnam implements starbucks{

	@Override
	public void makeCoffee() {
		System.out.println("강남점 커피만들기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellCoffee() {
		System.out.println("강남점 커피 판매");
		// TODO Auto-generated method stub
		
	}
	
}

class StarSinchon implements starbucks{

	@Override
	public void makeCoffee() {
		System.out.println("신촌점 커피만들기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellCoffee() {
		System.out.println("신촌점 커피 판매");
		// TODO Auto-generated method stub
		
	}
	
}

//스타벅스 강남점

//스타벅스 신촌점

//스타벅스 부평점

class StarBupyeong implements starbucks{

	@Override
	public void makeCoffee() {
		System.out.println("부평점 커피만들기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellCoffee() {
		System.out.println("부평점 커피 판매");
		// TODO Auto-generated method stub
		
	}
	
}