package basic;
import java.util.Scanner;

public class Ex04For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.print("단입력->");
		
		int dan = scan.nextInt();
		
		if(2 <= dan && dan <= 9) {
			for(int i=2; i<=9; i++) {
				int result = (dan * i);
				System.out.print(dan + " * " + i + " = " + result + "\n");
				}
		}else {
			System.out.println("단을 잘못입력하였습니다.");
		}
		}while(true);
	}
}
/*
구구단 (2단~9단)
[실행]
단입력->10
단을 잘못입력하였습니다.

단입력->5
5 * 2 = 10
5 * 3 = 15
:
:
5 * 9 = 45
*/