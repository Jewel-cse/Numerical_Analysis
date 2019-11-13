public class NewtonRapson extends function{
	public static double NewRapMethod(double x) {
		 double h = f(x) / d_f(x); 
	        while (Math.abs(h) >= .0001) 
	        { 
	            x = x - h; 
	            h = f(x) / d_f(x);
	        } 
	      
	 return x; 			//Math.round(x * 100.0) / 100.0;  for 2 decimal point
	}
}
