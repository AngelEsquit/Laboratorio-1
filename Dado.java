import java.util.Random;

public class Dado {
    private int num;
    Random random = new Random();

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }   

    public void tirarDado() {
        this.num = random.nextInt(6) + 1;
    }
}
