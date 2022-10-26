package theme6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int index=a.indexOf(b);
        if (index!=-1){
            System.out.println(index);
        }else {
            System.out.println("THERE IS NO SUCH LETTER");
        }
    }
}
