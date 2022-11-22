package Assignment;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Time {
	public static void main(String[] args) {
		
	     SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
	     Date date = new Date();
	     System.out.println("Current Time:  " + dateFormat.format(date));
	     Calendar c = Calendar.getInstance();
	     c.setTime(date);
	     c.add(Calendar.MINUTE,300);
	     
	     Date current= c.getTime();
	     
	     System.out.println("Updated Time:  " + dateFormat.format(current));
	}
}
