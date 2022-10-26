package theme4;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]= new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int m = in.nextInt();
        int a = 0;
        int sum = 0;
        for (int i =0; i<n; i++){
            if (nm[i]>m){
            sum=sum+nm[i];
            a=a+1;
            }
        }
        System.out.println((double) sum/a);
    }
}
