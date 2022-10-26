package theme6;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next();
        int c = in.nextInt();
        String d = in.next();
        int e = in.nextInt();
        int s = 0;
        if (b.charAt(0) == '+') {
            s = a + c;
        }
        if (b.charAt(0) == '-') {
            s = a - c;
        }
        if (b.charAt(0) == '*') {
            s = a * c;
        }
        if (b.charAt(0) == '/') {
            s = a / c;
        }
        if (d.charAt(0) == '+') {
            s = s + e;
        }
        if (d.charAt(0) == '-') {
            s = s - e;
        }
        if (d.charAt(0) == '*') {
            s = s * e;
        }
        if (d.charAt(0) == '/') {
            s = s / e;
        }
        System.out.println(s);
    }
}
