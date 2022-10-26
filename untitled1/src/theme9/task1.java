package theme9;

public class task1 {
    public static void main(String[] args) {
        Phone h1 = new Phone("samsung", "nd", 200, 200);
        Phone h2 = new Phone("nokia", "hrr", 500, 100);
        Phone h3 = new Phone("iphone", "jy", 2500, 200);
        Phone h4 = new Phone("samsung", "jyjr", 1500, 200);
        Phone h5 = new Phone("nokia", "liyl", 700, 100);
        Phone h6 = new Phone("iphone", "str", 800, 200);
        Phone h7 = new Phone("samsung", "l;", 1550, 200);
        Phone h8 = new Phone("nokia", "ukuyk", 950, 100);
        Phone h9 = new Phone("iphone", "jhg", 670, 200);
        Phone h10 = new Phone("samsung", "dh", 100, 200);

        Phone[] Phones = {h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};
        for (int i = 0; i < Phones.length; i++) {
            if (Phones[i].getCategory() == "TOP" || Phones[i].getCategory() == "SIMPLE") {
                System.out.println(Phones[i].getName() + " " + Phones[i].getCategory());
            }
        }
    }
}

    class Phone {
        private String name;
        private String model;
        private int price;
        private int memory;

        public Phone(String name, String model, int price, int memory) {
            this.name = name;
            this.model = model;
            this.price = price;
            this.memory = memory;
        }

        public void getData() {
            System.out.println("name :" + name + "model: " + model + "prise: " + price);
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            if (price > 1000) {
                return "TOP";
            } else if (price < 1000 && price > 500) {
                return "MEDIUM";
            } else {
                return "SIMPLE";
            }
        }
    }



