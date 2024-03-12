package next0223;

public class InheritanceRunner extends Inheritance{
	
	//필드
	public boolean wifi;
	
	//생성자 
	public InheritanceRunner(String model, String color) {
		this.model = model;
		this.color = color;
	}

	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi 상태를 변경했습니다");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	
	}
}
