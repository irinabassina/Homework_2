package Homework_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;                     // сытость 

    public Cat(String name, int appetite) {
        this.name = name;
        this.setAppetite(appetite);
        this.full = false;
    }
        public void eat(Plate plate) {
            if (!this.full && appetite <= plate.getFood()) {
                plate.setFood(plate.getFood() - this.appetite);
                this.full = true;
                System.out.println(this.getName() + " наелся.");
            } else {
                System.out.println("Коту " + this.getName() + " не хватило еды на тарелке.");
            }
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
            if (appetite >= 0) {
                this.appetite = appetite;
            } else {
                this.appetite = 0;
            }
        }

        public void setFull(boolean full) {
            this.full=full;
        }
        
        public boolean isFull() {
            return this.full;
        }
    }

    


