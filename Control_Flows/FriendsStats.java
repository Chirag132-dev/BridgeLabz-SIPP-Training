import java.util.Scanner;
public class FriendsStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        double height1 = sc.nextDouble();
        int age2 = sc.nextInt();
        double height2 = sc.nextDouble();
        int age3 = sc.nextInt();
        double height3 = sc.nextDouble();

        int youngestAge = age1;
        if(age2 < youngestAge) youngestAge = age2;
        if(age3 < youngestAge) youngestAge = age3;

        double tallestHeight = height1;
        if(height2 > tallestHeight) tallestHeight = height2;
        if(height3 > tallestHeight) tallestHeight = height3;

        System.out.println("Youngest age: " + youngestAge);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
