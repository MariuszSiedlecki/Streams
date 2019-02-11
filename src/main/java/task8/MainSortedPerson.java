package task8;

import java.util.ArrayList;
import java.util.List;

public class MainSortedPerson {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Ciekawy",77));
        people.add(new Person("Zofia", "Młoda",88));
        people.add(new Person("Zbigniew", "Najmłodszy", 99));
        people.add(new Person("Matylda","Młoda", 8));
        people.add(new Person("Filip","Nastoletni",12));

        people.stream()
                .sorted((s,s1)->Integer.compare(s.getAge(),s1.getAge())*-1)
                .forEach(s-> System.out.println(s));
    }
}