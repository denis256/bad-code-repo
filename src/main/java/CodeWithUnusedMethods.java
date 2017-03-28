
public class CodeWithUnusedMethods {

    float salary;
    String name;

    public CodeWithUnusedMethods(float salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
