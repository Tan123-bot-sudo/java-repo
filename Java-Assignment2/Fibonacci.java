import java.util.Scanner;

class Fibonacci {

    static void print(int n) {
        int a = 0, b = 1, c;

        if (n >= 1)
            System.out.print(a + " ");

        if (n >= 2)
            System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        print(n);

        sc.close();
    }
}