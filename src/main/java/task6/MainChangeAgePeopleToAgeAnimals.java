package task6;

import java.util.ArrayList;
import java.util.List;

public class MainChangeAgePeopleToAgeAnimals {
    public static void main(String[] args) {
        List<Person>people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski",15));
        people.add(new Person("Zbigniew","Nowak",4));
        people.add(new Person("Anna","Miłą",17));
        people.add(new Person("Ola","Troskliwa",14));

        people.stream()
                .peek(s->s.setAge(s.getAge()*6-2))
                .filter(s->s.getAge()>20)
                .forEach(s-> System.out.println(s));
    }
}
