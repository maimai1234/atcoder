package abselection.abc081a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();

        String[] strArray = S.split("");

        int count = 0;

        for(int i=0;i < strArray.length; i++){
            if(strArray[i].equals("1")){
                count++;
            }
        }

        System .out.println(count);

    }
}
