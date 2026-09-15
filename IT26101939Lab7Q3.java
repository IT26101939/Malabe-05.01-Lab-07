import java.util.Scanner;

public class IT26101939Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill, discount, amountToPay;
        char paymentMode;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            paymentMode = input.next().charAt(0);

            // Convert lowercase input to uppercase
            paymentMode = Character.toUpperCase(paymentMode);

            if (paymentMode == 'C') {
                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (paymentMode == 'O') {
                discount = 0;
                amountToPay = bill;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }

        input.close();
    }
}