public class OneItemBox extends Box {
     private Item container;

    public OneItemBox() {
        container = null;
    }

    @Override
    public void add(Item item) {
        if (container != null) return;

        container = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return item.equals(container);
    }
}
