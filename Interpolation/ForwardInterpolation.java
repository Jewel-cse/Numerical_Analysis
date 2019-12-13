
public class ForwardInterpolation {
	// calculate the value of p
	public static double p_calculation(double p,int n) {
		double temp = p;
		for (int i = 1;i<n;i++)
			temp *= p-i;
		return temp;
	}
	//calculate the value of factorial
	public static double fact(int n) {
		int f = 1;
		for (int i= 2;i<=n;i++)
			f *= i;
		return f;
	}
	//calculating the forward difference table
	public static void forward_table(double y[][],int n) {
		for (int i = 1;i<n;i++) {
			for (int j =0;j<n-i;j++)
				y[j][i] = y[j+1][i-1]-y[j][i-1] ;
		}
	}
	
	//printing forward table 
	public static void display_F_table(double x[],double y[][],int n) {
		for (int i = 0;i<n;i++) {
			System.out.print(x[i]+"\t");
			for(int j = 0;j<n;j++) 
				System.out.print(y[i][j]+"\t"); 
			System.out.println();	
		}
	}
	//calculating solution of forward difference method
	public static double solution(double value,double x[],double y[][],int n) {
		double sum = y[0][0];
		double p = (value - x[0])/(x[1]-x[0]);
		for (int i = 1;i<n;i++) {
			sum += p_calculation(p,i)*y[0][i]/fact(i);	
		}
		return sum ;
	}
	
	
}
