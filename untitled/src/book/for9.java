package book;

import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = 0;
        while (a<=b){
            if (a%2==0){
                s=s+a*a;
            }
            a=a+1;
        }
        System.out.println(s);
    }
}
