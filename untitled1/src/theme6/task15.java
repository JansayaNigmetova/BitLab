package theme6;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] glas= {'a','e','i','o','u'};
        int n = str.length();
        int s=0;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i) == glas[j]) {
                    s = s + 1;
                }
            }
        }
        System.out.println(s);
    }
}
