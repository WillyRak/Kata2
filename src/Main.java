import Kata2.MeanCalculator;
import Kata2.Person;
import Kata2.TsvFilePersonLoader;
import Kata2.WeightHistogramCalculator;

import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Person> people = TsvFilePersonLoader.with("hw_25000.tsv").load();
        Map<String, Integer> histogram = new WeightHistogramCalculator(people).calculate();
        for(String key : histogram.keySet().stream().sorted().toList()) {
            System.out.println(key + " " + histogram.get(key));
        }

        MeanCalculator meanCalculator = new MeanCalculator();
        Map<String, Double> mean = meanCalculator.calculate(people);
        System.out.println(mean);
    }
}