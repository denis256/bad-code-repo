/**
 * Created by denis on 3/28/17.
 */
public class ClassC {

    public int usedVariable;

    private String privateUnusedVar;

    protected float protectedVar;
    int potato;
    String tomato;

    public void methodA() {
        methodB();
    }

    public void methodB() {
        methodA();
    }

}
