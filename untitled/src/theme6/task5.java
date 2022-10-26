package theme6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        if (a.equalsIgnoreCase(b)){
            System.out.println("THEY ARE EQUAL");
        }else {
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}
