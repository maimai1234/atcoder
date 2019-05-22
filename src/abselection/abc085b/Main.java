package abselection.abc085b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int B[];
        B = Arrays.stream(A).distinct().toArray();

        System.out.println(B.length);
    }
}
