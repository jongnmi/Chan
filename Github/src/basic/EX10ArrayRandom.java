package basic;
import java.util.Random;

public class EX10ArrayRandom {

	public static void main(String[] args) {
		// 1~1000사이의 값을 100개 만들어 배열에 저장하고
		// 총합, 제일큰값, 제일작은값, 평균을 구하라.
		// max(), min() : 사용안함.
		
		Random ran = new Random();
		//데이터 준비
		int data[] = new int[100];
		
		for(int i=0; i<data.length; i++) {
			data[i] = ran.nextInt(1000)+1; // 0~999
		}
		
		// 계산
		int tot=0;
		int max = data[0];
		int min = data[0];
		
		for(int i=0; i<data.length; i++) {
			tot += data[i]; // 합
			if(max < data[i]) max = data[i];
			if(min > data[i]) min = data[i];
		}
		// 평균
		int avg = tot / data.length;
		
		System.out.println("전체합=" + tot);
		System.out.println("평균=" + avg);
		System.out.println("최고값=" + max);
		System.out.println("최저값=" + min);
		}

	}
/*
 전체합=
 평균=
 최고값=
 최저값=
 */
 