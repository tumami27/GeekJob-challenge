
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public abstract class Human {
    public abstract int open();
    abstract void setcard(ArrayList<Integer>cards2); 
    public abstract boolean checkSum();
    ArrayList<Integer>myCards=new ArrayList<Integer>();
    ArrayList<Integer>cards=new ArrayList<Integer>();
}