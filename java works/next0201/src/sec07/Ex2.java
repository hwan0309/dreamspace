package sec07;

public class Ex2 {

	public static void main(String[] args) {
	
		
		//1번
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //y는 --가 뒤에 있기에 z연산 후 마지막에 연산
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		//2번
		int score = 85;
		String result = (!(score > 90))? "가" : "나";
		System.out.println(result);
		
		//3번
		int pencils = 534;
		int students = 30;	
		//학생 한명이 가지는 연필 수
		double pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);		
		//남은 연필 수
		double pencilsLeft = (students % pencils);
		System.out.println(pencilsLeft);
		
		//4번
		int value = 365;
		System.out.println(value - 65);
		
		//5번
		
		//6번
		int x2= 10;
		int y2 = 5;
		System.out.println( (x2 > 7) && (y2 <= 5) );
		System.out.println( (x2 % 3 == 2) && (y2 % 2 != 1) );
		
		//7번
		double x3 = 5.0;
		double y3 = 0.0;
		double z3 = 5 % y;
		
		if(Double.isNaN(z3)) {		
			System.out.println("0.0으로 나눌 수 없습니다");		
	}else {
		double result1 = z3 + 10;
		System.out.println("결과 : " + result1);
	}
	
	}
		}
	


