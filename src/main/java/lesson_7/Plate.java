package lesson_7;

public class Plate {
    private final int MAX_FOOD_COUNT = 100;

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean isEnoughFood (int n) {
        if (n > food) {
            System.out.println("В тарелке недостаточно еды");
            return false;
        }

        System.out.println("В тарелке достаточно еды");
        return true;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood (int n) {
        if (n < 0) {
            System.out.println("Количество добавленной еды не может быть отрицательным числом.");
            return;
        }

        food = food + n;

        if (food > MAX_FOOD_COUNT) {
            food = MAX_FOOD_COUNT;
        }

        System.out.println("В тарелке: " + food + " еды");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
