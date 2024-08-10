package figures;

interface Shape {
    double area();
    double perimeter();

    String getFillColor();
    String getBorderColor();

    default void printProperties() {
        System.out.printf("Периметр: %.2f, Площадь: %.2f, Цвет заливки: %s, Цвет границы: %s%n",
                perimeter(), area(), getFillColor(), getBorderColor());
    }
}
