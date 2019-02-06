package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainSumNameSurnameIsSame {
    public static void main(String[] args) {


    List<Person> people = new ArrayList<>();
    people.add(new Person("Jan", "Trzy",33));
    people.add(new Person("Ola","Tocc",25));
    people.add(new Person("Maks","Cztery",9));
    people.add(new Person("Ania","Znana",25));
    people.add(new Person("Paweł","Sum",27));
    people.add(new Person("Mariusz","To",35));

   Map<Integer, List<Person>>listPeople = people.stream()
           .collect(Collectors.groupingBy(s->s.getName().length()+s.getSurname().length()));
        System.out.println(listPeople);

}
}