package HelloWorld;

public class PriceAndAmountAndIfElse {
    public static void main(String[] args) {
        int price = -5;
        int amount = -10;
        if(price > 0 && amount > 0) {
            int totalCost = price * amount;
            System.out.println(totalCost);
        } else {
            System.out.println("price和amount的值都必须大于0, 否则无法计算totalCost");
        }
    }
}
