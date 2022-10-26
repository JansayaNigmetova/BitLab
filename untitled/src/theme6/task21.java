package theme6;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int s= 0;
        int i = Integer.parseInt(String.valueOf(str.charAt(0)));
        int j = Integer.parseInt(String.valueOf(str.charAt(2)));
        if (str.charAt(1)=='+'){
            s=i+j;
        }
        if (str.charAt(1)=='-'){
            s=i-j;
        }
        if (str.charAt(1)=='*'){
            s=i*j;
        }
        if (str.charAt(1)=='/'){
            s=i/j;
        }
        System.out.print(s);
    }
}
