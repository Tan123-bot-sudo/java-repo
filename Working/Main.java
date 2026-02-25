 import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if (percentage >= 90) {
            System.out.println("Grade A");
        }
        else if (percentage >= 80) {
            System.out.println("Grade B");
        }
        else if (percentage >= 70) {
            System.out.println("Grade C");
        }
        else if (percentage >= 60) {
            System.out.println("Grade D");
        }
        else if (percentage >= 50) {
            System.out.println("Grade E");
        }
        else if (percentage < 40) {
            System.out.println("Grade F");
        }
        else {
            System.out.println("Invalid Percentage");
        }

        sc.close();
    }
}