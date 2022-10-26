package theme6;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] text = str.split(" ");
        int n = text.length;
        for (int i=0; i<n;i++){
            String a =text[i];
            String b =String.valueOf(a.charAt(0)).toUpperCase();
            char[] c=new char[a.length()];
            c[0]=b.charAt(0);
            for (int j=1;j<a.length();j++){
                c[j]=a.charAt(j);
            }
            System.out.print(c);
            System.out.print(" ");
        }

    }
}
