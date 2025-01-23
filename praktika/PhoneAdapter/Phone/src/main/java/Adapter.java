import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class Adapter implements Phone {
    private MobilePhone phone;
    private String response;


    public Adapter(MobilePhone phone) {
        this.phone = phone;
    }

    @Override
    public void dial(String s) {
        response = phone.dial(s);
    }

    @Override
    public String getReponse() {
        return response;
    }
}
