package theme2;

import java.util.Scanner;

public class task213 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a<b && a<c && b>c) {
            System.out.println(b-a);
        }
        else if (a<b && a<b && c>b) {
            System.out.println(c-a);

        } else if (b<a && b<c && a>c) {
           System.out.println(a-b);
        }
        else if (b<a && b<c && a<c) {
            System.out.println(c-b);

        } else if (c<a && c<b && a>b) {
            System.out.println(a-c);
           } else if (c<a && c<b && b>a) {
            System.out.println(b-c);

        }
    }
}
