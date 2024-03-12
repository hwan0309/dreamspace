package next0214;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      String board = "1, 자바 학습, 참조 타입 String을 공부합니다., 김철수";
		      //쉼표를 기준으로 문자를 분리
		      String[] tks = board.split(",");
		      
		      //인덱스로 읽어오기
		      System.out.println("번호 : " + tks[0]);
		      System.out.println("제목 : " + tks[1]);
		      System.out.println("내용 : " + tks[2]);
		      System.out.println("이름 : " + tks[3]);
		      System.out.println("+++++++++++++++++");
		      System.out.println("");
		      
		      
		      //for문을 이용하여 출력
		      //length length() 차이 구분하기.
		      for(int i = 0; i<tks.length; i++) {
		         System.out.println(tks[i]);
		      }
		      
		      //배열 선언과 생성
		      int[] arr1 = new int[3];
		      
		      //초기값을 셋팅됨
		      for(int i = 0; i<3; i++) {
		         System.out.print(arr1[i] + ", ");
		      }
		      System.out.println("++++++++++++++++++++");
		      arr1[0] = 20;
		      arr1[1] = 40;
		      for(int i = 0; i<3; i++) {
		         System.out.print(arr1[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      
		      double[] num = new double[5];
		      for(int i = 0; i<5; i++) {
		         System.out.print(num[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      num[0] = 1.123;
		      num[2] = 3.12;
		      for(int i =0; i<5; i++) {
		         System.out.print(num[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      String[] arr3 = new String[4];
		      for(int i = 0; i<4; i++) {
		         System.out.print(arr3[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      arr3[0] = "봄";
		      arr3[1] = "여름";
		      arr3[2] = "가을";
		      arr3[3] = "겨울";
		      for(int i = 0; i<arr3.length; i++) {
		         System.out.print(arr3[i] + ", ");

		      }
		   }


		   }
		
