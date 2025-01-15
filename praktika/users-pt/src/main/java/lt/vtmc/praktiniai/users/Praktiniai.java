package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int counter = 0;

        for (User user : users) {
            if (user.getAge() > 25) counter++;
        }

        return counter;
    }

    public static double getAverageAge(List<User> users) {
        int ageSum = 0;
        int totalUsers = users.size();

        for (User user : users) {
            ageSum += user.getAge();
        }

        return (double) ageSum/totalUsers;
    }

    public static Integer getMinAge(List<User> users) {
        double minage = Double.POSITIVE_INFINITY;

        for (User user : users) {
            if (user.getAge() < minage) minage = user.getAge();
        }

        return (int) minage;
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User first, User second) {
                return first.getAge().compareTo(second.getAge());
            }
        });

        return users;
    }

    public static User findOldest(List<User> users) {
        User oldest = null;
        int age = 0;

        for (User user : users) {
            if (user.getAge() > age) {
                oldest = user;
                age = user.getAge();
            }
         }

        return oldest;
    }

    public static int sumAge(List<User> users) {
        int ageSum = 0;

        for (User user : users) {
            ageSum += user.getAge();
        }

        return ageSum;
    }

}
