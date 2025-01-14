
public class Main {

    public static void main(String[] args) {
        // test your classes here

//        Packable book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
//        Packable book2 = new Book("Robert Martin", "Clean Code", 2);
//        Packable book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
//
//        Packable cd1 = new CD("Pink Floyd", "Dark Side of the Moon 1", 1973);
//        Packable cd2 = new CD("Pink Floyd", "Dark Side of the Moon 2", 1986);
//        Packable cd3 = new CD("Pink Floyd", "Dark Side of the Moon 3", 1776);
//
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);

//        Box box = new Box(10);
//
//        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
//        box.add(new Book("Robert Martin", "Clean Code", 1));
//        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
//
//        box.add(new CD("Pink Floyd", "Dark Side of the Moon 1", 1973));
//        box.add(new CD("Pink Floyd", "Dark Side of the Moon 2", 1986));
//        box.add(new CD("Pink Floyd", "Dark Side of the Moon 3", 1776));
//
//        System.out.println(box);

        Box firstBox = new Box(20);
        Box secondBox = new Box(5);
        Box thirdBox = new Box(5);

        firstBox.add(secondBox);
        firstBox.add(thirdBox);

        thirdBox.add(new CD("Pink Floyd", "Dark Side of the Moon 3", 1776));

        System.out.println(firstBox);
    }

}
