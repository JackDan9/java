package HelloWorld;

public class StringAddPrimer {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        String str1 = "将数字的字符拼接到字符串中: " + a;
        String str2 = a + b + "加法是从左到右运算的";
        String str3 = "加法是从左到右运算的: " + a + b;
        String str4 = "可以使用括号改变运算顺序: " + (a+b);
        String str5 = "可以使用空字符将两个变量分隔开: " + a + " " + b;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
