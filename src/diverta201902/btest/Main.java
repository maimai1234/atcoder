package diverta201902.btest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i=0; i<N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();

        int count=1;
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i=1; i<N; i++){
            if (x[i-1] == x[i]){
                count++;
            }
            if (y[i-1] == y[i]){
                count++;
            }
        }


        System.out.println(count);
    }
}
