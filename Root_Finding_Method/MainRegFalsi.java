public class MainRegFalsi extends RegularFalsi {
	public static void main(String[] args) {
		double a, b; // a, b and c have the usual meaning
		double f_of_a, f_of_b; // f_of_a, f_of_b store values of f(a) and f(b)
		do {
			a = Math.random()*100;
			b = Math.random()*100;
			if (f(a) * f(b) >= 0) {
				System.out.println("failed :[ "+a+" ,"+b+"]");
			}
		} while (f(a) * f(b) >= 0);
		f_of_a = f(a);
		f_of_b = f(b);
		double root = regFalsiMethod(f_of_a, f_of_b, a,
				b);
		System.out.println("\n\nSuccesfuly Find A Root  !!!!");
		System.out.println("The Section is : ["+a+" , "+b+"]");
		System.out.println("And The Root is : " + root);
	}
}