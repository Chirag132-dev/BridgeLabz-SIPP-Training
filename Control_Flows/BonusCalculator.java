import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        double bonus = 0;

        if(years > 5) {
            bonus = 0.05 * salary;
        }

        System.out.println("Bonus: " + bonus);
    }
}
