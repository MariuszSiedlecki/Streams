package task2;

import task1.Person;

import java.util.ArrayList;
import java.util.List;

public class MainAverageAgePerson {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan","Kowalski",45));
        people.add(new Person("Krystyna","Wielka",35));
        people.add(new Person("Zenon","Zezowaty",30));

        people.stream()
                .mapToInt(s->s.getAge())
                .average()
                .ifPresent(s-> System.out.println("Average age: " + s));

    }
}
