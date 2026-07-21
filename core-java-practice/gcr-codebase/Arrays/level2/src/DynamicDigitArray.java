import java.util.Scanner;

public class DynamicDigitArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String number = sc.nextLine();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits.length; j++) {
                    temp[j] = digits[j];
                }
                digits = temp;
            }

            digits[index] = number.charAt(i) - '0';
            index++;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit : " + largest);
        System.out.println("Second Largest Digit : " + secondLargest);
    }
}

//int a = new int();