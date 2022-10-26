package theme11;

public class task2 {
    public static void main(String[] args) {
        SphereGold SG1=new SphereGold(10);
        SphereGold SG2=new SphereGold(9.3);
        SphereGold SG3=new SphereGold(8.5);
        CubeGold CG1=new CubeGold(9);
        CubeGold CG2=new CubeGold(8.4);
        CubeGold CG3=new CubeGold(7.8);
        GoldShape GSH[]={SG1,SG2,SG3,CG1,CG2,CG3};
        for (int i=0; i<6;i++){
            System.out.println(GSH[i].getPrice());
        }
    }
}

abstract class GoldShape{
    public abstract double getVolume();
    public double getPrice(){
        double prise=(getVolume() * 250 + 1200);
        return prise;
    }
}
class SphereGold extends GoldShape{
    double radius;
    public SphereGold(double radius){
        this.radius=radius;
    }

    @Override
    public double getVolume() {
        double volume=4/3*3.14*radius;
        return volume;
    }
}
class CubeGold extends GoldShape{
    double side;
    public CubeGold(double side){
        this.side=side;
    }

    @Override
    public double getVolume() {
        double volume=side*side*side;
        return volume;
    }
}