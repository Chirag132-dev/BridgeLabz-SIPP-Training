import java.util.Scanner;
public class PowerCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;

        while(counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println("Result: " + result);
    }
}
