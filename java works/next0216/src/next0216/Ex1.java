package next0216;
public class Ex1 {
	
	//필드
	String company = "hyundai car";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Ex1
	(String model){
		this.model = model;
	}
	Ex1
	(String model, String color){
		this.model = model;
		this.color = color;
	}
	Ex1
	(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
