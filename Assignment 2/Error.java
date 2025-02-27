// Que 1

/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
*/

// class Main is public, should be declared in a file named Main.java
// class Main was public
// static was missing


//////////////////////////////////////////


// Que 2

/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} */


// public was missing
// class Main is public, should be declared in a file named Main.java


//////////////////////////////////////////


// Que 3

/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!");  
 } 
} 
*/

// Removed int and replaced with void
// incompatible types: unexpected return value return 0;
// Removed return 0;

/////////////////////////////////////////

// Que 4

/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
*/

// (String[] args) : method is used to pass command-line arguments to the program, allowing for flexible input and customization.
// String[] args was missing


// Que 5
/*

class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 
*/

// Yes we can have multiple "main" methods by overloading them.


// Que6

/*
class Main { 
 public static void main(String[] args) { 
 int y = 10;
 int x = y + 10; 
 System.out.println(x); 
 } 
}
*/

// We have to initialized and decalred the variable before using it.


// Que7

/*
class Main { 
 public static void main(String[] args) { 
 String x = "Hello"; 
 System.out.println(x); 
 } 
}
*/

// incompatible types: String cannot be converted to int


// Que8

/*
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!");
 } 
} 
*/

//  error: ')' expected , ; expected


// Que9

/*
class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 
*/

// Can't use reserved keywords as they create confusion for the compiler or interpreter.


// Que10

class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
}

// non-static method display() cannot be referenced from a static context







