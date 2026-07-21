import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0;

        int index = 0;
        while (true) {
            if (index == 10)
                break;
            System.out.print("Enter Number: ");
            double number = sc.nextDouble();
            if (number <= 0)
                break;
            arr[index] = number;
            index++;
        }

        System.out.println("Numbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println();
        System.out.println("Total Sum = " + total);
    }
}