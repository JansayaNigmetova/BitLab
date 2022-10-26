package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter "+n+" number");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        System.out.println("Enter number");
        long k= in.nextLong();
        long m=0;
        m= numbers.stream().filter(a->a==k).count();
        numbers.stream().filter(a->a==k).forEach(a->System.out.println(numbers.indexOf(a)));
        if (m!=0) {System.out.println("Yes");}
        else System.out.println("No");
    }
}
