package theme11;

public class task3 {
    public static void main(String[] args) {
        FerrariEngine f1 = new FerrariEngine(3.5,100,5.3);
        FerrariEngine f2 = new FerrariEngine(4.2,300,4.8);
        FerrariEngine f3 = new FerrariEngine(3.8,250,2.3);
        FerrariEngine f4 = new FerrariEngine(5.5,150,2.7);
        FerrariEngine f5 = new FerrariEngine(1.5,600,3.7);
        RenaultEnigine r1 = new RenaultEnigine(5.1,200,5.1,2.1);
        RenaultEnigine r2 = new RenaultEnigine(4.2,500,4.1,3.2);
        RenaultEnigine r3 = new RenaultEnigine(3.7,250,7.1,2.5);
        RenaultEnigine r4 = new RenaultEnigine(4.2,500,4.1,3.2);
        RenaultEnigine r5 = new RenaultEnigine(5.3,650,3.7,4.5);
        Engine e[]={f1,f2,f3,f4,f5,r1,r2,r3,r4,r5};

        for (int i=0;i<10;i++){
            System.out.println(e[i].getMaxSpeed());
            ;
        }
    }
}
 abstract class Engine{
     double engineVolume;
     int cylinderAmount;
     double engineWeight;
    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();
    public Engine(double engineVolume, int cylinderAmount, double engineWeight){
        this.engineVolume=engineVolume;
        this.cylinderAmount=cylinderAmount;
        this.engineWeight=engineWeight;
    }
    public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
 }
 class FerrariEngine extends Engine{
     double engineVolume;
     int cylinderAmount;
     double engineWeight;

     protected FerrariEngine (double engineVolume, int cylinderAmount, double engineWeight){
         super(engineVolume, cylinderAmount, engineWeight);
     }

     public double getEngineVolume() {
         return engineVolume;
     }

     public int getCylinderAmount() {
         return cylinderAmount;
     }

     public double getEngineWeight() {
         return engineWeight;
     }

     public void setEngineVolume(double engineVolume) {
         this.engineVolume = engineVolume;
     }

     public void setEngineWeight(double engineWeight) {
         this.engineWeight = engineWeight;
     }

     public void setCylinderAmount(int cylinderAmount) {
         this.cylinderAmount = cylinderAmount;
     }
     public double efficiency(){
         return 0.25;
     }
     public double throttleEnergy(){
         return engineVolume*cylinderAmount*100;
     }
     public double breakEnergy(){
         return engineWeight*2;
     }
 }
 class RenaultEnigine extends Engine{
     double extraTurboEnergy;
     public RenaultEnigine (double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy){
         super(engineVolume,cylinderAmount,engineWeight);
         this.extraTurboEnergy=extraTurboEnergy;
     }
     public double efficiency() {
         return 0.27;
     }
     public double throttleEnergy(){
         return engineVolume*cylinderAmount*110 + extraTurboEnergy;
     }
     public double breakEnergy(){
         return engineWeight*2.1;
     }
 }
