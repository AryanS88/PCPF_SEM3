// Java Program to Illustrate Static Binding

// Main class
class Racing {

// Static nested inner class
// Class 1
public static class Ferrari {

// Method of inner class
static void Schumacher()
{

// Print statement
System.out.println(
"Schumacher() is called in Ferrari ");
}
}

// Static nested inner class
// Class 2
public static class Formula1 extends Ferrari {

// Method of inner class
static void Schumacher()
{

// print statement
System.out.println(
"Schumacher() is called in Formula1");
}
}

// Method of main class
// Main driver method
public static void main(String[] args)
{

// Creating objects of static inner classes
// inside main() method
Ferrari A = new Ferrari();
Formula1 B = new Formula1();

// Calling method over above objects
A.Schumacher();
B.Schumacher();
}
}
//output
//Schumacher() is called in Ferrari Schumacher() is called in Formula1
