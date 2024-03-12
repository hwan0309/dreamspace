package next0227b;

public class Child extends Parent {

	//필드선언
	public String field2;
	
	//메소드선언
	public void method3() {
		System.out.println("Child - method3");
	}
	
	public static void main(String[] args) {
		//객체생성 및 자동 타입 변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//강제타입변환
		Child child = (Child) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
	}

}
