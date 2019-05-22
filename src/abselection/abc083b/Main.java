package abselection.abc083b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int count = 0;
        int a,b,c,d,e;

        for (int i=0; i <= N; i++){

            e = i / 10000;
            a = i / 1000 % 10;
            b = i / 100 % 10;
            c = i / 10 % 10;
            d = i % 10;

            int tmp = a+b+c+d+e;

            if(tmp >= A && tmp <= B){
                count += i;
            }
        }

        System.out.println(count);
    }
}
