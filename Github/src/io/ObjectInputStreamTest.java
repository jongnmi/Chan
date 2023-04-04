package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		// ObjectInputStream : 파일에 객체로 저장되어 있는 정보를 얻어오기
		try {
			File f = new File("D://java_test","object.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			VectorTest vt = (VectorTest)ois.readObject();
			System.out.println("vt.msg -> " + vt.msg);
			
			Vector v = vt.getData();
			MemberDTO dto = (MemberDTO)v.get(3);
			System.out.println(dto.toString());
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		new ObjectInputStreamTest();

	}

}
