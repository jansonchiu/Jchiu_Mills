/**
 * 
 */

/**
  APCS1//Janson Chiu
//Period 1
//Due: 9/24/16
//Math Library
 *
 */
public class Calculate {
	public static int square(int number) { 	//The method returns the square of the value passed//
		return(number*number);
	}

	public static double cube(double number) { //returns the cube of the value passed//
		return(number*number*number);
	}
	
	public static double average(double number1, double number2) { // The method returns of the average of the two doubles passed//
		return((number1+number2)/2);
	}
	
	public static double average(double number1, double number2, double number3) { // This method would return the average of three doubles passed//
		return((number1+number2+number3)/3);
	}
	
	public static double toDegrees(double number) {//This method converts from Radians to Degrees//
		double pi= 3.14159;
		return((number*180)/pi);
	}
	
	public static double toRadians(double number) { //This method converts degrees to 
		double pi= 3.14159;
		return((number/180)*pi);
	}
	
	public static double discriminant(double number1, double number2, double number3) {
		return((number2*number2)-(4*number1*number3));
	}
				
	public static String toImproperFrac(int a, int b, int c) {
		int numerator = ((a*c)+b);
		String improperfrac = (numerator + "/" + c);
		return improperfrac;
	}
	
	public static String toMixedNum(int number1, int number2){
		return(number1/number2 + "_" + number1%number2 + "/" + number2);
	}
	
	public static String foil (int a, int b, int c, int d, String n){
		return((a*c)+"n^2"+ "+" +(((a*d)+(b*c)))+"n"+ "+"+(b*d));
	}
	
	public static boolean isDivisibleBy(int a, int b){
	
		if (b == 0) {
			throw new IllegalArgumentException ("Cannot be divisible by 0");
		}		
		if(a%b == 0){ 
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
				
	public static double max(double a, double b, double c){
		  if(a>b && b>c){
			  return a;
		  }

		  else if(a>b && b>c){
			  return b;
		  }
		  else{
			  return c;
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
		if (power<0) {
			throw new IllegalArgumentException ("Cannot be raised a number to the negative power");
		}
			if (power == 0) {
				return 1;
			}
			if (power == 1) {
				return base;
			}
			double previous = base;
			while (power > 1) {
				previous = previous * base;
				power--;
			}
			return previous;
		}

	public static int factorial (int n) {
		if (n<0) {
			throw new IllegalArgumentException ("Cannot get the factorial"
					+ " of a negative number");
		}
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

	public static int gcf(int a, int b){
		int gcf = 1;
		if(a > b){
			for(int i = b; i >= 1; i--){
				if(a % i == 0 && b % i == 0){
					return i;
				}
			}
		} else {
			for(int j = a; j >=1; j--){
				if(a % j == 0 && b % j == 0){
					return j;
				}
			}
		}
		return gcf;
	}
	
	public static double sqrt(double a) {
		if (a<0) {
			throw new IllegalArgumentException ("Cannot square root a negative number");
		}
		
		a = Calculate.round2(a);
			double t;
			double squareRoot = a / 2.0;
			do {
				t = squareRoot;
				squareRoot = (t + (a / t)) / 2;
			} while ((t - squareRoot) != 0);
		 
			return squareRoot;
			
	}
	
	public static String quadForm(int a, int b, int c){
		double rootone;
		double roottwo;
		double discriminant = Calculate.discriminant(a, b, c);
		if (discriminant < 0){
			return "no real roots";
		}
		else if (discriminant == 0){
			rootone = ((-b + discriminant)/(2*a));
			return "Root = " + rootone;
		}
		else {
			rootone = Calculate.round2((-b - discriminant)/(2*a));
			roottwo = Calculate.round2((-b + discriminant)/(2*a));
			if(rootone>roottwo){
				return(roottwo+ " and "+ rootone);
			}
			else {
				return(rootone+ " and "+ roottwo);
			}
		}
	}
}