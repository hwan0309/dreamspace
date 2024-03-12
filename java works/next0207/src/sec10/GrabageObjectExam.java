package sec10;

public class GrabageObjectExam {

	public static void main(String[] args) {
		
		String hobby = "여행"; 	//힙영역에 "여행"이라는 객체가 생성되고 주소가 hobby에 할당
		hobby = null; 	//"여행"이라는 String 객체가 쓰레기가 됨
		
		String bestCar ="스포티지";
		String worstCar = bestCar; //bestCar에 저장된 겍체 번지를 WorstCar에 대입	
		bestCar = null; 	//worstCar가 null로 쓰레기처리 되지 않았기에 출력가능
		
	}

}
