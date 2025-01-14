public class TripleTacoBox implements TacoBox{
    Object tacos;

    public TripleTacoBox() {
        tacos = 3;
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
