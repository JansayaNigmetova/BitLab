package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter "+n+" number");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        System.out.println(numbers.stream().filter(a->a!=0 && numbers.indexOf(a)%2==0).reduce(1,(x,y)->x*y));
    }
}
