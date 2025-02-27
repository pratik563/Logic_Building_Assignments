import java.util.Scanner;

class Twenty{
	public static void main(String args[]){

	// Que1

	//System.out.println("Hello");
	//System.out.println("Pratik");

	// Que2

	//int a = 74;
	//int b = 36;
	//System.out.println(a+b);

	// Que3
	/*
	int c = 50;
	int d = 3;
	System.out.println(c/d); */

	// Que4
	/*
	System.out.println(-5 + 8 * 6);
	System.out.println((55 + 9) % 9);
	System.out.println(20 + -3 * 5 / 8);
	System.out.println(5 + 15 / 3 * 2 - 8 % 3); */

	// Que5

	/*
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Input First Number: ");
	int num1 = scanner.nextInt();
	
	System.out.print("Input Second Number: ");
	int num2 = scanner.nextInt();

	System.out.print("Product of two Numbers are: " + (num1 * num2)); */

	// Que6

	/*
	Scanner scanner = new Scanner(System.in);

	System.out.print("Input First Number: ");
	int number1 = scanner.nextInt();

	System.out.print("Input Second Number: ");
	int number2 = scanner.nextInt();

	System.out.println("Addition: " + (number1 + number2));
	System.out.println("Subtraction: " + (number1 - number2)); 
	System.out.println("Multiplication: " + (number1 * number2));
	System.out.println("Division: " + (number1 / number2));
	System.out.println("Modulas: " + (number1 % number2)); */

	// Que7

	/*
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the Number: ");
	int nums1 = scanner.nextInt();

	System.out.println(nums1 * 2);
	System.out.println(nums1 * 3);
	System.out.println(nums1 * 4);
	System.out.println(nums1 * 5);
	System.out.println(nums1 * 6);
	System.out.println(nums1 * 7);
	System.out.println(nums1 * 8);
	System.out.println(nums1 * 9);
	System.out.println(nums1 * 10); */

	// Que8
	/*
	Scanner scanner = new Scanner(System.in);

	System.out.println("Input first number: ");
	int num1 = scanner.nextInt();

	System.out.println("Input second Number: ");
 	int num2 = scanner.nextInt();

	num2 = num2 - num1;
	num1 = num2 + num1;

	System.out.println("First Number: " + num1);
	System.out.println("Second Number: " + num2); */

	// Que9
	/*
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the Radius");
	int radius = scanner.nextInt();

	System.out.println("Area of a circle: " + 3.14 * (radius * radius) ); */

	// Que10

	/*
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the Number: ");
	int num = scanner.nextInt();

	if (num % 2 == 0) {
		System.out.println("Even Number");
	} else {
		System.out.println("Odd Number");
	}
	
	scanner.close(); */

	// Que11
	/*
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the First Number: ");
	int num1 = scanner.nextInt();

	System.out.println("Enter the Second Number: ");
	int num2 = scanner.nextInt();

	System.out.println("Enter the Third Number: ");
	int num3 = scanner.nextInt();	

	if (num1 >= num2 && num1 >= num3) {
		System.out.println("num1 is the largest number");
	} else if (num2 >= num1 && num2 >= num3) {
		System.out.println("num2 is the largest number");
	} else {
		System.out.println("num3 is the largest number");
	}
	scanner.close(); */


	// Que 12
	/*
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the Number: ");
	int num = scanner.nextInt();

	int reversed = 0;
	int original = num;

	while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit;  
            num /= 10;
        }

 
        System.out.println(reversed);

        scanner.close(); */

	// Que 13

	/*	

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the First Number: ");
	int num1 = scanner.nextInt();
	
	System.out.println("Enter the Second Number: ");
	int num2 = scanner.nextInt();

	System.out.println("Enter the Third Number: ");
	int num3 = scanner.nextInt();

	int total = num1 + num2 + num3;
	int nums = 3;

	int avg = total/nums;

	System.out.println("Average of given numbers are "+ avg);

	*/

	//Que14
	/*
	int first = 0, second = 1, num = 10;	

	System.out.print(first + " " + second + " ");

	for(int i = 0; i < num; i++) {
		int next = first + second;

		System.out.print(next + " ");
		first = second;
		second = next;
	} */

	// Que15
	/*
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the Number: ");
	int num = scanner.nextInt();
	
	int factorial = 1;

	for(int i = 1; i <= num; i++){
		factorial *= i;
	}
	System.out.print(factorial);
	*/


	//Que16
	/*
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the Number: ");
	int num = scanner.nextInt();

	if(num % 1 == 0 || num % num == 0){
		System.out.println(num + " is a prime Number");
	} else {
		System.out.println(num + " not a prime Number");
	} */


	// Que17

	/*
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the Number: ");
	int num = scanner.nextInt();

	for (int i = 1; i <= num; i++){
		System.out.print(i + " ");
	} */


	// Que18
	/*
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the Temp in Celcius: ");
	int celcius = scanner.nextInt();

	int fahrenheight = (celcius * 9/5) + 32;
	System.out.println(celcius + "°C is equal to" + fahrenheight); */

	//Que19

	/*
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the Base: ");
	int base = scanner.nextInt();

	System.out.print("Enter the Exponent: ");
	int expo = scanner.nextInt();
	
	double result = Math.pow(base, expo);

	System.out.println(result); */
    }
}


















