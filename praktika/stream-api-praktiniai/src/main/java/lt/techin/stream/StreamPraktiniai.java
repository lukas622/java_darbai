package lt.techin.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
        return numbers.stream().map(n -> (int) Math.sqrt(n)).collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        return users.stream().map(User::getAge).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
        return users.stream().map(User::getAge).distinct().collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        return users.stream().limit(limit).collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users){
        return (int) users.stream().filter(n -> n.getAge() > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
        return integers.stream().reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream().skip(toSkip).collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static List<String> getDistinctLetters(List<String> names){
        throw new UnsupportedOperationException("Not implemented");
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream().map(User::getName).collect(Collectors.joining(","));
    }

    public static double getAverageAge(List<User> users){
        return (double) users.stream().reduce(0, (acc, usr) -> acc + usr.getAge(), Integer::sum) / (long) users.size();
    }

    public static Integer getMaxAge(List<User> users){
        return users.stream().mapToInt(User::getAge).max().orElse(-1);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().orElse(-1);
    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream().anyMatch(n -> n.getAge() == age);
    };

    public static boolean noneMatch(List<User> users, int age){
        return users.stream().noneMatch(n -> n.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream().filter(n -> Objects.equals(n.getName(), name)).findAny();
    }

    public static List<User> sortByAge(List<User> users){
        return users.stream().sorted(((o1, o2) -> o1.getAge().compareTo(o2.getAge()))).collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static User findOldest(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int sumAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        throw new UnsupportedOperationException("Not implemented");
    }

}
