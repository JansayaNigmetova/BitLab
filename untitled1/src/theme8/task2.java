package theme8;


public class task2 {
    public static void main(String[] args) {
        Phone h1=new Phone("samsung", "nd",200);
        Phone h2=new Phone ("jfbb","vs",500);
        Phone h3=new Phone ("fvsf","vmms",300);
        Phone h4=new Phone ("rgwh","jyjr",550);
        Phone h5=new Phone (",kug","eeth",600);
        h1.getData();
        h2.getData();
        h3.getData();
        h4.getData();
        h5.getData();
    }
}

class  Phone {
    String name;
    String model;
    int price;

    public Phone (String name, String model, int price){
        this.name=name;
        this.model=model;
        this.price=price;
    }
    public void getData(){
        System.out.println("name :"+name+"model: "+model+"prise: "+price);
    }
}