package abselection.abc0850c;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int tmp;

        for (int x=0; x <= N; x++){
            for (int y=0; y <= N-x; y++){
                tmp = x*10000 + y*5000 + (N-x-y)*1000;
                if (tmp == Y){
                    System.out.println(x + " " + y + " " + (N-x-y));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");

    }
}
