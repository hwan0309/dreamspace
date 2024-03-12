package Udemy;

import java.util.List;

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
	List.of(23,43,36,48).stream()
		.filter(n->n%2 ==0).
		forEach(e -> System.out.println(e));
	}

}
