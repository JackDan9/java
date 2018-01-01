package StringTest;

/**
 * Created by JackDan9 on 2017/9/17.
 */
public class StringTest {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("abcdefghijk");
        sb.insert(3, "sb");
        sb.append("123");
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("");
//        StringBuffer sb1 = null;
        sb1.insert(0, "sb");
        sb1.append(sb);
        System.out.println(sb1);
    }
}
