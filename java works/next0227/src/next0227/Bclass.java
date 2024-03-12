package next0227;

public class Bclass {
	public void method() {	//메소드 선언
	Aclass a = new Aclass(); 	//같은 패키지 안에서 protected는 사용가능
	a.field = "value";
	a.method();
	}
}
