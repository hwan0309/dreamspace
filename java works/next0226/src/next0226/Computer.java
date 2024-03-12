package next0226;

public class Computer extends Clacculator{
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *r *r;
	}
}
