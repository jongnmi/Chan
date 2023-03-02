

import java.util.Scanner;

import static java.lang.System.*;

public class Main1244 {
    static Scanner sc = new Scanner(in);
    static int N = sc.nextInt();
    static boolean[] light = new boolean[N+1];
    public static void main(String[] args) {
        for (int i = 1; i < N+1; i++) {
            int tmp = sc.nextInt();
            if(tmp==1) light[i] = true;
        }
        int num = sc.nextInt();
        int[] gen = new int[num];
        int[] loc = new int[num];
        for (int i = 0; i < num; i++) {
            gen[i] = sc.nextInt();
            loc[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if(gen[i]==1) boy(loc[i]);
            if(gen[i]==2) girl(loc[i]);
        }
        for (int i = 1; i < N+1; i++) {
            if(light[i]) out.print(1+" ");
            else out.print(0+" ");
            if(i%20==0) out.println();
        }
    }
    public static void boy(int i){
        for (int j = i; j < N + 1; j++) {
            if(j%i==0)  light[j] = !light[j];
        }
    }

    public static void girl(int i){
        light[i] = !light[i];
        for (int j = 1; j < N; j++) {
            if(i-j<=0||i+j>N) break;
            if(light[i-j]==light[i+j]) {
                light[i-j]=!light[i-j];
                light[i+j]=!light[i+j];
            }
            else break;
        }
    }
}
