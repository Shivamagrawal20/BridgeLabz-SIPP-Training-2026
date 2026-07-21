import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter Heights of 11 Players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean Height = " + mean);
    }
}