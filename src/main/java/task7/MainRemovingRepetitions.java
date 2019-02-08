package task7;

import java.util.ArrayList;
import java.util.List;

public class MainRemovingRepetitions {
    public static void main(String[] args) {

        List<Person>people = new ArrayList<>();
        people.add(new Person("Jan", "Niepowtorzony",33));
        people.add(new Person("Anna","Powtorzona",25));
        people.add(new Person("Olo","Jedyna",25));
        people.add(new Person("Anna","Powtorzona",25));
        people.add(new Person("Paweł","Oryginał",66));
        people.add(new Person("Anna","Powtorzona",25));
        people.add(new Person("Anna","Powtorzona",25));

        System.out.println("Duplicated person:" + ( people.size() - people.stream().distinct().count()));


    }
}
