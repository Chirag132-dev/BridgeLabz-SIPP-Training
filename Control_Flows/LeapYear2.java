import java.util.Scanner;
public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year < 1582) {
            System.out.println("Invalid year. Leap year check only valid for year >= 1582");
        } else if(year % 400 == 0) {
            System.out.println("Leap Year");
        } else if(year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if(year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
