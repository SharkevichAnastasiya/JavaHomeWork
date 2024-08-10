package animals;

public class Cat extends Animal{
    final int MAX_RUN_DISTANCE = 200;
    boolean satisfied = false;

    public Cat(String name) {
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
        throw new UnsupportedOperationException();
    }

    public void eat(Bowl bowl, int eatCount) {
        if (bowl.food >= eatCount) {
            bowl.removeFood(eatCount);
            this.satisfied = true;

            System.out.println(this.name + " покушал " + eatCount +" еды. Сытость: " + this.satisfied);
        } else {
            this.satisfied = false;
            System.out.println(this.name + " не хватило еды. Сытость: " + this.satisfied);
        }
    }
}
