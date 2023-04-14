package api;

public class MathTest {

	public MathTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println((int)Math.ceil(5.1) + ", " + Math.ceil(-5.1)); // 6 ==> 올림(큰값)

		int n = (int)Math.round(52.7);
		int n2 = Math.round((float)52.3);
		System.out.println(n);
		System.out.println(n2);
		
		System.out.println(Math.floor(8.9) + ", " + Math.floor(-3.1)); // 버림
		
		System.out.println(Math.sqrt(10)); // 루트
		
		System.out.println((int)Math.pow(5.6, 3.5)); // 5.6의 3.5승
	}

}
