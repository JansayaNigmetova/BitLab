package theme11;

public class task1 {
    public static void main(String[] args) {
        Chocolate ch1 = new Chocolate("Snickers", 100);
        Chocolate ch2 = new Chocolate("Twix", 200);
        Burger b1 = new Burger("Burger King", 2, 1);
        Burger b2 = new Burger("McDonalds", 1, 1);
        Coke c1 = new Coke("Coca Cola", 2, true);
        Coke c2 = new Coke("Fuse Tea", 3, false);
        Food f[] = {ch1, ch2, b1, b2, c1, c2};
        for (int i = 0; i < 6; i++) {
            f[i].getPrint();
        }
        double max = 0;
        Food maxcaloriesproduct[]=new Food[1];
        for (int i = 0; i < 6; i++) {
            if (f[i].getCalories() > max) {
                max= f[i].getCalories();
                maxcaloriesproduct[0]=f[i];
            }
        }
        System.out.println("Product with the highest calorie content: ");
        maxcaloriesproduct[0].getPrint();
    }
}

    abstract class Food {
         String name;

        public void getPrint() {
            System.out.println("name: "+name+ " Calories= ");
        }
        public double getCalories(){
            double calories=0;
            return calories;
        }
    }

    class Chocolate extends Food {
        int weight;

        public Chocolate(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public double getCalories() {
            double calories=weight*740;
            return calories;
        }

        @Override
        public void getPrint() {
            super.getPrint();
            System.out.println(weight*740);
        }
    }


    class Burger extends Food {
        int meatAmount;
        int meatType;

        public Burger(String name, int meatAmount, int meatType) {
            this.name = name;
            this.meatAmount = meatAmount;
            this.meatType = meatType;
        }

        @Override
        public double getCalories() {
            double  calories=0;
            if (meatType == 1) {
                 calories=meatAmount * 840;
            }
            else  calories=meatAmount * 560;
            return calories;
        }

        @Override
        public void getPrint() {
            super.getPrint();
            if (meatType == 1) {
                System.out.println(meatAmount * 840);
            }
            else System.out.println(meatAmount * 560);
        }
        }


    class Coke extends Food {
        double volumeLiters;
        boolean isSparkling;

        public Coke(String name, double volumeLiters, boolean isSparkling) {
            this.name = name;
            this.volumeLiters = volumeLiters;
            this.isSparkling = isSparkling;
        }

        @Override
        public double getCalories() {
            double calories = 0;
            if (true) {
                calories = volumeLiters * 400;
            } else calories=volumeLiters * 100;
            return calories;
        }



        @Override
        public void getPrint() {
            super.getPrint();
            if (true) {
                System.out.println(volumeLiters * 400);
            }
            else System.out.println(volumeLiters * 100);
        }
    }

