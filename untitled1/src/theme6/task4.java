package theme6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a = in.next();
        String b = "java";
        if (b.equalsIgnoreCase(a)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
