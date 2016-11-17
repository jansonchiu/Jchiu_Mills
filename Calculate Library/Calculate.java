/**
 * 
 */

/**
  APCS1//Janson Chiu
//Period 1
//Date: 11/16/16
//Math Library
 *
 */
public class Calculate {
	public static int square(int number) { 	//The method returns the square of the value passed//
		return(number*number);
	}

	public static double cube(double number) { //This method returns the cube of the value passed//
		return(number*number*number);
	}
	
	public static double average(double number1, double number2) { // The method returns of the average of the two doubles passed//
		return((number1+number2)/2);
	}
	
	public static double average(double number1, double number2, double number3) { // This method would return the average of three doubles passed//
		return((number1+number2+number3)/3);
	}
	
	public static double toDegrees(double number) {//This method converts from Radians to Degrees //
		double pi= 3.14159;
		return((number*180)/pi);
	}
	
	public static double toRadians(double number) { //This method converts from degrees to Radians //
		double pi= 3.14159;
		return((number/180)*pi);
	}
	
	public static double discriminant(double number1, double number2, double number3) { // finds the discriminant of three doubles // 
		return((number2*number2)-(4*number1*number3));
	}
				
	public static String toImproperFrac(int a, int b, int c) { // This method converts mixed number into an improper fraction //
		int numerator = ((a*c)+b);
		String improperfrac = (numerator + "/" + c);
		return improperfrac;
	}
	
	public static String toMixedNum(int numerator, int denominator){ // This method converts an improper fraction into a mixed number //
		String mixedNumb;
		mixedNumb = (numerator/denominator) + "_" + (numerator%denominator) + "/" + (denominator);
		return mixedNumb;
	}
	
	public static String foil (int a, int b, int c, int d, String n){ // This method converts a binomial multiplication of the form (ax+d)(cx+d) into a polynomial //
		int secondDegree = a*c;
		int firstDegree = (a*d)+(b*c);
		int yInteger = (b*d);
		String polynomial = (secondDegree)+(n)+"^2 ";
		if 
		return((a*c)+"n^2"+ "+" +(((a*d)+(b*c)))+"n"+ "+"+(b*d));
		
	}
	
	public static boolean isDivisibleBy(int a, int b){ // This method determines whether or not one integer is evenly divisible by another integer //
	
		if (b == 0) {
			throw new IllegalArgumentException ("Cannot be divisible by 0");
		}		
		if(a%b == 0){ 
			return true;
		}else { 
			return false;
		}
	}
	
	public static double absValue(double a) { // This method returns the absolute value of the double passed //
		if (a > 0) {
			return a * (1.0);
		} else {
			return a * (-1.0);
		}
	}
	
	public static int max (int a,int b) { // This method returns the larger of the two integers passed //
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
				
	public static double max(double a, double b, double c){ // This method returns the largest numbers of three doubles //
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
	
	public static int min(int a, int b) { // This method returns the smaller of the two integers passed // 
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static double round2(double number1) { // This method rounds a double to 2 decimal places // 
		double a = (number1 + 0.005); 
		a = a*100.0; 
		a = (int)a;
		a = a / 100.0;
		return a; 
	}
	
	public static double exponent( double base, int power) { // This method raises a a double to a positive integer power // 
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

	public static int factorial (int n) { // This method returns the factorial of the value passed // 
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
		
	public static boolean isPrime (int a) { // This method determines whether the integer passed is a prime number//
		for(int i = 2; i < a;i++ ) {
			if(Calculate.isDivisibleBy(a,i) == true) {
				return false;
			}
		}
		return true;	
	}

	public static int gcf(int a, int b){ // This method finds the greatest common factor of two integers //
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
	
	public static double sqrt(double a) { // This method returns the square root of the double passed. 
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
	
	public static String quadForm(int a, int b, int c){ // This method uses the the quadratic formula to approximate the real roots // 
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