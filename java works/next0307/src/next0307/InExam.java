package next0307;

public class InExam {

	public static void main(String[] args) throws Exception{
		int speed =0;
		int keyCode= 0;
		
		while(true) {
			//enter키를 읽지 않았을 경우
			if(keyCode != 13 && keyCode!=10) {
				if(keyCode ==49) {
					speed++;
				}
			}else if(keyCode == 50) {
				speed--;
				
			}else if(keyCode == 51) {
				break;
			}
			System.out.println("----------------");
			System.out.println("1. up |2.down |3.stop");
			System.out.println("----------------");
			System.out.println("speed" + speed);
			System.out.println("choice");
		}
		//키를 하나씩 알아야 한다
		keyCode = System.in.read();
	}
	
	
	
}

