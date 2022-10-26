package book;

import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        int a = 5;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println(a*i);
            i=i+1;
        }
    }
}
