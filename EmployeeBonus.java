import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Years of Service: ");
            double yos = sc.nextDouble();

            if (sal <= 0 || yos < 0) {
                System.out.println("Invalid input! Salary must be > 0 and years of service >= 0. Try again.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yos;
        }

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n=== Employee Bonus and Salary Details ===");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n=== Summary ===");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}

