package basic;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex11Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random(); // Math.random()
		// 로또 번호 생성기
		
		do {// 전체 반복
			//1. 게임수 입력
			System.out.print("게임수=");
			int cnt = scan.nextInt();
			
			for(int i=1; i<=cnt; i++) { // 게임수 만큼 반복실행
				// 난수생성(7개)
				int lotto[] = new int[7]; // 번호 6개와 보너스를 담을 배열
				for(int j=0; j<=6; j++) {
					lotto[j] = random.nextInt(1+45-1)+1; // 1~45
					//중복검사 : 이전에 만든 값중 같은 값이 존재하는지 찾은 후 중복되면 지금 만든값을 버린다.
					for (int k=0;k<j;k++) {
						if(lotto[k]==lotto[j]) {
							j--;
							break;
						}
					}//
				}
				//7개의 난수 생성이 된경우
				int lottoNum[] = Arrays.copyOfRange(lotto,0,6);
				Arrays.sort(lottoNum);
				System.out.print(i + "게임=" + Arrays.toString(lottoNum));
				//보너스
				System.out.println(", bouns=" + lotto[6]);
			}//게임수
			//계속여부확인
			System.out.print("계속하시겠습니까(1:예, 2:아니오)?");
			int que = scan.nextInt();
			if(que==2) break;
		}while(true);
		System.out.println("프로그램이 종료되었습니다.");
	}

}
