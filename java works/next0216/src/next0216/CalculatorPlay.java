package next0216;

public class CalculatorPlay {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int r1 = myCalc.add(5, 10);
		System.out.println(r1);
		
		int x = 10, y = 30;
		double r2 = myCalc.divide(x, y);
		System.out.println(r2);
		
		myCalc.powerOff();
	}

}
