package theme3;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        int s = 0;
        int n = 0;
        int a = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        while(a!=0) {
            a = in.nextInt();
            s = s + a;
            n = n + 1;
        }
        System.out.println("Mean="+s/(n-1));
    }
}
