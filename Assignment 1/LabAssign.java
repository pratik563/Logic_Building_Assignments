class labassign{
	public static void main(String args[]){
	
	// Check Positive Number

	int a = 50;
	
	if(a >= 0){
		System.out.println("Positive Number");
	} else {
		System.out.println("Negative Number");
	}

	// Check Negative Number

	int b = -344;

	if (b < 0){
		System.out.println("Negative Number");
	} else {
		System.out.println("Positive Number");
	}

	// Check Odd or Even Number

	int c = 10;
	
	if (c % 2 == 0){
		System.out.println("Even Number");
	} else {
		System.out.println("Odd Number");
	}

	//  Display Good Morning Message Based on Time

	int Time = 10; // Predefined hour of the day (24-hour format)

	if (Time >= 5 && Time <= 12){
		System.out.println("Good Morning");
	} else {
		System.out.println("Not a Good Morning");
	}

	//  Area of a Square

	int side = 12; // length of side in centimeter

	int areaOfSquare = side * side;

	System.out.println(areaOfSquare);
	
	// Area of a Rectangle

	int length = 14;
	int width = 20;

	int areaOfRectangle = length * width;

	System.out.println(areaOfRectangle);

	// Find the Largest of Three Numbers:

	int x = 10;
	int y = 20;
	int z = 30;

	if(x >= y && x >= z){
		System.out.println("X is the Greatest");
	} else if (y >= x && y >= z){
		System.out.println("Y is the Greatest");
	} else {
		System.out.println("Z is the Greatest");
	}	

	}	
}