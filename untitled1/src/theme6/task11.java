package theme6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String a = in.next().toLowerCase();
        char b = in.next().toLowerCase().charAt(0);
        int n = a.length();
        int s = 0;
        for (int i=0;i<n;i++){
            if (a.charAt(i)==b) {
                s=s+1;
            }
        }
        System.out.print(s);

    }
}
