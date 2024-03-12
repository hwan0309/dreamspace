//Q1
package next0306;
import java.util.Scanner;
public class Example01 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int number = scanner.nextInt();
	String name = scanner.next();
	double number2 = scanner.nextDouble();
	
	System.out.println(number + 1);
	System.out.println(name);
	System.out.println(number2 -1);
	
	scanner.close();
	}
}


