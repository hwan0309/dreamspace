package Udemy;

import java.util.List;
import java.util.stream.Collectors;

public class FpNumberRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(4,6,8,13,3,15);
//		numbers.stream()
//			.forEach(element->System.out.println(element));
//		
//		
//		int sum = numbers.stream().reduce(
//				0,
//				(number1, number2)->number1 + number2
//					);
//	
//		System.out.println(sum);
//	
//
//	private static int normalSum(List<Integer> numbers) {
//		int sum = 0;
//		for(int number:numbers) {
//			sum += number;
//		}
//		return sum;
//	}
		//배열 소문자 출력
		List.of("Apple","Anteerere", "Bat").
		stream().map(s->s.toLowerCase()).forEach(p->System.out.println(p));
		//배열의 문자 길이 출력
		//stream().map(s->s.length()).forEach(p->System.out.println(p));
		
		
		
		List.of(23,12,34,53).stream().filter(e -> e%2==1).collect(Collectors.toList());
		
		//numbers.stream().forEach(element->System.out.println(numbers));
	
		
}
}
