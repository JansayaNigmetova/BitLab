package book;

import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        int a = 5;
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double i = 1.2;
        while (i<=n){
            System.out.println(a*i);
            i=i+0.2;
        }
    }

}
