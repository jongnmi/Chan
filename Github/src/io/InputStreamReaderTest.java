package io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() {
		// InputStreamReader : 콘솔에서 문자(유니코드)단위로 입력받는 클래스
		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			while(true) {
//			int strInt = isr.read(); // 1번에 1문자씩 읽어온다.
//			System.out.println(strInt + "-->" + (char)strInt);
				
			//배열을 이용한 입력
			char[] str = new char[10];
			
			int cnt = isr.read(str);
			// new String(str),	String.valueOf(str);
			System.out.println(cnt + "-->" + String.valueOf(str));
		}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InputStreamReaderTest();

	}

}
