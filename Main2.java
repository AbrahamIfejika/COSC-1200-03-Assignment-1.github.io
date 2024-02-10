import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Currency[] currencies = {new CAD(), new USD(), new JPY(), new NGN()};
        String[] currencyNames = {"CAD", "USD", "JPY", "NGN"};

        System.out.println("Select the currency you want to convert from:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencyNames[i]);
        }
        int fromIndex = scanner.nextInt() - 1;

        System.out.println("Select the currency you want to convert to:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencyNames[i]);
        }
        int toIndex = scanner.nextInt() - 1;

        System.out.println("Enter the amount to convert:");
        double amount = scanner.nextDouble();

        double convertedAmount = currencies[fromIndex].convert(amount, currencies[toIndex]);
        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, currencyNames[toIndex]);
    }
}

