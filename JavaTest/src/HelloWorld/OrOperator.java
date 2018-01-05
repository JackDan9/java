public class OrOperator {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		boolean c = true;
		boolean value = false;
		value = a | b;
		System.out.println(value);
		value = a | c;
		System.out.println(value);
	}
}