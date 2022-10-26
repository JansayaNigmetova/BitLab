package theme6;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        int s=0;
        for (int i=0;i<n;i++){
            if (str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("No");
                i=n;
                s=1;
            }
        }
        if (s!=1){
            System.out.println("Yes");
        }
    }
}
