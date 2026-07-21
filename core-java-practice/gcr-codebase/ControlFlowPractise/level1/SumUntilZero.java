package level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.print("Enter Number (0 to Stop): ");
        double number = sc.nextDouble();

        while (number != 0) {

            total += number;

            System.out.print("Enter Number (0 to Stop): ");
            number = sc.nextDouble();
        }

        System.out.println("Total Sum = " + total);
    }
}
