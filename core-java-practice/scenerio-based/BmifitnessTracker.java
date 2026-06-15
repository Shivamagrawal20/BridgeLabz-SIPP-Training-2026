import java.util.Scanner;

public class BmifitnessTracker {

    public double Calvulatebmi(double height,double weight){
        return weight/(height*weight);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Height");
        double height = scanner.nextDouble();
        System.out.println("Enter Your Weight");
        double weight = scanner.nextDouble();
        BmifitnessTracker tracker = new BmifitnessTracker();
        double bmi = tracker.calculateBMI(height, weight);

        System.out.println("Your BMI IS",bmi);

        if(bmi<18.5){
            System.out.println("UNDERWEIGHT");
        }else if(bmi<25){
            System.out.println("NORMAL");
        }else{
            System.err.println("OBESE");
        }
        scanner.close();

    }
}
