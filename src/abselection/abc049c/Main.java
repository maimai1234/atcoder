package abselection.abc049c;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        ArrayList<String> list = new ArrayList<String>();
        list.add("eraser");
        list.add("erase");
        list.add("dreamer");
        list.add("dream");

        for(int i=0; i<list.size(); i++) {
            text = text.replace(list.get(i), "");
        }

        if(text.equals("")) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}