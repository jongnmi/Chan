
public class Gugudan {

	public static void main(String[] args) {
		System.out.println("\t" + "구구단");
		for (int i=1; i<=9; i+=3) {
			System.out.print("==" + i + "단==" + "\t");
			System.out.print("==" + (i+1) + "단==" + "\t");
			System.out.print("==" + (i+2) + "단==" + "\t" + "\n");
			for (int j=2; j<=9; j++) {
				for(int k=i; k<3+i; k++) {
					System.out.print(k + "*" + j + "=" + (k*j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

