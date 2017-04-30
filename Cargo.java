
/**
 * A class that keeps track of the
 * cargo that a shop has ordered
 * 
 * @Trisha Agarwal
 * @04/23/2017
 */

import java.util.ArrayList;
public class Cargo
{
    // instance variables
    //Linked list of different items required
    private ArrayList<Integer> quantities;

    /**
     * Constructor for objects of class Cargo
     * that creates the ArrayList for the different
     * quantities of items
     */
    public Cargo()
    {
        quantities=new ArrayList<Integer>();
    }

    /**
     * A method that inserts the amount of 
     * cargo of a certain kind required by the coffee shop.
     * It returns true if successful, false otherwise
     * @param int weight of cargo
     * @return boolean
     */
    public boolean insert(int amount){

        return( quantities.add(amount)); 
    }
    
    /**
     * A method that finds the smallest 
     */
}
