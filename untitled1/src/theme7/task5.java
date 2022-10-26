package theme7;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.next();
        String m = mmm(a, b);
        System.out.println(m);
    }

    public static String mmm(String a, String b) {
        String m = new String();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i + j) != b.charAt(j)) {
                    j = b.length();
                }
                if (j == b.length() - 1) {
                    m = "YES";
                    i=a.length();
                }
            }
            if (m != "YES") {
                m = "NO";
        }

        }
        return m;
    }
}


