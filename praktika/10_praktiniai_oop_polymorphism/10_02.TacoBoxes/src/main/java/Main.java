
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox test = new TripleTacoBox();
        test.eat();
        System.out.println(test.tacosRemaining());

        CustomTacoBox taco = new CustomTacoBox(25);
        taco.eat();
        taco.eat();
        System.out.println(taco.tacosRemaining());
    }
}
