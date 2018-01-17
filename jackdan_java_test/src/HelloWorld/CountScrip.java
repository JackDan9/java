package HelloWorld;

public class CountScrip {
    public static void main(String[] args) {
        int totalCost = 350;
        if(totalCost < 100) {
            System.out.println("购物金额不足100元, 不赠送抵价卷!");
        } else {
            if(totalCost <= 500) {
                System.out.println("购物金额满100元, 赠送55元抵价卷!");
            } else {
                System.out.println("购物金额满500元, 赠送155元抵价卷!");
            }
        }
    }
}
