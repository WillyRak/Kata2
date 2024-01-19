package is2.kata2.main;

import is2.kata2.loader.TsvFilePersonLoader;
import is2.kata2.person.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Person> people = TsvFilePersonLoader.with("hw_25000.tsv").load();
        for(Person p : people) {
            System.out.println(p);
        }

    }

}