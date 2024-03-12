package next0223;

public class AnimalExam {

	public static void main(String[] args) {
		
		Animal aa = new Animal();	//부모 클래스
		
		Bird bb = new Bird();	//부모클래스를 상속받은 자식
		Cat cc = new Cat();
		Duck dd = new Duck();
		
		aa.cry();	//부모클래스의 cry() 메소드를 자식들이 자신에 맞게 오버라이딩해서 사용
		bb.cry();
		cc.cry();
		dd.cry();
	}

}
