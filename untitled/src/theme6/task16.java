package theme6;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        int s=0;
            for (int i=0;i<n;i++){
                if (Character.isDigit(str.charAt(i))){
                    s=s+Integer.parseInt(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println(s);
        }
        }


