import java.util.Scanner;

public class CoffeShop {
    String CoffeTypes;
    int Qunatity;
    public void calculatePrice(String type,double price){
            double bill = price*Qunatity;
            double gst = price*0.18;
            double finalBill = bill+gst;
            return finalBill;
    }
    public void generateBill(double bill){
        System.err.println("-----------------------------------------------------------------------------");
        System.out.println("COFFEE TYPE->"+CoffeTypes);
        System.err.println("QUNANTITY->"+Qunatity);
        System.out.println("BILL AMOUNT->"+bill);
        System.err.println("THANK YOU FOR YOUR VISIT");
        System.err.println("-----------------------------------------------------------------------------");

    }
    public static void main(String[] args){
        System.out.println("Choose Coffe type or exit!!");
        System.out.println("1.Cappaccio:-150\n2.Latte:-250\n3.Esspresso:-270\n4.Americano:-370\n5.Black Coffee:-600");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        CoffeShop coffee = new CoffeShop();
        switch(choice){
            case 1:
                coffee.generateBill(coffee.calculatePrice(150));
                coffee.CoffeTypes="Cappaccio";
                break;

            case 2:
                coffee.generateBill(coffee.calculatePrice(250));
                coffee.CoffeTypes="Lattee";
                break;
            case 3:
                    coffee.generateBill(coffee.calculatePrice(270));
                    coffee.CoffeTypes="Esspresso";
                    break;
        }

    }
}
