public class MainSecant extends SecantMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,root=0;
		int control = 1;
		
		do {
			a = Math.random()*(-10);
			b = Math.random()*(10);
			if(f(a)*f(b)<0){
				root = secantMethod(a, b);
				control = 0;
			}
		}while(control==1);
		System.out.printf("The root using secant method is : "+root);	
	}
}
