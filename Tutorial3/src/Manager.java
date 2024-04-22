import java.util.ArrayList;

public class Manager extends Employee  {

    public Manager(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
    }

    private ArrayList<Goal> goals = new ArrayList<>();

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                bonus += goal.getBonus();
            }
        }
        return super.calculateBaseSalary() + bonus;
    }

}
