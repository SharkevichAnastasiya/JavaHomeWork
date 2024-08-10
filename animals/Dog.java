package animals;

public class Dog extends Animal {
    final int MAX_RUN_DISTANCE = 500;
    final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(this.name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(this.name + " не смог проплыть " + distance + " м.");
        }
    }
}
