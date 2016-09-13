/**
 * 
 */

/**
 * @author APCS1
 *
 */
public class Calculate {
	public static int square(int number) {
		return(number*number);
	}

	public static double cube(double number) {
		return(number*number*number);
	}
	
	public static double average(double number1, double number2) {
		return((number1+number2)/2);
	}
	
	public static double average(double number1, double number2, double number3) {
		return((number1+number2+number3)/3);
	}
	
	public static double toDegrees(double number) {
		double pi= 3.14159;
		return((number*180)/pi);
	}
	
	public static double toRadians(double number) {
		double pi= 3.14159;
		return((number/180)*pi);
	}
	
	public static double discriminant(double number1, double number2, double number3) {
		return((number2*number2)-(4*number1*number3));
	}
				
	public static int toImproperFrac(int a, int b, int c) {
		int numerator = ((a*c)+b);
		String improperfrac = (numerator + "/" + c);
		return improperfrac;
	}
	
	public static String toMixedNum(int number1, int number2){
		return("\"" + number1/number2 + "_" + number1%number2 + "/" + number2);
	}
	
	/*public static String foil (int a, int b, int c, int d, String e){
		System.out.println();
		return((a*c*n*n)+(a*d*n)+(b*c*n)+(b*c));
	}
	*/
	
	public static boolean isDivisibleBy(int a, int b){
		int number1 = (a/b);
		int number2= (b/a);
		int newnumber = (number1+number2); 
		
	if(newnumber == 0){ 
			return true;
		}else { 
			return false;
			}
	}
	public static double absValue(double a) {
		if (a > 0) {
			return a * (1.0);
		} else {
			return a * (-1.0);
		}
	}
	
	public static int max (int a,int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
				
	public static double max(double a,double b, double c) {
		if (a>b) { 
			return a;
		}
		else
		{
			return b; 
		}
	}
		
	public static int min(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static double round2(double number1) {
		double a = (number1 + 0.005); 
		a = a*100.0; 
		a = (int)a;
		a = a / 100.0;
		return a; 
	}
	
	public static double exponent( double base, int power) {
			double answer= 1;
				answer = answer*base;
				for (int i=1;i<= power;i++); {
					return ( answer );
				}
	}

	public static int factorial (int n) {
		int product=1;
		for(int i = n; i >1; i--){
			product = product*i;
		}
		return product;
	}
		
	public static boolean isPrime (int a) {
		for(int i = 2; a < i;i++ ) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;	
	}

	public static int gcf(int a, int b) {
		int smallnum = Calculate.min(a, b);
		int bignum = Calculate.max(a,b);
		int cf = smallnum;
		if(Calculate.isDivisibleBy(bignum,cf)) {
			return cf;
		} 
		cf = cf-1;
		while(cf > 1) {
			if(Calculate.isDivisibleBy(smallnum,cf)) {
				if(Calculate.isDivisibleBy(bignum, cf))
					return cf;
			} 
			cf--;	
		}
		return 1;
	}
}	
	/*public static double sqrt(double a); 
		for
	*/
	