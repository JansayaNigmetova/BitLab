package theme6;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str= in.next();
        String str2 = in.next();
        int n = str.length();
        int m = str2.length();
        int s=0;
        for (int i=0;i<n;i++){
            if (str.charAt(i)!=str2.charAt(m-1)){
                System.out.println("No");
                s=1;
                i=n;
            }
            m=m-1;
        }
        if (s!=1) {
            System.out.println("Yes"); }
        }
    }

