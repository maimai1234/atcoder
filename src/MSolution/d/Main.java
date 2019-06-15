package MSolution.d;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] B = new int[];
        for (int i=0; i<N-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b){
                B[i] += 1;


            }

        }

        //        ArrayList<Person> al = new ArrayList<>();
        //        for (int i=0; i<N-1; i++){
        //            al.add(new Person(i, sc.nextInt(), sc.nextInt()));
        //        }
        int[] C = new int[N];
        for (int i=0; i<N; i++){
            C[i] = sc.nextInt();
        }





    }
}
class Person{
    int id;
    int a;
    int b;
    int num;
    public Person(int id, int a, int b){
        this.id = id;
        this.a = a;
        this.b = b;
        this.num = 0;
    }

    public int getId() {
        return id;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
class Num{
    int id;
    int num;

    public Num(int id, int num) {
        this.id = id;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

