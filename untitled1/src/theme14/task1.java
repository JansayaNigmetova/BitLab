package theme14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
    Players p1=new Players("Kanat", 500.1, 25);
    Players p2=new Players("Samat", 100.4,31);
        ArrayList<Players> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        double sum=0;
        double pricesr=0;
        for (int i=0;i< players.size();i++){
            sum=sum+players.get(i).age;
            pricesr=pricesr+players.get(i).price;
        }
        pricesr=pricesr/ players.size();
        System.out.println(sum);
        System.out.println(pricesr);
    }
}
class Players{
    String name;
    double price;
    int age;
    protected Players(String name, double price, int age){
        this.name=name;
        this.price=price;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

}