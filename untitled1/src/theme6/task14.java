package theme6;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next().toLowerCase();
        String b = in.next().toLowerCase();
        int na = a.length();
        int nb = b.length();
        int s=0;
        for (int i=0; i<=na-nb;i++){
            int j=0;
            while (j<nb){
            if(a.charAt(i)==b.charAt(j)){
                j=j+1;
                i=i+1;
                if (j==nb){
                    System.out.println("Yes");
                 s=1;}
            }
            else {j=nb;}
            }
        }
        if (s==0){
    System.out.println("No");
        }

    }
}
