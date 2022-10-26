package theme7;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        int s = method(a, n);
        System.out.print(s);
    }
    public static int method(int a[], int n){
        int s =0;
        for (int i=0;i<n;i++){
         if (a[i]!=0){
             s=s+1;
         }
        }
        return s;
    }
}
