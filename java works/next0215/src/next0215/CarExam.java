package next0215;

public class CarExam {

	public static void main(String[] args) {
		
	//car 객체불러오기
	Car	myCar = new Car();
	System.out.println("Model " + myCar.model);
	System.out.println(myCar.start);
	System.out.println(myCar.speed);
	
	//car 객체의 필드값 변경
	myCar.speed = 60;
	System.out.println(myCar.speed);
	}

}
