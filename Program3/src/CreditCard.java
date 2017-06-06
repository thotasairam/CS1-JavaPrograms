/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args){

        //Initializing Variables
        String customerName = "";
        String memberLevel = "";

        Scanner n = new Scanner(System.in);

        final String WIZARD_MEMBER = "Wizard";
        final String PATRONAS_MEMBER = "Patronas";
        final String MUGGLE_MEMBER = "Muggle";

        boolean latePayment = false;
        double principle;
        double paymentToPrinciple = 0.0;
        double paymentToInterest = 0.0;
        double totalPayment = 0.0;
        double percentToPrinciple = 0.0;
        double percentToInterest = 0.0;
        double lateFee = 0.0;
        int temp = 0;

        System.out.println("Credit Card program by Sai Ram Thota");

        System.out.print("Customer name:");
        customerName =n.nextLine();

        System.out.print("Customer member level:");
        //Looping through do-while loop until right input is given
        do {
            if(temp >0)
            {
                System.out.println("    Invalid Level. Must be one of Wizard, Patronas, Muggle");
                System.out.print("Customer member level:");
            }
            memberLevel = n.next();
            temp++;
        }while (!(memberLevel.equalsIgnoreCase(WIZARD_MEMBER) || memberLevel.equalsIgnoreCase(PATRONAS_MEMBER) || memberLevel.equalsIgnoreCase(MUGGLE_MEMBER)));

        System.out.print("Current balance:");
        principle = n.nextDouble();

        System.out.print("Was the payment made late?: ");

        if(n.next().equalsIgnoreCase("yes"))
        {
            latePayment = true;
        }

        if(memberLevel.equalsIgnoreCase(WIZARD_MEMBER))
        {
            System.out.println("\nBill for customer " + customerName);
            System.out.printf("Wizard level card balance: $%.2f%n", principle);

            if (latePayment) {
                paymentToInterest = principle * 0.019;
                System.out.printf("Interest for late payment (1.9%% of principle) : $%.2f%n", paymentToInterest);
            } else {
                paymentToInterest = principle * 0.009;
                System.out.printf("Interest for on-time payment (0.9%% of principle) : $%.2f%n", paymentToInterest);
            }

            paymentToPrinciple = principle * 0.03;
            System.out.printf("Minimum payment to principle (3%% of principle): $%.2f%n", paymentToPrinciple);

            totalPayment = paymentToInterest + paymentToPrinciple ;
            System.out.printf( "Minimum total payment (payment, interest, and fees) : $%.2f%n", totalPayment);

            percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            System.out.printf("Percent to principle: %.1f%%%n" , percentToPrinciple);


            percentToInterest = 100 - percentToPrinciple;
            System.out.printf("Percent to interest and fees: %.1f%%%n" , percentToInterest);

        }
        else if(memberLevel.equalsIgnoreCase(PATRONAS_MEMBER))
        {
            System.out.println("\nBill for customer " + customerName);
            System.out.println("Patronas level card balance: " + principle);

            if (latePayment)
            {
                paymentToInterest = principle * 0.028;
                lateFee = 10;
                System.out.printf("Interest for late payment (2.8%% of principle) : $%.2f%n", paymentToInterest);
                System.out.printf("Late fee for Patronas: $%.2f %n", lateFee);
            }
            else {
                paymentToInterest = principle * 0.017;
                System.out.printf("Interest for on-time payment (1.7%% of principle) : $%.2f%n", paymentToInterest);
            }

            paymentToPrinciple = principle * 0.03;
            System.out.printf("Minimum payment to principle (3%% of principle): $%.2f%n", paymentToPrinciple);

            totalPayment = paymentToInterest + paymentToPrinciple + lateFee ;
            System.out.printf( "Minimum total payment (payment, interest, and fees) : $%.2f%n", totalPayment);

            percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            System.out.printf("Percent to principle: %.1f%%%n" , percentToPrinciple);


            percentToInterest = 100 - percentToPrinciple;
            System.out.printf("Percent to interest and fees: %.1f%%%n" , percentToInterest);

        }
        else if(memberLevel.equalsIgnoreCase(MUGGLE_MEMBER))
        {
            System.out.println("\nBill for customer " + customerName);
            System.out.println("Muggle level card balance: " + principle);

            if (latePayment) {
                paymentToInterest = principle * 0.037;
                lateFee = 20;
                System.out.printf("Interest for late payment (3.7%% of principle) : $%.2f %n", paymentToInterest);
                System.out.printf("Late fee for Muggle: $%.2f %n", lateFee);

            } else {
                paymentToInterest = principle * 0.025;
                System.out.printf("Interest for on-time payment (2.5%% of principle) : $%.2f %n", paymentToInterest);
            }

            paymentToPrinciple = principle * 0.03;
            System.out.printf("Minimum payment to principle (3%% of principle): $%.2f %n", paymentToPrinciple);

            totalPayment = paymentToInterest + paymentToPrinciple + lateFee;
            System.out.printf("Minimum total payment (payment, interest, and fees) : $%.2f %n", totalPayment);

            percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            System.out.printf("Percent to principle: %.1f%%%n" , percentToPrinciple);


            percentToInterest = 100 - percentToPrinciple;
            System.out.printf("Percent to interest and fees: %.1f%%%n" , percentToInterest);

        }

    }
}