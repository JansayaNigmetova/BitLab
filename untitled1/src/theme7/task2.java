package theme7;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String aa = str(a, b, c);
        System.out.println(aa);
    }

    public static String str(int a, int b, int c) {
        String str ;
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            str = "YES";
        } else {
            str = "NO";
        }
        return str;
    }
}
