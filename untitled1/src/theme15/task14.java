package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter "+n+" number");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        long sum = numbers.stream().reduce(0,(a,y)->a+y)/numbers.size();
        numbers.stream().filter(a->a>sum).forEach(a->System.out.print(a+" "));
    }
}
