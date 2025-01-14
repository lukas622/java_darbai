

public class Main {

    public static void main(String[] args) {
        // You can test your program here

        BoxWithMaxWeight coffeBox = new BoxWithMaxWeight(10);
        coffeBox.add(new Item("Saludo", 5));
        coffeBox.add(new Item("Pirkka", 5));
        coffeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeBox.isInBox(new Item("Kopi Luwak")));

//        OneItemBox box = new OneItemBox();
//        box.add(new Item("Saludo", 5));
//        box.add(new Item("Pirkka", 5));
//
//        System.out.println(box.isInBox(new Item("Saludo")));
//        System.out.println(box.isInBox(new Item("Pirkka")));

//        MisplacingBox box = new MisplacingBox();
//        box.add(new Item("Saludo", 5));
//        box.add(new Item("Pirkka", 5));
//
//        System.out.println(box.isInBox(new Item("Saludo")));
//        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
