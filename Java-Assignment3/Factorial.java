 import java.util.Scanner;

class Factorial {
    int num;

    Factorial(int num) {
        this.num = num;
    }

    int calculateFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Factorial obj = new Factorial(n);
        int result = obj.calculateFactorial();

        System.out.println("Factorial of " + n + " is: " + result);
    }
}