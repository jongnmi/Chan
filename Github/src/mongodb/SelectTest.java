package mongodb;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class SelectTest {
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
		
	
	public SelectTest() {
		
	}
	// 전체 선택
	public void selectAll() {
		mongoClient = new MongoClient(URI, PORT);
		mydbDatabase = mongoClient.getDatabase("mydb");
		collection = mydbDatabase.getCollection(COLLECTION);
		
		// mydb에 있는 모든 도큐먼트 선택하기
		Iterator<Document> mydbCursor = collection.find().iterator();
		
		while(mydbCursor.hasNext()) {
			//System.out.println(mydbCursor.next().toJson());
			Document doc = mydbCursor.next();
			int empno = doc.getInteger("empno");
			String ename = doc.getString("ename");
			int sal = doc.getInteger("sal");
			System.out.println(empno+"\t"+ename+"\t"+sal);
		}
		
		mongoClient.close();
	}
	// 조건 선택
	public void selectSearch() {
		try {
			mongoClient = new MongoClient(URI, PORT);
			mydbDatabase = mongoClient.getDatabase(DATABASE);
			collection = mydbDatabase.getCollection(COLLECTION);
			
			// 사원명이 이강인이면 선택
			// Iterator<Document> mydbCursor = collection.find(Filters.eq("ename", "이강인")).iterator();
			// 부서명이 토트넘이거나 나폴리면 선택
			// Iterator<Document> mydbCursor = collection.find(Filters.in("dname", "토트넘", "나폴리")).iterator();
			// 급여가 10000 이상이면 선택
			Iterator<Document> mydbCursor = collection.find(Filters.gte("sal", 10000)).iterator();	
			while(mydbCursor.hasNext()) {
				Document doc = mydbCursor.next();
				int empno = doc.getInteger("empno");
				String ename = doc.getString("ename");
				String job = doc.getString("job");
				int sal = doc.getInteger("sal");
				Date date = doc.getDate("hiredate");
				
				System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+date.toString());
			}
			mongoClient.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SelectTest test = new SelectTest();
		//test.selectAll();
		test.selectSearch();
	}

}
