package figures;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4, "Желтый", "Черный");
        Shape rectangle = new Rectangle(5, 7, "Зеленый", "Белый");
        Shape triangle = new Triangle(4, 4, 4, "Красный", "Зеленый");

        circle.printProperties();
        rectangle.printProperties();
        triangle.printProperties();
    }
}