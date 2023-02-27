
/*
     *
    ***
   *****
  *******
 *********  
 
 *********
  *******
   *****
    ***
     *
*/
public class Triangle {
	static void startTriangle(int max) {
		// int max = 9;
		for(int i=1; i<=max; i+=2) { // 출력문자수 1, 3, 5, 7, 9
			// 공백 출력	(max-i)/2 => 공백의 수
			for(int s=1; s<=(max-i)/2; s++) { // 1 --> 4
				System.out.print(" ");
			}
			// 문자 출력
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void startTriangle2(int max) {
		for(int i=max; i>=1; i-=2) {  // 9 7 5 3 1
			for(int s=1; s<=(max-i)/2; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		startTriangle(9);
		startTriangle2(9);
	}

}
