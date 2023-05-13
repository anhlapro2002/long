package bt7_1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John", true, "Premium");

        // Create a visit
        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(50);

        // Calculate and print the total expense
        double totalExpense = visit.getTotalExpense();
        System.out.println("Total Expense: $" + totalExpense);
    }
}

