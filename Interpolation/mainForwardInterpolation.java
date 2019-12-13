import java.util.Scanner;
public class mainForwardInterpolation extends ForwardInterpolation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of value :");
		int n = sc.nextInt();
		final double x[] = new double[n];
		final double y[][] = new double[n][n];
		
		//take your problem
		for (int i = 0;i<n;i++) {
			System.out.print("enter x :");
			x[i] = sc.nextDouble();
			System.out.print("enter f(x) :");
			y[i][0] = sc.nextDouble();
		}
		//take interpolation value 
		System.out.print("Take interpolation value : ");
		double value = sc.nextDouble();
		forward_table(y,n);
		//display_F_table( x,y, n);
		System.out.println("Value at "+value+"is : "+solution(value,x,y,n));
	
		sc.close();
	}

}
