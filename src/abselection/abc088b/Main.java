package abselection.abc088b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(A, Collections.reverseOrder());

        int alice=0, bob=0;

        for (int j=0; j<N; j++) {
            if (j%2 == 0){
                alice += A[j];
            }else{
                bob += A[j];
            }
        }

        int result = alice - bob;

        System.out.println(result);

    }
}
