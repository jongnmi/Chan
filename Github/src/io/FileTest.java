package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		// File : 하드디스크, USB 등 메모리의 드라이브, 폴더, 파일을 처리할 수 있는 객체
		
		// File 객체 생성하기
		File f2 = new File("D://java_test/CalendarTest.java");
		File f1 = new File("D://java_test");
		File f3 = new File(f1, "CalendarTest.java");
		File f4 = new File("D://java_test", "CalendarTest.java");
		
		// mkdir() : 하위에 디렉토리가 없을때 폴더 생성
		// mkdirs() : 하위 디렉토리까지 폴더 생성
		// isDirectory() : 디렉토리(폴더)인지 파일인지 알려줌
		// exists() : 디렉토리 또는 파일이 존재하는지/ 있으면 true, 없으면 false
		
		File f5 = new File("D://sample"); 
		File f6 = new File("D://goguma/folder");
		
		f5.mkdir();
		f6.mkdirs();
		
		// 파일
		File f7 = new File(f5, "dddd.txt");
		try {
			boolean result = f7.createNewFile();
			if(result) {
				System.out.println("파일생성됨");
			}else {
				System.out.println("파일생성안됨");
			}
			
			// 마지막 수정일
			// 마지막 수정일을 밀리초로 구해준다.
			// 1970-01-01 00:00:00:0 이 기준
			//					   1000
			// 					   2000
			// 2023				   1672800226426
			long lastSave = f2.lastModified();
			System.out.println(lastSave);
			
			// 밀리초로 Calendar 객체 만들기
			Calendar dateTime = Calendar.getInstance(); // 오늘 현재
			dateTime.setTimeInMillis(lastSave);
			
			// 2023-01-04 오전 11:43
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			String dateStr = fmt.format(dateTime.getTime());
			System.out.println("마지막 수정일 -> " + dateStr);
			
			// 특정위치(드라이브, 폴더)
			File f8 = new File("D://");
			File[] fileList = f8.listFiles();
			// for(배열의 데이터형: 배열)
			for(File f9: fileList) {
				// getPath() : 드라이브, 경로, 파일명까지 구해짐
				// getName() : 파일명(확장자 포함)만 구함
				// getAbsolutePath() : 드라이브, 경로, 파일명
				// getParent() : 드라이브, 경로
				
				if(f9.isDirectory()) { //폴더
					if(f9.isHidden()) {
						System.out.println(f9.getPath() + "[숨김폴더]");
					}else {
						System.out.println(f9.getPath() + "[폴더]");
					}
					
				}else { // 폴더 아닐때 파일일때
					if(f9.isHidden()) {
						System.out.println(f9.getPath() + "[숨김파일]");
					}else {
						System.out.println(f9.getPath() + "[파일]");
					}
				}
			}
			// 현재 컴퓨터의 드라이브 목록
			File[] drive = File.listRoots();
			for(File f9:drive) {
				System.out.println(f9.getPath());
			}
			
			// 파일 크기 (byte)
			System.out.println("파일크기는 = " + f2.length());
			
			// 파일 삭제
			f7.delete();
			
			// 폴더 삭제 : 폴더 내에 파일이 없어야 한다
			f5.delete();
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileTest();

	}

}
