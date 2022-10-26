package book;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        a=a+1;
        while (a<b){
            if (a%2==0){
                System.out.print(a+" ");
                n=n+1;
            }
            a=a+1;
        }
        System.out.println(n);
    }
}
