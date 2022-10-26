package theme4;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]=new int[n];
        for (int i=0;i<n;i++){
            nm[i]=in.nextInt();
        }
        int max=nm[0];
        int min=nm[0];
        for (int i=0;i<n;i++){
            if (nm[i]>max){
                max=nm[i];
            }
            if (nm[i]<min){
                min=nm[i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            if (nm[i] != min && nm[i] != max) {
                sum = sum + nm[i];
            }
        }
        System.out.println(sum+" "+(double) sum/(n-2));
    }
}
