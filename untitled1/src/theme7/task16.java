package theme7;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        int maxmin[] = method(a,n);
        System.out.println(maxmin[0]);
        System.out.println(maxmin[1]);
    }
    public static int[] method(int a[],int n){
        int maxmin[]=new int[2];
        int max=a[0];
        int min=a[0];
        for (int i=0;i<n;i++){
            if (a[i]>max){
                max=a[i];
            }else if (a[i]<min){
            min=a[i];
            }
        }
        maxmin[0]=min;
        maxmin[1]=max;
        return maxmin;
    }
}
