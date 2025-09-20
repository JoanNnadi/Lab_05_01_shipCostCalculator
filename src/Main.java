
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of a shipping item: $ ");
        double itemPrice = in.nextDouble();
        double shippingCost;

        if (itemPrice >= 100) {
            shippingCost = 0;
            System.out.println( "Your shipping cost is free: ");

        }
              else
        {
            shippingCost = itemPrice * 0.02;
            double totalPrice = itemPrice + shippingCost;
            System.out.println("your shippping cost is:  "  + shippingCost);
            System.out.println("The total shipping price: 15" + totalPrice);
        }

                if (itemPrice <= 100) {    // when shipping is less than 100
                    shippingCost = 0;

                    System.out.println(" Your shipping cost is not free: ");
                }

                else
                {
                    shippingCost = itemPrice * 0.02;
                    double totalPrice = itemPrice + shippingCost;
                    System.out.println("your shippping cost is:  "  + shippingCost);
                    System.out.println("The total shipping price: 15" + totalPrice);
                }




            }
}