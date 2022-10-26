package theme7;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String str = method(a);
        System.out.println(str);
    }

    public static String method(int a) {
        String w = "Winter";
        String sp = "Spring";
        String su = "Summer";
        String au = "Autumn";
        String str = new String();
        if (a == 1 || a == 2 || a == 12) {
            str = w;
        }
        if (a == 3 || a == 4 || a == 5) {
            str = sp;
        }
        if (a == 6 || a == 7 || a == 8) {
            str = su;
        }
        if (a == 9 || a == 10 || a == 11) {
            str = au;
        }
        return str;
    }
}
