import java.util.Scanner;
public class PhoneBill {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner (System.in);
       int monthlyCost; 
       int dataUsage; 
       int costPerData; 
       int monthlyBill; 

    System.out.println("Enter monthly cost: ");
    monthlyCost = scanner.nextInt();
    
    System.out.println( "Enter data Usage: ");
    dataUsage = scanner.nextInt();

    System.out.println("Enter cost per data: ");
    costPerData = scanner.nextInt(); 

    monthlyBill = monthlyCost + (dataUsage * costPerData );

    System.out.println("Total Cost: " + monthlyBill);
    }
}
