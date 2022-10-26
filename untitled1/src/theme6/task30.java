package theme6;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] text = str.split(" ");
        for (int i=0;i<text.length;i++){
            String a= text[i];
            int n= a.length();
            for (int j=0;j<n;j++){
              char[] b = new char[n];
              b[j]=a.charAt(n-1-j);
              System.out.print(b[j]);
            }
            System.out.print(" ");
        }
    }
}
