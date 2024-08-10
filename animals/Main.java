package animals;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog(" Бобик");
//        dog.run(600);
//        dog.swim(12);
//
//        Cat cat = new Cat("Мурзик");
//        cat.run(300);
//        cat.swim(5);

        Bowl bowl = new Bowl(-10);
        Cat[] cats = {
                new Cat("Китя"),
                new Cat("Снежка"),
                new Cat("Диня")
        };

        for (Cat cat : cats) {
            cat.eat(bowl, 1);
        }

    }
}
