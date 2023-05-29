package basic;
import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 = ");
		int age = scan.nextInt();
		
		System.out.print("성별(1:남성,2:여성) = ");
		int gen = scan.nextInt();
		
		System.out.print("키 = ");
		int height = scan.nextInt();
		
		System.out.print("현재체중 = ");
		int weight = scan.nextInt();
		
		int stan = 80;
		if(age<=35) {
			if(gen==1) {
				stan = (int)((height - 100) * 0.9);
			}else if(gen==2) {
				stan = (int)((height-100) * 0.85);
			}
		}else if(age>=36) {
			if(gen==1) {
				stan = (int)((height-100) * 0.95);
			}else if(gen==2) {
				stan = (int)((height-100) * 0.90);
			}
		}
		System.out.println("표준체중 = " + stan);
		
		double stan2 = ((double)weight/(double)stan) * 100;
		
		System.out.println(stan2);
		
		String inbody = "A";
		if(stan2>=126) {
			inbody = "비만형";
		}else if(stan2>=116) {
			inbody = "조금 비만형";
		}else if(stan2>=96) {
			inbody = "표준형";
		}else if(stan2>=86) {
			inbody = "조금마른형";
		}else {
			inbody = "마른형";
		}
		System.out.println("당신의 표준체중지수는 " + stan2 + "으로 " + inbody + "입니다.");
	}

}
