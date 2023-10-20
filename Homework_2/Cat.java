package Homework_2;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;                     // сытость 

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public Cat() {
    }
        public void eat(Plate plate) {
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name=name;
        }

        public int getAppetite() {
            return appetite;
        }  
        public void setAppetite(int appetite) {
            this.appetite = appetite;
        }
        
        public boolean satiety() {
            return satiety;
        } 
    }

    


