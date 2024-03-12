package next0220;

public class Television {
		
		static String company = "LG"; //정적필드는 바로 초기화 진행
		static String model = "OLED";
		static String info;	//정적블록 선언법
		static {
		info = company + "/" + model; 
		}
		
		int pay = 2000000;
		String color;
		
		void method1(int getpay) {	//인스턴스 메소드
			this.pay = getpay;
			this.color = "red";
			System.out.println(this.pay + "/" + this.color);
		}
		
		static void method2() {	//정적메소드
			System.out.println(info);
		}
	}

