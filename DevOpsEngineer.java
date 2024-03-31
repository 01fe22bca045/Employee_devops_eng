import java.util.Scanner;

class DevOpsEngineer {
    float bonus;
    int salary;

    void readBonus() {
        System.out.println("Enter bonus of DevOps engineer:");
        try (Scanner s = new Scanner(System.in)) {
            bonus = s.nextFloat();
            System.out.println("Enter salary of DevOps engineer:");
            salary = s.nextInt();
        }
    }

    int calculate() {
        salary *= bonus;
        return salary;
    }
}
