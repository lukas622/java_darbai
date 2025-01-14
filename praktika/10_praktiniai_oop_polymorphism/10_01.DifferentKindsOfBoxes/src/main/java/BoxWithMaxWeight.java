import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;;
    private ArrayList<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        maxWeight = capacity;
    }

    @Override
    public void add(Item item) {
        int weight = 0;

        for (Item it : items) {
            weight += it.getWeight();
        }

        if ((weight + item.getWeight()) > maxWeight) return;
        items.add(item);
        weight += item.getWeight();
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item it : items) {
            if (item.equals(it)) return true;
        }
        return false;
    }
}
