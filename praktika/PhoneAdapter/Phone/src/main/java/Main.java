import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;


public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new MobilePhone());

        System.out.println(AutomaticDialer.dial(adapter));
    }

}
