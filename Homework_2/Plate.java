package Homework_2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }


    public int getFood() {
    return food;
    }
    public void setFood(int i) {
        return;
    }
    public void addFood() {
        System.out.println("Добавьте еще еды!" );
    }
}
