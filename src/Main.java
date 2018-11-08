import ru.gorshckov.Person;

import java.util.*;

public class Main {
    private static Map<Person, String> map = new HashMap<>();


    public static void main(String[] args) {


        Person Jon = new Person("Jon",21,'m');
        Person Jane = new Person("Jane",31,'f');
        Person Bob = new Person("Bob",25,'m');

       map.put(Jon,"in");
        map.put(Jane,"in");
        map.put(Bob,"in");

        for (Person person : map.keySet()) {
            System.out.println(person.toString() + " "+ (15&person.hashCode()));

        }
    }

}
