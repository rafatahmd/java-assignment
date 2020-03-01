/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public class Test2 {
    
    int height, width, length;
    
    Test2 ( int height, int width, int length ) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    
    Test2 ( Test2 obj ) {
        this.height = obj.height;
        this.width = obj.width;
        this.length = obj.length;
    }
    
    void Printlen( Test2 obj ) {
        System.out.println("");
        if ( this.height == obj.height )
            System.out.println("Heights are the same");
        if ( this.width == obj.width )
            System.out.println("Widths are the same");
        if ( this.length == obj.length )
            System.out.println("Lengths are the same");
    }
    
    void volume ( Test2 obj ) {
        System.out.println("Volume of 1st test Subject = " + this.height*this.width*this.length);
        System.out.println("Volume of 2nd test Subject = " + obj.height*obj.width*obj.length);
        if (this.height*this.width*this.length < obj.height*obj.width*obj.length)
            System.out.println("Volume of 1st Cube is less than 2nd Cube");    
        else if (this.height*this.width*this.length > obj.height*obj.width*obj.length)
            System.out.println("Volume of 1st Cube is greater than 2nd Cube"); 
        else 
            System.out.println("Volume of 1st Cube is equal to the 2nd Cube");
    }
}