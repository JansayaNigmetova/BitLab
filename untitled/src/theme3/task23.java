package theme3;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        int n = 0;
        int a = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        while(a!=0) {
            a = in.nextInt();
            if (a>n) {
                n=a;}
            }
            System.out.println("Maximum number="+n);
    }
}
