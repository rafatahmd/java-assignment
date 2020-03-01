
package assignment.pkg1;


public class Recursion {
    
    public static void main(String[] args) {
        
        Fibonacci fib = new Fibonacci();
        
        System.out.println(" The Fibonacci Series Is : ");
        
        for ( int i = 1; i <= 40; i++ )
        {
            System.out.println(fib.fibonacci(i));
        }
    }
}