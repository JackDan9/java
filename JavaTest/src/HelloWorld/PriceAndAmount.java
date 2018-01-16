package HelloWorld;

public class PriceAndAmount {
    public static void main(String[] args) {
        int price = -5;
        int amount = -10;
        if(price > 0 && amount > 0) {
            int totalCost = price * amount;
            System.out.println(totalCost);
        }
    }
}
