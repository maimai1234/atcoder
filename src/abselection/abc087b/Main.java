package abselection.abc087b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        sc.close();

        int count = 0;

        for (int a=A*500; a >= 0; a=a-500){
            for (int b=B*100; b >= 0; b=b-100){
                for (int c=C*50; c >= 0; c=c-50){
                    if ((a + b + c) == X){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
