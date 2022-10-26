package theme7;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a= in.next();
        String aa=method(a);
        System.out.print(aa);
    }
    public static String method(String a){
        char aa[] = new char[a.length()*2];
        for (int i=0; i<a.length();i++){
            aa [i*2]=a.charAt(i);
            aa [i*2+1]=a.charAt(i);
        }
        return String.valueOf(aa);
    }
}
