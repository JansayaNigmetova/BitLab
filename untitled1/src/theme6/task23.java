package theme6;

import javax.management.StringValueExp;
import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        char[] a = new char[n];
        for (int i=0; i<n;i++){
            if (Character.isDigit(str.charAt(i))){
                a[i]='0';
            }else {
                a[i]=str.charAt(i);
            }
        }
        System.out.print(String.valueOf(a));
    }
}
