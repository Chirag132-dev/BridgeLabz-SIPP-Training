import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Arrays to store marks, percentage, and grade
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks and validate
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            physics[i] = getValidMark(sc, "Physics");
            chemistry[i] = getValidMark(sc, "Chemistry");
            maths[i] = getValidMark(sc, "Maths");

            // d. Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // e. Calculate grade
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // f. Display result
        System.out.println("\nResult:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + physics[i] + 
                ", Chemistry = " + chemistry[i] + ", Maths = " + maths[i] +
                ", Percentage = " + String.format("%.2f", percentage[i]) + "%, Grade = " + grade[i]);
        }

        sc.close();
    }

    // Method to validate positive marks
    public static int getValidMark(Scanner sc, String subject) {
        int mark;
        do {
            System.out.print(subject + " marks (0–100): ");
            mark = sc.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid! Please enter a value between 0 and 100.");
            }
        } while (mark < 0 || mark > 100);
        return mark;
    }
}