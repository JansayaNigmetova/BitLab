package theme7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int sr=sred(n);
        System.out.println(sr);
    }
    public static int sred(int n){
        Scanner in =new Scanner(System.in);
        int sum = 0;
        for (int i=0;i<n;i++){
            int a= in.nextInt();
            sum=sum+a;
        }
        return sum/n;
        }
}
