package basic;
import java.util.Scanner;

public class Ex02Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수=");
		int kor = scan.nextInt();

		System.out.println("영어점수=");
		int eng = scan.nextInt();
		
		System.out.println("수학점수=");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		System.out.println("총점=" + total);
		
		double avg = (total / (double)3); // total/3.0
		System.out.println("평균=" + avg);
		
		int gr = (int)avg / 10;
		String grade = "A";
		switch(gr) {
			case 10:
				grade = "A";
				break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
		}
		System.out.println("학점=" + grade);
	}

}
/*
[처리조건]
콘솔에서 국어, 영어, 수학점수를 입력받아 다음과 같이 출력하라.
단, 평균은 실수로 구한다.
	학점은 switch문을 이용한다.

[실행결과]
국어점수=70
영어점수=80
수학점수=90
총점=240
평균=80.0
학점=B
*/