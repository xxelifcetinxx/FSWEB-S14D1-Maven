package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing the hiring process");
        setSalary(getSalary() + 1000);
    }

    public void addEmployee(JuniorDeveloper junior) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                return;
            }
        }
        System.out.println("No space for new Junior Developer.");
    }

    public void addEmployee(MidDeveloper mid) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                return;
            }
        }
        System.out.println("No space for new Mid Developer.");
    }

    public void addEmployee(SeniorDeveloper senior) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                return;
            }
        }
        System.out.println("No space for new Senior Developer.");
    }
}
