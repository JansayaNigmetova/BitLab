package theme4;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nm[]=new int[n];
        for (int i=0;i<n;i++){
            nm[i]= in.nextInt();
        }
        int min = nm[0];
        for (int i =1; i<n; i++){
            if(nm[i]<min){
                min=nm[i];
            }
        }
        System.out.println(min*min);
    }
}
