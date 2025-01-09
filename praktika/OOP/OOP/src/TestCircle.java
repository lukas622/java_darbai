public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Account user  = new Account("1", "Account 1", 1000);
        Account admin = new Account("2", "Admin Account", 5000000);

        admin.transferTo(user, 1000000);

        System.out.println(user.getBalance());
        System.out.println(admin.getBalance());


        //System.out.println(c1.toString());

        //System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        // Circle c2 = new Circle(2.0);

        //System.out.println("The circle has radius of " + c2.getRadius() + " and area  of " + c2.getArea());
    }
}
