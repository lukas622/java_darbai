import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.*;

public class PhilatelistImpl implements Philatelist {
    ArrayList<PostStamp> collection = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (collection.contains(postStamp)) return;

        collection.add(postStamp);
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collection.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp postStamp : collection) {
            System.out.println(postStamp.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        for (PostStamp postStamp : collection) {
            if (postStamp.getMarketPrice() > v) {
                System.out.println(postStamp.getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return collection.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        for (PostStamp postStamp : collection) {
            return postStamp.getName().equals(s);
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        double counter = 0;

        for (PostStamp postStamp : collection) {
            counter += postStamp.getMarketPrice();
        }

        return counter;
    }

    @Override
    public double getAveragePostStampPrice() {
        double totalMarketPrice = calculateTotalMarketPrice();
        int totalPostStamps = getNumberOfPostStampsInCollection();

        return totalMarketPrice/totalPostStamps;
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        PostStamp mostExpensive = null;
        double biggestValue = 0;

        for (PostStamp postStamp : collection) {
            if (postStamp.getMarketPrice() > biggestValue) {
                mostExpensive = postStamp;
                biggestValue = postStamp.getMarketPrice();
            }
        }

        return mostExpensive;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        List<PostStamp> result = new ArrayList<>();

        for (PostStamp postStamp : collection) {
            if (postStamp.getName().contains(s)) {
                result.add(postStamp);
            }
        }

        return result;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        List<PostStamp> sorted = collection;

        sorted.sort(new Comparator<PostStamp>() {
            @Override
            public int compare(PostStamp first, PostStamp second) {
                return first.getName().compareTo(second.getName());
            }
        });

        return sorted;
    }
}
