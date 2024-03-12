package next0215;

public class Student {
	// 필드 - 객체의 데이터가 저장되는 곳
	int age;
	int grade;
	String name;
	
	// 생성자 - Student() {} - 객체 생성 시 초기화 역할 담당
	Student(int age,String name, int grade){
	this.age = age;
	this.name = name;
	this.grade = grade;
	}
	//method 객체의 동작으로 호출 시 실행되는 곳
	public void study() {
		System.out.println("student");
	}
	public void home() {
		System.out.println("go home");
	}
}
