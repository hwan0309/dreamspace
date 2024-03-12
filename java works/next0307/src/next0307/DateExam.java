package next0307;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateExam {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.mm.dd hh : mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
