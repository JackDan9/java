public class BooleanEqual {
	public static void main(String[] args) {
		boolean valueA = true;
		boolean valueB = true;
		boolean valueC = false;
		boolean value = (valueA == valueB);
		System.out.println(value);
		value = (valueA == valueC);
		System.out.println(value);
	}
}