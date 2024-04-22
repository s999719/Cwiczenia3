import java.util.ArrayList;

public class Tester extends Employee{
    public Tester(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
    }

    private ArrayList<String> testTypes = new ArrayList<>();

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        return super.calculateBaseSalary() + testTypes.size() * 300;
    }
}
