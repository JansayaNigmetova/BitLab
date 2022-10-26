package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string= in.next();
        ArrayList list = new ArrayList<>();
        list.add(string);
       if (list.stream().anyMatch("BITLAB"::equals)){
           System.out.println("YES");}
       else System.out.println("No");
    }
}
