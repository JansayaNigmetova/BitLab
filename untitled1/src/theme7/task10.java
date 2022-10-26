package theme7;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum=method(a, n);
        System.out.println(sum);
    }
    public static int method(int a[], int n){
        int sum=0;
        for (int i=0; i<n; i++){
            if (a[i]%5!=0){
                sum=sum+a[i];
            }
        }
        return sum;
    }
}
