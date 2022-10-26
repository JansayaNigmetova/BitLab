package book;

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        int a = 5;
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double i = 0.1;
        while (i<=n){
            System.out.println(a*i);
            i=i+0.1;
        }
    }
}
