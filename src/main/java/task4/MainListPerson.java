package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainListPerson {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Stary",99));
        people.add(new Person("Piotr", "Nietakstary",88));
        people.add(new Person("Michał","Trochęstary",77));
        people.add(new Person("Kasia", "Wieczniemłoda",66));
        people.add(new Person("Teofil", "Młodzieniaszek",55));

        List<Integer>listAges = people.stream()
                .map(s->s.getAge())
                .collect(Collectors.toList());
        System.out.println("list by age:" + listAges);
    }
}
