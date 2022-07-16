package day07;

public class Constructor2 {
	public static void main(String[] args) {
		Person SR = new Person("이승한", "대한민국", 17);
		SR.go();
	}
}

class Person{
	private String Name;
	private String Nation;
	private int Age;
	//생성자를 통해서 set
	
	public void go() {  
		//go 함수를 통해서 syso(get)
		PersonInfo();
	}
	Person(String Name, String Nation, int Age_num ){
		setName(Name);
		setNation(Nation);
		setAge(Age_num);
	}
	
	public void PersonInfo() {
		System.out.println("이름은 "+getName()+"이고 "+"국적은 "+getNation()+"이며 나이는 "+getAge()+"이다.");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNation() {
		return Nation;
	}

	public void setNation(String nation) {
		Nation = nation;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
}
