/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 private double x,y;
 private double total;
 
    public enum Value{PLUS,MINUS,TIMES,DIVIDE};
 
    public double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: "
                + "1.PLUS"
                + "2.MINUS"
                + "3.TIMES"
                + "4.DIVIDE");
        String s= sc.next();
        
        
        if(s==Value.PLUS.toString()){
            return total = x+y;
        }
         if(s==Value.MINUS.toString()){
           return total = x-y;
        }
         if(s==Value.TIMES.toString()){
            return total = x*y;
        }
         if(s==Value.DIVIDE.toString()){
           return total = x/y;
        }
//        Value[] operations = Value.values();
//         for(Value v : operations){
//             if(v.toString().equals(s))
           
             
         
                 
       
            
        
             
         
        
         return total;
        }
   
}
