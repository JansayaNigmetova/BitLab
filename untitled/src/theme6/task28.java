package theme6;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        String[] text = str.split(" ");
        for (int i=0;i<text.length;i++){
            String a = text[i];
            if (a.equalsIgnoreCase("one")){
                text [i]="1";
            }
            if (a.equalsIgnoreCase("two")){
                text[i]="2";
            }
            if (a.equalsIgnoreCase("three")){
                text[i]="3";}
            if (a.equalsIgnoreCase("four")){
                text[i]="4";}
            if (a.equalsIgnoreCase("five")){
                text[i]="5";}
            if (a.equalsIgnoreCase("six")){
                text[i]="6";}
            if (a.equalsIgnoreCase("seven")){
                text[i]="7";}
            if (a.equalsIgnoreCase("eight")){
                text[i]="8";}
            if (a.equalsIgnoreCase("nine")){
                text[i]="9";}
            System.out.print(text[i]);
            System.out.print(" ");
        }
    }
}
