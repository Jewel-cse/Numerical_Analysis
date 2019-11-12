
public class Bisection extends function {

	public static double bisectionMethod(double f_of_a, double f_of_b,double a, double b) { // Does the actual work of evaluating
		double c; // the root using the method of bisection.
		double f_of_c;
		final double TOLERANCE = 0.0001;
		while (Math.abs(a - b) > TOLERANCE) {
			c = (a + b) / 2;
			f_of_c = f(c);
			if (f_of_c * f(a) == 0 || f_of_c * f(b) == 0) {
				return c;
			} else if (f_of_c * f(a) > 0) {
				a = c;
			} else {
				b = c;
			}
		}
		return (a + b) / 2;
	}
}