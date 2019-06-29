package abc132.d;

import java.util.Scanner;

public class Main {

    static long mod = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //all
        int K = sc.nextInt(); //blue
        sc.close();

        int count;
        if ((K-1) <= (N-K)){
            count = K;
        }else {
            count = N-K+1;
        }
        // int count = Math.min(k, n-k+1)

        long result=0;
        for (int i=1; i<=count; i++){
            result = kumiawase(i, N-K+1);
            System.out.println(result);
        }

    }

    public static int kai(int num){
        int x = 1;
        for (int i=1; i<=num; i++) x *= i;
        return x;
    }

    public static int kumiawase(int a, int b){
        int x = kai(a+b) / kai(a) * kai(b);
        return x;
    }

}
