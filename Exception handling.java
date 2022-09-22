public class Main {
  public static void main(String[] args) {
    int a=20;
    int b =35;
    int c=0;
    try {
   int s=a+b;
      System.out.println("the sum  of a and b is " +s);
    } catch (Exception k) {
      System.out.println("invalid function is called");
    } 
    
     try {
   int d=a-c;
      System.out.println("the difference of  a and c is " +d);
    } catch (Exception k) {
      System.out.println("invalid function is called");
    } 
    
     try {
   int q=a/c;
      System.out.println("the sum of addition of a and b is " +q);
    } catch (Exception k) {
      System.out.println("invalid function is  called");
    } 
  }
}

/*
output 
the sum  of a and b is 55
the difference of  a and c is 20
invalid function is  called
*/
