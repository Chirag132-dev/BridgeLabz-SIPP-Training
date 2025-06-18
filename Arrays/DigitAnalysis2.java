import java.util.Scanner;

class DigitAnalysis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number != 0) {
            int digit = number % 10;

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = digit;
            index++;
            number /= 10;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest Digit: " + largest);

        if (secondLargest != -1) {
            System.out.println("Second Largest Digit: " + secondLargest);
        } else {
            System.out.println("Second Largest Digit: Not available (all digits are same or only one digit entered)");
        }
    }
}
