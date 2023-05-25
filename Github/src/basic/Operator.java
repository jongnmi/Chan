package basic;

public class Operator {

	public static void main(String[] args) {
		// 연산자
		// 산술연산자(+, -, *, /, %)
		// 부호 (+, -)
		// 대입연산자 (=, +=, -=, *=, /=, %=)
		int n1 = 1230;
		n1 *= 2; // n1 = n1 * 2;
		System.out.println("n1 = " + n1);
		
		// 증감연산자 : ++, --
		char c = 'A';
		c++; // B
		++c; // C
		c--; // B
		System.out.println("c => " + c);
		
		int n = 5;
		int result = n++ + 10;
		// 6, 15
		System.out.println("n = " + n + ", result = " + result);
		
		int result2 = n + 2 * 8 / (2 % (7 + 2) - 3) * 3;
		System.out.println("result2 => " + result2);
		
		// 비트연산자 (2진수로 계산하기)
		// &. |, ^(XOR), ~
		int a = 10; 	// 00001010
		int b = 3;  	// 00000011
		int r1 = a & b; // 00000010 => 2
		System.out.println("r1 => " + r1);
		
		int r2 = a | b; // 00001011 => 11
		System.out.println("r2 => " + r2);
		
		int r3 = a ^ b; // 00001001 => 9
		System.out.println("r3 => " + r3);
		
		// 단항연산자	~ : 0 => 1, 1 => 0 (부정의 기능) 
		int r4 = ~ b;	// 11111100(앞자리 1이니까 -) => 00000011(1'의 보수 적용) => 00000100(+1해서 2의 보수) => -4
		
		// 2의 보수 => 1의 보수 + 1
		// 1의 보수 => 0은 1로, 1은 0으로 바꾸는 것
		// 보수 => 음수를 해석하기 위해 사용
		System.out.println("r4 => " + r4);
		
		// 쉬프트 연산자 : 비트를 왼쪽 또는 오른쪽으로 이동하며 연산하기
		// <<, >>, >>>
		// << (왼쪽으로 이동), >> (오른쪽으로 이동, 빈자리는 부호로 채워짐), >>> (오른쪽으로 이동, 빈자리를 0으로 채움)
		int r5 = a << 3;	// 00001010 => 01010000 => 80
		System.out.println("r5 => " + r5);	// 10 * 2^3
		
		int r6 = a >> 3;	// 00001010 => 00000001(부호가 0이므로 0으로 채움) => 1
		System.out.println("r6 => " + r6);
		
		int r7 = r4 >> 3;	// 11111100 => 11111111(부호가 1이므로 1로 채움) => 00000000 => 00000001 => -1
		System.out.println("r7 => " + r7);
		
		int r8 = r4 >>> 3;	// int가 4byte라서 숫자가 크게 나옴
		System.out.println("r8 => " + r8);
	}
}
