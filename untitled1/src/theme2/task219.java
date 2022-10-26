package theme2;

import java.util.Scanner;

public class task219 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a!=b) {
            a=a+b;
            b=a;
            System.out.println(a + " " + b);
            }
        else if (a==b) {
            a=0;
            b=0;
            System.out.println(a + " " + b);
           }
    }
}
