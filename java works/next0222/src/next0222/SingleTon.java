package next0222;

public class SingleTon {

	public static SingleTon main(String[] args) {
		//private 접근 권한을 갖는 정적 필드 선언과 초기화
		private static SingleTon singleton = new singleton();
		
		String str = "SingleTon Objects";
		//private 접근 권한을 갖는 생성자 선언
		private SingleTon getInstance() {
			return singleton;
		}
		
		//public 접근 권한을 갖는 정적 메소드 선언
		//public static 
		
	}

}
