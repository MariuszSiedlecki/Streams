package task3;

import java.util.ArrayList;
import java.util.List;

public class MainOldestPersonOfList {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person(" Krzysztof ", " Janosz ", 29));
        people.add(new Person(" Anna "," Zdumiona ", 89));
        people.add(new Person(" Ludwik "," Sowity ",92));
        people.add(new Person(" Leszek ", " Stary ",63));

        people.stream()
                .max((s,s1)->Integer.compare(s.getAge(),s1.getAge())*1)
                .map(s->{
                    s.setName(" Najstarsza osoba na liście to: " + s.getName());
                    return s;
                })
                .ifPresent(s-> System.out.println(s));
    }
}