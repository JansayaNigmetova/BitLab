package theme10;

public class task1 {
    public static void main(String[] args) {
        Car a1=new Car("BMW","X5", 2000,2021,3);
        Toyota t1=new Toyota("Toyota", "PAV4", 250, 2020, 2.4, "Europe");
        Mercedes m1=new Mercedes ("Mercedes", "M1",300,2000,4.1, "S");
        a1.ride();
        t1.ride();
        m1.ride();
    }
}
class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public Car() {
        this.name = " ";
        this.model = " ";
        this.maxSpeed = 0;
        this.year = 0;
        this.volume = 0;
    }

    public void ride() {
        System.out.println("Name " + name + " Model " + model + " maxSpeed " + maxSpeed + " year " + year + " volume " + volume);
    }
}

    class Toyota extends Car {
        String manufacturer;

        protected Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
            super(name,model,maxSpeed,year,volume);
            this.manufacturer = manufacturer;
        }

        public void ride() {
            System.out.println("Name " + name + " Model " + model + " maxSpeed " + maxSpeed + " year " + year + " volume " + volume + " manufacturer " + manufacturer);
        }
    }
class Mercedes extends Car {
    String classType;
    protected Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType){
        super(name,model,maxSpeed,year,volume);
        this.classType = classType;
    }
    public void ride() {
        System.out.println("Name " + name + " Model " + model + " maxSpeed " + maxSpeed + " year " + year + " volume " + volume + " classType " + classType);
    }
}