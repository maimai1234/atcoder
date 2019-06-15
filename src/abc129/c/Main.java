package abc129.c;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] step = new String[N+2];
        int[] a = new int[M];
        for (int i=0; i<M; i++){
            a[i] = sc.nextInt();
        }

        sc.close();

        for (int i=0; i<N; i++){
            step[i] = ".";
        }
        step[N] = "#";
        step[N+1] = "#";
        step[N+2] = "#";

        for (int i=0; i<M; i++){
            step[a[i]-1] = "#";
        }

        BigInteger result = new BigInteger("1");
        for (int i=0; i<N-1; i++){

            if (step[i].equals(".")){
                if (step[i+1].equals("#") && step[i+2].equals("#")){
                    System.out.println("0");
                    return;
                }
                int tmp=0;
                if (step[i+1].equals(".")){
                    tmp += 1;
                }
                if (step[i+2].equals(".")){
                    tmp += 1;
                }

                result = result.multiply(new BigInteger(String.valueOf(tmp)));

//                System.out.println("i:"+i);
//                System.out.println("step i+1"+ step[i+1]);
//                System.out.println("step i+2"+ step[i+2]);
//                System.out.println("result"+ result);
            }
        }
        System.out.println(result.remainder(new BigInteger("1000000007")));

    }
}
