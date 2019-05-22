package abselection.abc086a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int in = a * b;

        if (in % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
