//Написать простой класс Телефонный Справочник, который хранит
//в себе список фамилий и телефонных номеров. В этот телефонный справочник
//с помощью метода add() можно добавлять записи, а с помощью метода get() искать
//номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
//несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии
//должны выводиться все телефоны.
package PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сидоров", "29-111-11-11");
        phoneBook.add("Иванов", "33-222-22-22");
        phoneBook.add("Сидоров", "44-333-33-33");

        System.out.println("Номера для Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Номера для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера для Петров: " + phoneBook.get("Петров"));
    }
}