public class CompareUsingSub {
	public static void main(String[] args) {
		double a = 9 * 3.1415926 / 7.56789 * 1.145926;
		double b = 9 * 3.1415926 / 7.56789 * 1.145926;
		boolean equal = ((a - b) < 0.0000000001 || (b - a) < 0.0000000001);
		System.out.println(equal);
	}
}