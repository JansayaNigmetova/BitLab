package book;

import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        double s = 0;
        while (i<=n){
            s=s + (double) 1/i;
            i=i+1;
        }
        System.out.println(s);
    }
}
