package project01;

public class data {
	private String name;
	private int age;
	//지정 예약어
	//public , private 뒤에 붙는 친구들
	
	
	data(){
		
	}
//	data(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	
	public void setName(String name) {
		this.name=name;
		System.out.println("dto name :" + name);
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	
	
	
	
	
	
}
