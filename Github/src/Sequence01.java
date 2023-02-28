

import java.util.Scanner;

/*
[실행결과]
15	<== 입력
1 2 4 7 8 11 13 14
*/
public class Sequence01 {

	public Sequence01() {
		
	}
	static void num(int cnt) {
		for(int i=1; i<=cnt; i++) { // 1,2,3,4,5,....,cnt
			if(i%3!=0 && i%5!=0) {// 3의 배수, 5의 배수가 아니여야함
				System.out.print(i+" ");
			}
		}
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		num(cnt);
		
	}

}
