import java.util.*;

public class YoilTest {

	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);
		int newMonth = scan.nextInt();
		int newDay = scan.nextInt();
		
		Date date = new Date(newMonth, newDay);
		System.out.println(date.getYoil());
		
		scan.close();
	}

}

class Date {
	private int month;
	private int day;
	private String yoil;
	private String yoilArray[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	
	public Date (int inputMonth, int inputDay) {
		month = inputMonth;
		day = inputDay;
		calcYoil();
	}
	
	int lastDay (int inputMonth) {
		int lastDay = 0;
		
		switch(inputMonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		case 2:
			lastDay = 28;
			break;
		default:
			break;
		}
		
		return lastDay;
	}

	String getYoil() {
		return yoil;
	}
	
	int calcDaysFromBaseDate () {
		int totalDays = 0;
		
		for (int i = 1; i < month; i++) {
			totalDays += lastDay(i);		
		}
		totalDays += day;
		
		return totalDays;
	}
	
	void calcYoil() {
		yoil = yoilArray[calcDaysFromBaseDate() % 7];
	}
}
