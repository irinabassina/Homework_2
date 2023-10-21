package Homework_2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.setFood(food);
    }

    public void info() {
        System.out.println("Тарелка с количеством еды = " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    public void addFood(int additionalFood) {
        if (additionalFood > 0) {
            this.food += additionalFood;
        }
    }
}
