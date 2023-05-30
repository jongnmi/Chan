package basic;

public class Variable {
	// 멤버변수
	public static void main(String[] args) {
		// 기본 데이터형
		// 정수(byte, short, int(기본), long)
		// 국어점수 0~100점
		byte kor = 97;
		byte eng = (byte)130; // 데이터형 변환(int => byte)
		// 클래스명.변수.메소드명();	"" => 문자열, String
		System.out.println("kor = " + kor);
		System.out.println("eng = " + eng);
		
		int data = kor; // 자동 데이터형 변환 : 작은 데이터 타입을 큰 데이터 타입으로 대입할 때
		byte mat = (byte)data;
		
		//   8byte(long) 4byte(int)
		long data2 = 2152542599L; //끝에 L을 붙여주면 상수가 long형 이라는 뜻
		
		// 실수(float, double(기본))
		double n1 = 15.3;
		float n2 = (float)15.3;
		
		// 정수 < 실수
		int data3 = (int)n1; // 실수를 정수로 바꾸면 소수 이하 버림
		System.out.println("data3 = " + data3);
		
		boolean boo = true;
		
		// 문자형 - 1글자를 저장할 수 있다. 1글자 이상은 문자열로
		char c1 = 'A'; // '한'
		String name = "홍길동";
		
		c1++;
		System.out.println("cl = " + c1); // B => 66
		// char + int = int
		c1 = (char)(c1 + 1); // B(66) + 1 = C(67)
		// int + double => double
		int result = (int)(data3 + n1); // 15 + 15.8 = 30
		System.out.println(c1 + ", " + result); // C,30
		char c2 = 'B';
		int result2 = c1 + c2; // 67 + 66 = 133
		System.out.println(result2);
		
		int data4 = 0;
		System.out.println(data4);
		
		// int / int = int (10 / 3 = 3)
		// int / double = double (10 / 3.0 = 3.33333)
	}
	
}