package sec02;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		label:for(i=2;i<10;i++) {
			for(j=2;j<10;j++) {
				if(i == 4) {
					break label;
				}
				System.out.println(i +"*" + j + "=" + (i * j));
			}
		}
	}
	

}
