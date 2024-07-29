public class Park {
    private Attraction[] attractions;
    private int count;

    public Park(int capacity) {
        attractions = new Attraction[capacity];
        count = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, price);
        } else {
            System.out.println("Нет свободного места для нового аттракциона.");
        }
    }

    public void showAttractions() {
        System.out.println("Аттракционы в парке:");
        for (int i = 0; i < count; i++) {
            System.out.println(attractions[i]);
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + price + " руб.";
        }
    }

    public static void main(String[] args) {
        Park park = new Park(7);
        park.addAttraction("Колесо обозрения", "10:00 - 22:00", 5);
        park.addAttraction("Колобок", "10:00 - 22:00", 5);
        park.addAttraction("Паравозик", "10:00 - 22:00", 5);

        park.showAttractions();
    }
}