/**
 * Write a description of class Truck here.
 * 
 * @author Simone Khalifa
 * @version 4.23.17
 */
public class Truck
{
    private Path path; // path truck will take in delivery
    private boolean flag; //whether truck has been used or not--false if not used and true if used
    private Location originalLocation; //location of truck's warehouse (where the truck begins and ends path)
    private Location currentLocation; //current location of truck--changes when it reaches a shop

    /**
     * Constructor for objects of class Truck
     */
    public Truck(Location location)
    {
      flag=false;
      path=null;
      originalLocation=location;
      currentLocation=location;
    }
}
