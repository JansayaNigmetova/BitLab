package book;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();
        String b = "*";
        char[] star = new char[n];
        for (int i=0; i<n;i++){
            star [i]=b.charAt(0);
        }
        String bb= String.valueOf("\\") + String.valueOf(star);
String[] strr=str.split(bb);
for (int i =1;i<strr.length-1; i++){
    String a=strr[i];
    System.out.print(a);
    System.out.print(" ");
}
    }
}


