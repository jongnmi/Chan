package basic;
import java.util.Scanner;

public class Ex01Operator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사과의 개수 => ");
		int dataInt = scan.nextInt();
		
		int result = (dataInt % 8 == 0)? (dataInt / 8) : ((dataInt / 8) + 1);
		System.out.println("바구니는 " + result + "개가 필요합니다.");
	}

}
/*
[처리조건]
사과의 갯수를 정수로 입력받아 바구니의 수를 구하라.
단, 1바구니에는 8개의 사과를 담을수 있다.

[실행]
사과의 개수 => 12
바구니는 2개가 필요합니다.
*/
