package basic;
import java.util.Scanner;
import java.util.Calendar;

public class EX05ConsoleCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calendar now = Calendar.getInstance();
		
		System.out.print("년도=");
		int year = scan.nextInt();
		
		System.out.print("월=");
		int month = scan.nextInt();
		
		System.out.print("\t" + "\t" + year + "년 " + month + "월" + "\n");
		
		String weekStr;
		for(int i=0; i<=1; i++) {
			switch(i) {
			case 1: weekStr = "일"; System.out.print(weekStr + "\t");
			case 2: weekStr = "월"; System.out.print(weekStr + "\t");
			case 3: weekStr = "화"; System.out.print(weekStr + "\t");
			case 4: weekStr = "수"; System.out.print(weekStr + "\t");
			case 5: weekStr = "목"; System.out.print(weekStr + "\t");
			case 6: weekStr = "금"; System.out.print(weekStr + "\t");
			case 7: weekStr = "토"; System.out.print(weekStr + "\n");
			}
		}
		
		int day = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int j=1; j<=day; j+=7) {
			for(int i=1; i<=7; i++) {
				for(int k=1; k<=7; k++) {
				System.out.print(k + "\t");
				
				}
			}
		}
		
		
	}
}
