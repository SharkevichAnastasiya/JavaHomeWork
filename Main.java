    /*1. Создайте метод printThreeWords(),
    который при вызове должен отпечатать в столбец
    три слова: Orange, Banana, Apple.*/

    import java.util.Arrays;
    import java.util.Random;

    public class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(checkSum(10, 20));
        //checkPositiveOrNegative(-9 );
        //System.out.println(checkPositiveOrNegative2(-9));
        //repeatMessage("message" ,8);
        //System.out.println(isLeapYear(2024));
        //invertArray();
        //fillArray();
        //multiplyLessThanSix();
        //fillDiagonal();
        returnInitialValueArray(5 ,6);


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать
    эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение
    “Сумма положительная”,в противном случае - “Сумма отрицательная”; */
    public static void checkSumSign() {
        Random rn = new Random();
        int a = -1;
        int b = rn.nextInt(5);
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        }

    /*3. Создайте метод printColor() в теле которого задайте int переменную value
    и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль
    метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно)
    до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/
    public static void printColor() {
        Random rn = new Random();
        int a = -50;
        int b = rn.nextInt(200);
        int value = a + b;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 1 && value <= 100) {
            System.out.println("Желтый");
        }else  {
            System.out.println("Зеленый");
        }
    }

    /* 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
    то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/
    public static void compareNumbers() {
        Random rn = new Random();
        int a = rn.nextInt(5);
        int b = rn.nextInt(5);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /*5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean checkSum(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    /*6. Напишите метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное.Замечание:
    ноль считаем положительным числом.*/
    public static void checkPositiveOrNegative(int x ){
        if (x >= 0) {
            System.out.println("Положительное");
        }else{
            System.out.println("Отрицательноее");
        }
        }

    /*7. Напишите метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.*/
    public static boolean checkPositiveOrNegative2(int x ) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /*8. Напишите метод, которому в качестве аргументов передается строка и число,
     метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void repeatMessage(String message, int repeat) {
        for (int i=1;i<=repeat;i++) {
            System.out.println(message);
        }
    }

     /* 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean
     (високосный - true, не високосный - false). Каждый 4-й год является високосным,
      кроме каждого 100-го, при этом каждый 400-й – високосный.*/
     public static boolean isLeapYear(int year) {
         return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

     /*10. Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1,
     1 на 0;*/
        public static void invertArray() {
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                    continue;
                }
                if (array[i] == 0) {
                    array[i] = 1;
                }
            }
            //System.out.println(Arrays.toString(array));
        }

     /*11. Задать пустой целочисленный массив длиной 100.
     С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/
     public static void fillArray() {
         int[] array = new int[100];
         for (int i = 0; i < array.length; i++) {
             array[i] = i + 1;
         }
         //System.out.println( Arrays.toString(array));
     }

     /*12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2; */
     public static void multiplyLessThanSix() {
         int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         for (int i = 0; i < array.length; i++) {
             if (array[i] < 6) {
                 array[i] *= 2;
             }
         }
         System.out.println(Arrays.toString(array));
     }

     /*13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     если обе сложно).Определить элементы одной из диагоналей можно по следующему принципу:
     индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]; */
     public static void fillDiagonal() {
         int size = 5;
         int[][] matrix = new int[size][size];
         for (int i = 0; i < size; i++) {
             matrix[i][i] = 1;
         }
         for (int[] row : matrix) {
             for (int num : row) {
                 System.out.print(num + " ");
             }
             System.out.println();
         }
     }
     /*14. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.*/
     public static int[] returnInitialValueArray(int len , int initialValue) {
         int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            //System.out.println(Arrays.toString(array));
            return array;
     }

    }
