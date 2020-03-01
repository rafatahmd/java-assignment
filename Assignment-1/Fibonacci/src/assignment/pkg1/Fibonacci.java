package assignment.pkg1;


//This file is related to recursion.java 

public class Fibonacci {
    
    int fibonacci ( int num )
    {
        if ( num == 1 )
            return 0;
        else if ( num == 2 )
            return 1;
        else
            return fibonacci(num-1)+fibonacci(num-2); 
    }
}