

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {
		
	}
	public void start() {
		// 두수를 입력받아 합, 차, 곱, 몫을 구하는 프로그램을 작성하라.
		Scanner scan = new Scanner(System.in);
	try { // try영역 : 예외가 발생가능한 코드, 또는 예외발생가능성이 없는 코드를 함께 기술할 수 있다.
		System.out.print("첫번째수=");
		int num1 = scan.nextInt(); // <----------예외발생가능지점
		System.out.print("두번째수=");
		int num2 = scan.nextInt(); // <----------예외발생가능지점
		
		int hap = num1 + num2;
		int mul = num1 * num2;
		int cha = num1 - num2;
		int div	= num1 / num2; // <----------예외발생가능지점
		
		// 5 + 10 = 15
		// printf(String format, Object... args)
		System.out.printf("%-5d + %-5d = %7.2f\n", num1, num2, (double)hap);
		System.out.printf("%d - %d = %d\n", num1, num2, cha);
		System.out.printf("%d * %d = %d\n", num1, num2, mul);
		System.out.printf("%d / %d = %d\n", num1, num2, div);
		
		int data[] = {10,20,30};
		System.out.println("배열->" + data[data.length-1]);
	}catch(InputMismatchException e) { // try영역에서 예외가 발생하면 해당 catch로 이동한다.
		System.out.println("숫자를 입력하세요.");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}catch(ArithmeticException ae) {
		System.out.println("두번째값은 0을 입력하지 마세요.");
		ae.printStackTrace();
		System.out.println(ae.getMessage());
	}catch(ArrayIndexOutOfBoundsException aioe) {
		System.out.println(aioe.getMessage());
	}finally { // 항상 실행(에러 유무 상관 없이)
		System.out.println("무조건 실행됨.");
	}
}
	public static void main(String[] args) {
		new ExceptionTest1().start();
	}

}
