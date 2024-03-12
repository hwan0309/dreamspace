package udemy;

import java.math.BigDecimal;

class Test implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class EclipesTipsAndTricks {

	public static void main(String[] args) throws InterruptedException {
		DummyForTest dt = new DummyForTest();
		dt.doSomething();
		
		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(1000 * 45 * 456);	//ctrl 1 으로 다양한 메소드 변경 가능
	}

}
