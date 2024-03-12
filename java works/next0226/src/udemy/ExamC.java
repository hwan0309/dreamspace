package udemy;

import next0226.ExamA;

public class ExamC extends ExamA {
	
	public static void main(String[] args) {
	
	
	}
	@Override
	public void Country() {
		System.out.println(ExamA.Country);
		super.Country();
	}

	@Override
	public void Birthday() {
		super.Birthday();
	}
	
}
