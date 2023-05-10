package basic;
import java.util.Scanner;

public class EX03For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수(5이상)?");
		int num = scan.nextInt();
		
		int oddsum = 0;
		for (int i=1; i<=num; i++) {
			oddsum = oddsum + i;
		}
		System.out.print("1~" + num + "까지의 합은 " + oddsum + "\n");
		
		int oddsum2 = 0;
		for (int i=1; i<=num; i=i+2) {
			oddsum2 = oddsum2 + i;
		}
		System.out.print("1~" + num + "까지의 홀수의 합은 " + oddsum2 + "\n");
		
		int oddsum3 = 0;
		for (int i=1; i<=num; i++) {
			if(i%2==0) {
				oddsum3 = oddsum3 + i;
			}
		}
		System.out.print("1~" + num + "까지의 짝수의 합은 " + oddsum3 + "\n");
		
		int oddsum4 = 0;
		for (int i=1; i<=num; i++) {
			if(i%3==0) {
				oddsum4 = oddsum4 + i;
				}
		}
		System.out.print("1~" + num + "까지의 3의 배수의 합은 " + oddsum4);
	}

}
/*
[실행]
정수(5이상)?9
1~9까지의 합은 45
1~9까지의 홀수의 합은 25
1~9까지의 짝수의 합은 20
1~9까지의 3의 배수의 합은 18
*/