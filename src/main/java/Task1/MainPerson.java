package Task1;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        List<Person>people = new ArrayList<Person>();
        people.add(new Person("Mariusz", "Nowak",38));
        people.add(new Person("Jan","Bogaty",52));
        people.add(new Person("Przemysław","Zgodny",15));
        people.add(new Person("Adam","Kropka",10));

        people.stream()
                .peek(s->{
                    s.setNamme(s.getNamme().substring(0,1));
                    s.setSurname(s.getSurname().substring(s.getSurname().length()-1));
                })
                .reduce((s,s1)->{
                    s.setNamme(s.getNamme()+s1.getNamme());
                    s.setSurname(s.getSurname() + s1.getSurname());
                    s.setAge(s.getAge()+ s1.getAge());
                    return s;
                })
                    .ifPresent(s-> System.out.println(s));
    }
}
