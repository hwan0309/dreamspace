package next0221;

public class B {

	A a1 = new A(true);	// public 생성자로 접근가능
	A a2 = new A(1);	//default 생성자로 같은 패키지는 접근가능 다른 패키지면 접근 불가
	A a3 = new A("String");  //private 생성자로 접근 불가
	
	a.field1 = 1;
	a.field2 = 1;
	a.field3 = 1;
	
	a.method1();
	a.method2();
	a.method3();
}
