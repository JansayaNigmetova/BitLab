package theme7;
import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String c = in.next();
        int s = method(a, b, c);
        System.out.println(s);
    }

    public static int method(int a, int b, String c) {
        char[] zn = {'+', '-', '*', '/'};
        int s = 0;
        if (c.charAt(0)=='+') {
                s = a + b;
            }
        if (c.charAt(0)=='-') {
            s = a - b;
        }
        if (c.charAt(0)=='*') {
            s = a * b;
        }
        if (c.charAt(0)=='/') {
            s = a / b;
        }
        return s;
    }
}

