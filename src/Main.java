import Kata2.Person;
import Kata2.TsvFilePersonLoader;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Person> people = TsvFilePersonLoader.with("hw_25000.tsv").load();
        for(Person person : people) {
            System.out.println(person);
        }
    }
}