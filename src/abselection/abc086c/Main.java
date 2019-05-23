package abselection.abc086c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] t = new int[N+1], x = new int[N+1], y = new int[N+1];

        for (int i=1; i<=N; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();

        t[0]=0; x[0]=0; y[0]=0;

        int time;
        int d;

        for(int j=1; j<=N; j++){
            time = t[j] - t[j-1];
            d = Math.abs(x[j] - x[j-1] + y[j] - y[j-1]);
            if (d > time || d%2 != time%2){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
