package theme4;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]= new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int a =0;
        for (int i=0; i<n;i++){
            if (nm[i]%2==0){
                a=a+1;
            }
        }
        int newnm[]=new int[a];
        int b=0;
        for (int i=0;i<n;i++){
            if (nm[i]%2==0){
                newnm [b]=nm[i];
                b=b+1;
            }
        }
        for (int i=0;i<a;i++){
            System.out.print(newnm[i]+" ");
        }
    }
}
