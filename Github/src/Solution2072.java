

import java.util.Scanner;

public class Solution2072 {
	public static void start() {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		for(int i=1; i<=cnt; i++) {
			int sum = 0;
			for(int j=1; j<=10; j++) {
				int data = scan.nextInt();
				if(data%2==1) sum+=data;
			}
			System.out.println("#" + i + " " + sum);
		}
	}

	public static void main(String[] args) {
		start();
	}

}
