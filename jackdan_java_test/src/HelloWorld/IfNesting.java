package HelloWorld;

public class IfNesting {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        if(a > 0) {
            if(b > a) {
                System.out.println("a的值大于0");
                System.out.println("b的值大于a");
            }
        }
    }
}
