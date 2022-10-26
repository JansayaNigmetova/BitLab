package theme2;

import java.util.Scanner;

public class task218 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0) {
            System.out.println(a+1);
        }
        if (a<0) {
            System.out.println(a-2);
        }
        if (a==0) {
            System.out.println(10);
        }
    }
}
