package next0223;

public class Runner {

	public static void main(String[] args) {
		
		//객체 생성
		InheritanceRunner myPhone = new InheritanceRunner("갤럭시","핑크골드");
	
		//상속받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//wifi 필드
		System.out.println("와이파이 상태 :" + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.reveiveVoice("여보세요? 좋은대출 있어 전화드렸어요");
		myPhone.sendVoice("제가 지금 바빠요");
		myPhone.hangUp();
		
		//Inhertance 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
