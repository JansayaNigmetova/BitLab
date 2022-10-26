package theme6;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.next();
        String c = in.next();
        String [] d= a.split(" ");
        int n=d.length;
        for (int i=0;i<n;i++){
            if (d[i].equalsIgnoreCase(b)){
                System.out.print(c);
                System.out.print(" ");
            }else{
                System.out.print(d[i]);
                System.out.print(" ");
            }
        }
        }
    }

