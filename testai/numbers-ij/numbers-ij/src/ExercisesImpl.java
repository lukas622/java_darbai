import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExercisesImpl implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().min(Integer::compareTo).orElse(-1);
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().max(Integer::compareTo).orElse(-1);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o==o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        return List.of();
    }

    @Override
    public int computeSumOfNumbers(int i) {
        int sum = 0;

        for (int j = 1; j <= i; j++) {
            sum += j;
        }

        return sum;
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int sum = 0;

        for (int j = 1; j <= i; j++) {
            if (numberFilter.accept(j)) {
                sum += j;
            }
        }

        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        List<Integer> ints = new ArrayList<>();

        for (int j = 1; j < i; j++) {
            ints.add(j);
        }

        return ints;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(e -> e, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGeneratorImpl();
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return integerGenerator;
    }
}
