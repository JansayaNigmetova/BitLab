package theme6;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char a = str.charAt(0);
        System.out.print(str.charAt(1));
        System.out.println(Integer.parseInt(String.valueOf(a))*2);
    }
}
