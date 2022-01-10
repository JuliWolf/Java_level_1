package lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Рыжик", 20);
        cats[2] = new Cat("Васька", 13);
        cats[3] = new Cat("Кыся", 21);
        cats[4] = new Cat("Машка", 7);
        Plate plate = new Plate(50);

        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.isCatSatisfied();
            System.out.println();
        }

        plate.info();
        plate.addFood(100);
    }
}
