import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. 2D array to store marks [n][3] and 1D arrays for percentage and grade
        int[][] marks = new int[n][3]; // [i][0]=Physics, [i][1]=Chemistry, [i][2]=Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks and validate
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            marks[i][0] = getValidMark(sc, "Physics");
            marks[i][1] = getValidMark(sc, "Chemistry");
            marks[i][2] = getValidMark(sc, "Maths");

            // d. Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // e. Calculate grade based on percentage
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
            System.out.println("Student " + (i + 1) + ": Physics = " + marks[i][0] +
                    ", Chemistry = " + marks[i][1] + ", Maths = " + marks[i][2] +
                    ", Percentage = " + String.format("%.2f", percentage[i]) + "%, Grade = " + grade[i]);
        }

        sc.close();
    }

    // Method to validate marks between 0 and 100
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
