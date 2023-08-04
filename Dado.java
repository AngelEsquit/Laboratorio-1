import java.util.Random;

public class Dado {
    private int num;
    Random random = new Random();

    public void setNum() {
        this.num = random.nextInt(6) + 1;
    }

    public int getNum() {
        return num;
    }   
}
