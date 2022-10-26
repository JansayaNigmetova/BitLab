package theme15;

import java.util.ArrayList;
import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter "+n+" number");
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<n;i++){
            numbers.add(in.nextInt());
        }
        numbers.stream().filter(a-> a==numbers.stream().max((x,y)->x.compareTo(y)).get()).forEach(a->System.out.println(numbers.indexOf(a)));
    }
}
