// Find the total of invoice amount having status as "verified" in the below given code snippet using Java stream
import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String product;
    Double amount;
    String status;
    Invoice (String p, double a, String s) {
        product = p;
        amount = a;
        status = s;
    }
}
 class Main {
    public static void main(String[] args) {
        List<Invoice> list = Arrays.asList (
                new Invoice("Item 1", 10.5, null),
                new Invoice("Item 2", 50, "verified"),
                new Invoice("Item 3", 22, "verified"),
                new Invoice("Item 4", 35.5, "not-verified"),
                new Invoice("Item 5", 28, "verified")
        );
        double totalVerifiedAmount = list.stream()
                .filter(invoice -> "verified".equalsIgnoreCase(invoice.status)) // Filter by "verified" status
                .mapToDouble(invoice -> invoice.amount) // Extract the amount
                .sum(); // Sum up the amounts

        System.out.println("Total verified amount: " + totalVerifiedAmount);

    }
    }

