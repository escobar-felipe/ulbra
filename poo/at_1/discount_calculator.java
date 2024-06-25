import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre valor do produto ");
        double price = scanner.nextDouble();
        System.out.println("Entre com a % do desconto ");
        double discount_rate = scanner.nextDouble();

        double discount = price * (discount_rate / 100);
        double final_price = price - discount;

        System.out.println("Desconto:" + discount);
        System.out.println("Valor final:" + final_price);
        scanner.close();
    }
}
