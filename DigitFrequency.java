import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Step 2: Count digits and store them in an array
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 3: Create frequency array
        int[] freq = new int[10]; // index 0–9 for digit frequencies

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Step 4: Display digit frequencies
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}
