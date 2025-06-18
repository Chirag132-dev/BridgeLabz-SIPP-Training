import java.util.*;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Step 5: Determine weight status
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal weight";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println();
        System.out.println("--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.printf("BMI: %.2f\n", bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("---------------------------");
        }
    }
}
