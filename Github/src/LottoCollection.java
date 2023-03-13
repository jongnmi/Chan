
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	public LottoCollection() {
		
	}
	public void gameStart() {
		do {
			int cnt = gameCount();
			for(int i=1; i<=cnt; i++) {
				System.out.print(i+"게임="); // 1게임=[3,7,24,26,32,34], bonus=4
				createLotto();
			}
			if(!endQuestion()) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}while(true);
	}
	// 1개 번호 생성
	public void createLotto() {
		// 번호 6개와 마지막에 생성된 번호가 보너스 번호 1개를 생성
		// 컬렉션 사용불가
		// api정렬메소드 사용불가
		// 게임수 6 + 보너스
		int lotto[] = new int[7];
		
		// 난수 7개생성, 중복검사
		for(int i=0; i<lotto.length; i++) { // 0,1,2,3,4,5,6
			lotto[i] = random.nextInt(45)+1;
			
			// 현재만든 i번째와 i번째 이전 index 위치의 값과 같은지 비교
			for(int j=0; j<i; j++) { // 
				if(lotto[i] == lotto[j]) { // i번째 번호를 다시 생성
					i--;
					break;
				}
			}
		}
		lottoBubbleSort(lotto);
		lottoOutput(lotto);
	}
	// 번호 출력
	public void lottoOutput(int lotto[]) {
		// 1게임=[3, 7, 24, 26, 32, 34], bonus=4
		String txt = "[";
		for(int i=0; i<lotto.length; i++) {
			txt += lotto[i];
			if(i==5)
				txt += "], ";
			else
				txt += ", ";
		}
		System.out.println(txt + "bonus=" + lotto[6]);
	}
	
	// 정렬
	public void lottoBubbleSort(int lotto[]) {
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length-i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
	}
	
	// 게임수 입력
	public int gameCount() {
		do {
			try {
				System.out.print("게임수->");
				String cntString = scan.nextLine();
				int cnt = Integer.parseInt(cntString); // 1~10 게임수만
				
				// 게임수의 최대, 최소값 범위 확인
				if(cnt>=1 && cnt<=10) { // 정상 게임수
					return cnt;
				}else { // 게임수 범위 벗어남
					System.out.println("게임수는 1~10까지만 가능합니다.");
				}
			}catch(NumberFormatException nnf) {
				System.out.println("게임수는 숫자이여야 합니다.");
			}
		}while(true);
	}
	// 계속 여부 확인
	public boolean endQuestion() {
		// y, Y : 예
		// n, N : 아니오
		// 그외 : 다시질문
		do {
			System.out.print("계속하시겠습니까(y or Y : 예, n or N : 아니오)?");
			String yn = scan.nextLine();
			// equals() -> 대소문자 구별
			// equlasIgnoreCase() -> 대소문자 구별 X
			if(yn.equalsIgnoreCase("Y")) { // 계속한다
				return true;
			}else if(yn.equalsIgnoreCase("N")) { // 그만한다
				return false;
			}
		}while(true);
	}

	public static void main(String[] args) {
		LottoCollection lotto = new LottoCollection();
		lotto.gameStart();

	}

}
