package is2.kata2.main;

import is2.kata2.calculator.WeightHistogramCalculator;
import is2.kata2.loader.TsvFilePersonLoader;
import is2.kata2.person.Person;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        List<Person> people = TsvFilePersonLoader.with("hw_25000.tsv").load();
        for(Person p : people) {
            System.out.println(p);
        }

        Map<String, Integer> histogram = new WeightHistogramCalculator(people).calculate();
        for(String key : histogram.keySet().stream().sorted().toList()) {
            System.out.println(key + " " + histogram.get(key));
        }

    }

}