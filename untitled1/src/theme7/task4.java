package theme7;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String aa=metod (str);
        System.out.println(aa);
    }
    public static String metod (String str) {
        int m=0;
        String a=new String();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                m=1;
            }
            if (m==0){a="YES";}
            else {a="NO";}
        }
        return a;
    }
}

