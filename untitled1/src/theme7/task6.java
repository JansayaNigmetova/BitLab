package theme7;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inlog = in.next();
        String inpar = in.next();
        String otvet = metod(inlog, inpar);
        System.out.println(otvet);
    }
    public static String metod (String inlog, String inpar){
        String log = "admin";
        String par = "qwerty";
        String otvet=new String();
        if (inlog.equalsIgnoreCase(log) && inpar.equalsIgnoreCase(par)){
            otvet="Authentication completed";
        }else {
            otvet ="Invalid login or password";
        }
        return otvet;
    }
}
