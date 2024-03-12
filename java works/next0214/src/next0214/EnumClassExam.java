package next0214;

import java.util.Calendar;

public class EnumClassExam {

	public static void main(String[] args) {
		
		Exam today = null;
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int mount = now.get(Calendar.MONTH) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		switch(week) {
		case 1:
			today = Exam.SUNDAY;
			break;
		case 2:
			today = Exam.MONDAY;
			break;
		case 3:
			today = Exam.TUESDAY;
			break;
		case 4:
			today = Exam.WEDNESDAY;
			break;
		case 5:
			today = Exam.THURSDAY;
			break;
		case 6:
			today = Exam.FRIDAY;
			break;
		case 7:
			today = Exam.SATURDAY;
			break;
			
		}
		if(today == Exam.SUNDAY) {
			System.out.println("sunday morning");
		}else if(today == Exam.TUESDAY) {
			System.out.println("sunday lunch");
		}else if(today == Exam.WEDNESDAY) {
			System.out.println("sunday dinner");
		}
	}

}
