import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the plan type (DOMESTIC, COMMERCIAL):");
        String planType = sc.nextLine().toUpperCase();

        System.out.println("Enter the rate:");
        int rate = sc.nextInt();

        System.out.println("Enter the number of units:");
        int units = sc.nextInt();

        GetPlanFactory planFactory = new GetPlanFactory();
        Plan plan = planFactory.getPlan(planType);

        if(plan != null) {
            plan.setRate(rate);
            int bill = plan.calculateBill(units);  
            System.out.println("The bill for " + units + " units for " + planType + " plan is: " + bill);
        } else {
            System.out.println("Invalid plan type entered.");
        }

        sc.close();
    }
}
