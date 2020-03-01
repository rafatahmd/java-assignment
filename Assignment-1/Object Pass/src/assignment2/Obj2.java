/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;


public class Obj2 {
     public static void main(String[] args) {
        
        Test2 cube1 = new Test2(10, 10, 10);
        
        //Creating another cube as the same before
        Test2 cube2 = new Test2(cube1);
        Test2 cube3 = new Test2(20,20,10);
       
        //Passing objects to a method
       cube1.Printlen(cube2);
       cube1.volume(cube2); 
       
       cube1.Printlen(cube3);      
       cube1.volume(cube3);
    }
   
}
