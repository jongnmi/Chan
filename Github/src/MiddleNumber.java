

import java.util.Scanner;

/*
 [문제]
 3개의 정수를 입력받아 중간값을 출력하라.
 
 [실행결과]
 54
 75
 34
 54
 */
public class MiddleNumber {

	public MiddleNumber() {
		
	}
	static void middle(int data1, int data2, int data3) {
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		if(data1 >= data2) {
			if (data3>=data1) {
				System.out.println(data1); // 3 1 2
			}else {
				if(data2>=data3) {
					System.out.println(data2); // 1 2 3
				}else if(data3>=data2) {
					System.out.println(data3); // 1 3 2
				}
			}
		}else if(data1 >= data3) {
			if(data2>=data1) {
				System.out.println(data1); // 2 1 3
			}
		}else if(data2 >= data3) {
			if(data3>=data1) {
				System.out.println(data3); // 2 3 1
			}
		}else {
			System.out.println(data2); // 3 2 1
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data1 = Integer.parseInt(scan.nextLine());
		int data2 = Integer.parseInt(scan.nextLine());
		int data3 = Integer.parseInt(scan.nextLine());
		
		middle(data1, data2, data3);

	}

}
