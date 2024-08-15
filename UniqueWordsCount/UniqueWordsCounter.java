//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//Посчитать, сколько раз встречается каждое слово.(реализовать с использованием коллекций)

package UniqueWordsCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "apple",
                "apple", "mango", "melon", "apple",
                "orange", "grape", "kiwi", "banana",
                "apple", "banana", "grape", "apple",};

        Map<String, Integer> map = new HashMap<>();
        for (String word : wordsArray) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);}
        }
        Set<String> uniqueWords  = map.keySet();
        System.out.println("Уникальные слова и количество их встречаемости: ");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord + ": " + map.get(uniqueWord));}
    }
}

