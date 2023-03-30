package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public FileOutputStreamTest() {
		// FileOutputStream : byte 단위로 파일로 쓰기(출력을 파일로)
		
		try {
			File file = new File("D://java_test", "my_data.txt");
			
			FileOutputStream fos = new FileOutputStream(file);
			
			String [] inData = {"자바에서 문자열을", "파일로 쓰기 연습중\n", "FileOutputStream객체 활용함."};
			for(String data : inData) {
				// 문자열 -> byte 배열
				fos.write(data.getBytes());
			}
			fos.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileOutputStreamTest();

	}

}
