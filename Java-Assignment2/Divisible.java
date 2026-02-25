import java.util.Scanner;

class Divisible {

    static void check(int num) {
        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        check(num);

        sc.close();
    }
}