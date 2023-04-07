package mongodb;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertManyTest {
	// 몽고DB서버
	private final String URI = "localhost";
	// 포트번호
	private final int PORT = 27017;
	// 데이터베이스
	private final String DATABASE = "mydb";
	// 컬렉션
	private final String COLLECTION = "employee";
		
	// DB연결
	MongoClient mongoClient;
	MongoDatabase mydbDatabase;
	MongoCollection<Document> collection;
		
	//------------------
	Scanner scan = new Scanner(System.in);
	
	public InsertManyTest() {
		start();
	}
	public void start() {
		try {
			
			mongoClient = new MongoClient(URI, PORT);
			System.out.println("접속성공");
			
			mydbDatabase = mongoClient.getDatabase(DATABASE);
			
			collection = mydbDatabase.getCollection(COLLECTION);
			
			
			
			// document를 담을 컬렉션
			List<Document> empList = new ArrayList<Document>();
			
			// 사원수 입력
			System.out.print("사원수 : ");
			int count = Integer.parseInt(scan.nextLine());
			
			for(int i=1; i<=count; i++) {
				Document doc = new Document();
				System.out.print("사원번호 -> ");
				doc.append("empno", Integer.parseInt(scan.nextLine()));
				System.out.print("사원명 -> ");
				doc.append("ename", scan.nextLine());
				System.out.print("담당업무 -> ");
				doc.append("job", scan.nextLine());
				System.out.print("급여 -> ");
				doc.append("sal", Integer.parseInt(scan.nextLine()));
				System.out.print("부서명 -> ");
				doc.append("dname", scan.nextLine());
				doc.append("hiredate", new Date());
				
				empList.add(doc);
			}
			
			collection.insertMany(empList);
			
			mongoClient.close();
			System.out.println(count+"개의 도큐먼트가 추가 되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InsertManyTest();

	}

}
