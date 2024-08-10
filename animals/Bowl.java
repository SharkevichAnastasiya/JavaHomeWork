package animals;

public class Bowl {
    int food = 0;

    public Bowl(int food) {
       if (food > 0) {
           this.food = food;
       }
    }

    public void addFood(int count) {
        if (count > 0) {
            this.food = count;
        }
    }

    public void removeFood(int count) {
        int foodCount = this.food - count;
        if (foodCount >= 0) {
            this.food = foodCount;
        }
    }
}
