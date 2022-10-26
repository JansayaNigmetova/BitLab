package theme15;

import java.util.ArrayList;

public class task201 {
    public static void main(String[] args) {
        Players100 p1=new Players100("Kanat", 500.1, 25);
        Players100 p2=new Players100("Samat", 100.4,31);
        ArrayList<Players100> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        System.out.println(players.stream().map(players100 -> players100.getPrice()).
                reduce(0.0,(x,y)-> x+y)/players.size());
        System.out.println(players.stream().map(players100 -> players100.getAge()).
                reduce(0,(x,y)-> x+y));
    }
}
class Players100{
    String name;
    double price;
    int age;
    protected Players100(String name, double price, int age){
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

