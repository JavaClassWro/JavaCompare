import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        sortingDemo();
    }

    private static void sortingDemo() {
        System.out.println("---Sorting Demo---");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Will", 23, "M"));
        students.add(new Student("Alice", 25, "F"));
        students.add(new Student("Susan", 20, "OTHER"));
        Collections.sort(students);
        students.forEach(System.out::println);

        System.out.println("---Comparator Demo---");
        Collections.sort(students, new SortByAge());
        students.forEach(System.out::println);

        System.out.println("---Lambda Demo---");
        Collections.sort(students, (s1, s2) -> s1.getGender().compareTo(s2.getGender()));
        students.forEach(System.out::println);

        System.out.println("---Method reference Demo---");
        Collections.sort(students, Comparator.comparing(Student::getGender));
        students.forEach(System.out::println);
    }
}
