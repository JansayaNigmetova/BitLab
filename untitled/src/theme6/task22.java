package theme6;

import javax.management.StringValueExp;
import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        char[] a = new char[n];
        for (int i=0;i<n;i++){
            if (Character.isLowerCase(str.charAt(i))){
                String s = String.valueOf(str.charAt(i)).toUpperCase();
                a[i] = s.charAt(0);
            }else {
                String s = String.valueOf(str.charAt(i)).toLowerCase();
                a[i]=s.charAt(0);
            }
        }
        System.out.print(String.valueOf(a));
    }
}
