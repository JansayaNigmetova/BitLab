package theme6;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int n = a.length();
        for (int i=n-1;i>=0;i=i-1){
            System.out.print(a.charAt(i));
        }
    }
}
