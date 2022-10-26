package theme4;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[] = new int[n];
        for (int i = 0; i < n; i++) {
            nm[i] = in.nextInt();
        }
        int indx1=0;
        int i=0;
        while (nm[i]!=0){
            i=i+1;
        }
        indx1=i+1;
        int indx2=0;
        for (int a=0; a<n; a++){
            if (nm[a]==0){
                indx2=a;
            }
        }
        int s= 0;
        for (int b=indx1; indx1<indx2;indx1++){
           s=s+ nm[indx1];
        }
        System.out.println(s);
    }
}