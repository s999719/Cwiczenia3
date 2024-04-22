public class Employee {protected String firstName;
    private String lastName;
    private String address;
    private String email;
    private String PESEL;
    private int employmentYear;

    public Employee(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.employmentYear = employmentYear;
    }

    public int calculateBaseSalary() {
        return 3000 + (2024 - employmentYear) * 1000;
    }

    public int calculateSalary() {
        return calculateBaseSalary();
    }

}
