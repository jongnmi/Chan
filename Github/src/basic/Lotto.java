package basic;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for(int k=0;;) {
			System.out.print("게임수 = ");
		int game = scan.nextInt();
		int[] data = new int[6];
		for(int j=1; j<=game; j++) {
		for(int i=0; i<=5; i++) {
			int num = ran.nextInt(1+45-1)+1;
			data[i] = num;
		}
		int bonus = ran.nextInt(1+45-1)+1;
		Arrays.sort(data);
		System.out.println(j + "게임=" + Arrays.toString(data) + ", " + "bonus=" + bonus);
		}
		System.out.print("계속하시겠습니까(1:예, 2:아니오)?");
		int ans = scan.nextInt();
			if(ans==2) {
				break;
				}
			else {
				continue;
				}
		}
	}

}
