import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items = new ArrayList<>();

    public Box(double capacity) {
        this.capacity = capacity;
    }

    public double weight() {
        double weight = 0;

        for (Packable p : items) {
            weight += p.weight();
        }

        return weight;
    }

    public void add(Packable item) {
        if ((weight() + item.weight()) > capacity) return;

        items.add(item);
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
