package abselection.abc081b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int count = 0;

        for (int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        int flag = 0;

        while (flag == 0){
            for(int j=0; j < N; j++){
                if(A[j]%2 == 0){
                    A[j] = A[j] / 2;
                }else{
                    flag = 1;
                }
            }
            if (flag == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
