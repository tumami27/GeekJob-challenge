
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class Person {
    public String name="松本";
    public int age=25;
    
public void setHuman(String a,int b){
    name=a;
    age=b;
}   
   public void print(PrintWriter out){
       out.print(name);
       out.print(age);
   }
           
}
 