import java.util.Scanner;
public class FactorsFinder3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 0) {
            for(int i = 1; i < number; i++) {
                if(number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
    }
}
