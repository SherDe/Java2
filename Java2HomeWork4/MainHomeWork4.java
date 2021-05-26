package Java2HomeWork4;
import java.util.*;

public class MainHomeWork4 {
    public static void main(String[] args) {
        Work1();
        Work2();
    }

    private static void Work1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Бульбазар", "Ивизавр", "Венузавр",
                "Чармандер", "Бульбазар", "Сквиртл",
                "Катерпи", "Пикачу", "Пикачу",
                "Видл", "Бидрилл", "Пиджи",
                "Раттата", "Пиджи", "Бульбазар",
                "Бульбазар", "Пикачу", "Бульбазар", "Нидоквин"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void Work2() {
        Directory directory = new Directory();

        directory.add("Регина", "8999123321");
        directory.add("Регина", "8912155326");
        directory.add("Пётр", "8917155552");
        directory.add("Пётр", "8913455672");
        directory.add("Регина", "899999999");
        directory.add("Максим", "899111111");
        directory.add("Пётр", "89923231999");
        directory.add("Игорь", "8888123113");
        directory.add("Максим", "8324325234");

        System.out.println(directory.get("Регина"));
        System.out.println(directory.get("Максим"));
        System.out.println(directory.get("Пётр"));
        System.out.println(directory.get("Игорь"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }}
