package theme7;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int n = method(a);
        System.out.print(n);
    }
    public static int method(String a){
        String[] b ={"a", "e", "i", "o","u"};
        int s=0;
        for (int i=0;i<a.length();i++){
            for(int j=0;j<5;j++){
                if (b[j].equalsIgnoreCase(String.valueOf(a.charAt(i)))){
                    s=s+1;
                }
            }
        }
        return s;
    }
}
