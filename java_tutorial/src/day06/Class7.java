package day06;

public class Class7 {
	public static void main(String[] args) {
		Person ps = new Person();
		Person ps2 = new Person();
		ps.setName("홍길동");
		ps.setAge(23); 
		ps.setHeight(180);  
		//get은 무저건 syso안에
		
		ps2.setName("아무개");
		ps2.setNation("캐나다");
		ps2.setHeight(187);
		System.out.println("이름은 : "+ps.getName()+" 나이는 : "+ps.getAge()+" 키는 : "+ps.getHeight());
		System.out.println("이름은 : "+ps2.getName()+" 나라는 : "+ps2.getNation()+" 키는 : "+ps2.getHeight());
		//syso는 메인에서 사용하면 됨
		//홍길동은 한국에서 온 23살이다.
		//아무개는 캐나다에서 온 22살이다.
		
	}
}

class Person{
	private String name;
	private String nation;
	private int age;
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	private double height;
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public int getAge() {
		return age;
		}
	public void setAge(int age) {
		this.age = age;
		}
	public double getHeight() {
		return height;
		}
	public void setHeight(double height) {
		this.height = height;
		}
	}

//클래스명 : Person
//변수 : 이름, 나라, 나이
//함수 : get, set

//getter/setter : 우클릭 -> source -> Generate getter/setter...
