package next0216;

public class Calculator {
	
	//return이 없는 메소드
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	int add(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
}
