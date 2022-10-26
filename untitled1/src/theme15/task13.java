package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter "+n+" number");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        long sum = numbers.stream().filter(a->a<0).reduce(0,(a,y)->a+y);
        long count=numbers.stream().filter(a->a<0).count();
        System.out.println(sum/count);
    }
}
