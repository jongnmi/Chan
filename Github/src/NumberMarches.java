

import java.util.Random;
import java.util.Scanner;

/*
[처리조건]
두자리수의 난수(25)를 생성하여 맞추는 게임을 작성하라.

[처리결과]
숫자입력=56
컴퓨터의 수가 더 작습니다.
숫자입력=24
컴퓨터의 수가 더 큽니다.
숫자입력=25
축하합니다. 3번만에 맞추셨습니다.
계속하시겠습니까?(Y/y)? y

숫자입력=56
컴퓨터의 수가 더 작습니다.
숫자입력=24
컴퓨터의 수가 더 큽니다.
숫자입력=25
축하합니다. 3번만에 맞추셨습니다.
계속하시겠습니까?(Y/y)? n
*/
public class NumberMarches {
//	Scanner scan = new Scanner(System.in);
//	Random ran = new Random();
//	public NumberMarches() {
//		
//		int ans = ran.nextInt(10+99-1)+1;
//		
//		for(int i=1;;i++) {
//			System.out.print("숫자입력=");
//			int num = scan.nextInt();
//			if(num==ans) {
//				System.out.println("축하합니다. " + i + "번만에 맞추셨습니다.");
//				System.out.print("계속하시겠습니까(Y/y)?");
//				String y = scan.next();
//				if(y=="y") {
//					continue;
//				}else if(y=="Y"){
//					continue;
//				}else {
//					break;
//				}
//			}else if(num>ans) {
//				System.out.println("컴퓨터의 값이 더 작습니다.");
//			}else {
//				System.out.println("컴퓨터의 값이 더 큽니다.");
//			}
//	}
	

	public static void main(String[] args) {
//		new NumberMarches();
		Scanner scan = new Scanner(System.in);
		String sign="";
		do {
			int compute = (int)(Math.random()*(99-10+1)) + 10; // 난수를 생성 10~99
			int cnt = 1;
			do {
				System.out.print("숫자입력=");
				int userin = Integer.parseInt(scan.nextLine());
				
				if(compute > userin) {
					System.out.println("컴퓨터의 수가 더 큽니다.");
				}else if(compute < userin) {
					System.out.println("컴퓨터의 수가 더 작습니다.");
				}else {
					System.out.println("축하합니다. " + cnt + "번째에 맞추셨습니다.");
					break;
				}
				cnt++;
			}while(true); // compute 변수의 값을 맞출때까지 반복
			System.out.print("계속하시겠습니까(Y/y)?");
			sign = scan.nextLine();
			
//		}while(sign.equals("Y") || sign.equals("y"));
		}while(sign.equalsIgnoreCase("Y"));
	}

}
