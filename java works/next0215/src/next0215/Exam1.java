package next0215;

public class Exam1 {

	public static void main(String[] args) {
		
	//1번 배열에서 최대 값 출력
//		int[] array = {1, 5, 3, 8, 2};
//		int sum=0;
//		int i;
//		for(i=0; i<array.length; i++) {
//			if(sum < array[i]) {
//				sum = array[i];
//			}
//		}
//		System.out.println(sum);
		
	//2번 배열의 전체합과 평균을 출력
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0.0;
		int all = 0;
		for(int i =0; i<array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				all++;
			}
		}
		avg = (double) sum / all;
		System.out.println(sum);
		System.out.println(avg);
	}

}
