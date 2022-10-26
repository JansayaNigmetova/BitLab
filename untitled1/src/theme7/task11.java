package theme7;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String n=method(a);
        System.out.print(n);
    }
    public static String method(int a){
        String n = new String();
        if (a%2==0){
            n="YES";
        }else {
            n="NO";
        }
        return n;
    }
}
