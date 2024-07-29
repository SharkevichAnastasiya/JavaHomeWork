    /*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    Конструктор класса должен заполнять эти поля при создании объекта.
    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    /*2. Создать массив из 5 сотрудников.
    Пример:
    // вначале объявляем массив объектов
    Person[] persArray = new Person[5];
    // потом для каждой ячейки массива задаем объект
    persArray[0] = new Person("Ivanov Ivan", "Engineer",
                   "ivivan@mailbox.com", "892312312", 30000, 30);
    persArray[1] = new Person(...);
    ...persArray[4] = new Person(...); */

    public class Employee{
        String name;
        String position;
        String email;
        String phone;
        double Salary;
        int age;

    public Employee( String name, String position, String email, String phone, double Salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.Salary = Salary;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + Salary);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Ильенок Александр Сергеевич", "Тестировщик", "ilenok@gmail.com", "+375332345436", 1200, 18),
                new Employee("Козлов Игорь Петрович", "Разработчик", "kozlov@gmail.com", "+375291234567", 1700, 28),
                new Employee("Сидорова Оксана Евгеньевна", "HR", "sidorova@mail.ru", "+375445654343", 1100, 20),
                new Employee("Царенок Ирина Олеговна", "Дизайнер", "carenok@gmail.com", "+375297865435", 1500, 27),
                new Employee("Рудов Евгений Александрович", "Аналитик", "rudov32@gmail.com", "+375291097654", 2000, 32)
        };
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}










