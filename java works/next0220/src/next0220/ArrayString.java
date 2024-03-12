package next0220;

import java.time.LocalDate;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] daysOfWeek = {"sunday", "Monday", "Tuesday", "Wednesday","Friday"};
		
		String dayWithMostCharacters = "";
		
		for(String day: daysOfWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with Most Number of characters" + dayWithMostCharacters);
	}

}
