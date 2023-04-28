package basic;

public class Array01 {

	public static void main(String[] args) {
		int a;
		// 같은 데이터형의 변수가 여러개 필요할때 선언하여 사용한다.
		// 크기를 변경할 수 없다.
		// 1차원 배열 선언하는 방법
		
		int score[];
		int[] jumsu;
		// 정수 값을 5개 저장할 수 있는 배열형 객체
		// 초기값 - 정수:0, 실수:0.0, 논리형:false, 그외 객체타입:null
		int[] data = new int[5]; // 0
		String name[] = new String[5]; // null
		
		data[2] = 90;
		name[1] = "홍길동";
		
		// 배열명.length : 배열의 길이
		for(int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "]=" + data[i] + ",\tname[" + i + "]=" + name[i]);
		}
	}

}
