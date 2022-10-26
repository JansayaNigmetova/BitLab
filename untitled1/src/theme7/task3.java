package theme7;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String a = in.next();
        int sum = summ(str, a);
        System.out.println(sum);
    }
        public static int summ (String str, String  a) {
            int sum=0;
            for (int i=0;i<str.length();i++){
                if (a.charAt(0)==str.charAt(i)){
                    sum = sum+1;
                }
            }
            return sum;
    }
}
