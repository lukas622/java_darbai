public class CustomTacoBox implements TacoBox {
    Object tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return (int) tacos;
    }

    @Override
    public void eat() {
        tacos = ((int) tacos)-1;
    }
}
