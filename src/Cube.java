import java.util.Random;

public class Cube {
    private int d;
    private int value;


    public Cube(int max_d){
        this.d=max_d;
    }

    public void roll(){
        Random rand = new Random();
        this.value = rand.nextInt(this.d)+1;
    }

    public int getValue(){
        return this.value;
    }
}
