package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSatisfied;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isSatisfied = false;
    }

    public void eat(Plate p) {
        this.isSatisfied = p.isEnoughFood(appetite);

        if (!this.isSatisfied) return;

        p.decreaseFood(appetite);
    }

    public void isCatSatisfied () {
        if (!this.isSatisfied) {
            System.out.println("Кот " + this.name + " не наелся");
            return;
        }

        System.out.println("Кот " + this.name + " наелся");
    }

}
