package Java2HomeWork9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Вика", Arrays.asList(new Course("Математика"), new Course("Геометрия"),
                new Course("История"))));
        students.add(new Student("Петя", Arrays.asList(new Course("Обществознание"),
                new Course("МХК"), new Course("ИЗО"), new Course("Природоведение"))));
        students.add(new Student("Максим", Arrays.asList(new Course("Математика"))));


        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(c -> c.stream())
                .collect(Collectors.toSet()));


        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("Math");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}