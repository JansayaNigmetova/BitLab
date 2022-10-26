package theme6;

import java.util.Scanner;

public class task292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int b = Integer.parseInt(String.valueOf(str.charAt(2)));
        int c = Integer.parseInt(String.valueOf(str.charAt(4)));
        int s= 0;
        if (str.charAt(1)=='+'){
           s=a+b;
        }if (str.charAt(1)=='-'){
            s=a-b;}
        if (str.charAt(1)=='*'){
            s=a*b;}
        if (str.charAt(1)=='/'){
            s=a/b;}
        if (str.charAt(3)=='+'){
            s=s+c;}
        if (str.charAt(3)=='-'){
            s=s-c;}
        if (str.charAt(3)=='+'){
            s=s+c;}
        if (str.charAt(3)=='-'){
            s=s-c;}
        if (str.charAt(3)=='*'){
            s=s*c;}
        if (str.charAt(3)=='/'){
            s=s/c;}
        System.out.println(s);
    }
}
