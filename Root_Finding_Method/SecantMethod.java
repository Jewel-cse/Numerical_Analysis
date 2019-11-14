
public class SecantMethod extends function{

	public static double secantMethod(double x0, double x1) {
		double x2=0 ,fx0,fx1;
		fx0 = f(x0);
		fx1 = f(x1);
		while (Math.abs(x1-x0) > 0.0001) {
			
			//calculate root 
			x2 = x1 - fx1*((x1-x0)/(fx1-fx0));
			//transfer value of function
			fx0= fx1;
			fx1= f(x2);
			//transfer value of initial guess
			x0 = x1;
			x1 = x2;  // this is the result 
		}
		return x1;
	}	
}
