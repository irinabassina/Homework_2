package Homework_2;
// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
// (например, в миске 10 еды, а кот пытается покушать 15-20).
// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//  удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, 
//  то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения 
//  логики программы).
// Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и 
// потом вывести информацию о сытости котов в консоль.
// Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


public class MainClass {
    public static void main(String[] args) {
        // Cat cat = new Cat("Barsik", 5, false);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Рыжик", 20, false);
        cats[1] = new Cat("Серик", 10, false);
        cats[2] = new Cat("Чарлик", 7, false);
         
        

        Plate plate = new Plate(18);
        plate.info();
            for (int i = 0; i < cats.length; i++) {
                if (cats[i].satiety() == false && cats[i].getAppetite() < plate.getFood()){
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println(cats[i].getName() + " наелся.");
            } else {
                System.out.println(cats[i].getName() + " не поел!");
                System.out.println("Сколько еды добавить еще в миску?");
                
                // plate.setFood(plate.getFood() - cats[i].getAppetite());
                
                System.out.println(cats[i].getAppetite() - plate.getFood());
                plate.addFood();
                System.out.println();
         }
      }
    }
}
