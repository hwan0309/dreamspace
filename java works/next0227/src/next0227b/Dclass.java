package next0227b;

import next0227.Aclass;

public class Dclass extends Aclass {
	public Dclass() {
		//Aclass 호출
		super();
	}
	//메소드 선언
	public void method1() {
		//Aclass 필드 변경
		this.field = "value";
		
		//Aclass 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
		
//		Aclass a = new Aclass();	//상속을 받았어도 procted 접근 제한자가 있는 클래스를 직접 호출하여 사용불가
//		a.field = "value";
//		a.method();
	}
}
