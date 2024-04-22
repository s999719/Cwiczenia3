import java.util.ArrayList;

public class Developer extends Employee {
    public Developer(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
    }

    private ArrayList<Technology> technologies = new ArrayList<>();

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        int bonus = 0;
        for (Technology tech : technologies) {
            bonus += tech.getBonus();
        }
        return super.calculateBaseSalary() + bonus;
    }

}
