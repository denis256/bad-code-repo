/**
 * Created by denis on 3/28/17.
 */
public class ClassWIthUnusedVariables {

    int potato;
    String tomato;

    public void methodA() {
        methodB();
    }

    public void methodB() {
        methodA();
    }

}
