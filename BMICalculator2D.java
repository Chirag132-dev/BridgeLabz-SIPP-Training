import java.util.*;

class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: Create 2D array for height, weight, BMI
        double[][] personData = new double[number][3]; // [][0] = height, [][1] = weight, [][2] = BMI
        String[] weightStatus = new String[number];    // weight status for each person

        // Step 3: Input height and weight, validate input
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input height
            do {
                System.out.print("Height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (personData[i][0] <= 0);

            // Input weight
            do {
                System.out.print("Weight (in kilograms): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (personData[i][1] <= 0);

            // Step 4: Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Step 5: Determine weight status
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal weight";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Step 6: Display results
        System.out.println();
        System.out.println("--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println("---------------------------");
        }
    }
}
