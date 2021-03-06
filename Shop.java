
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends Vertex
{
    //Instance variables for the Shop

    //ID of the shop
    //   private int ID;

    //Cargo that the shop needs
    private Cargo order;
    

    //Location of the shop
    //  private Location location;

    /**
     * Constructor for the Shop class that
     * initliases the Shop to a given location and Id.
     * It also intialises the Cargo object to null
     * @param int ID
     * @param int x coordinate
     * @param int y corrdinate
     */
    public Shop(int ID, int x, int y, Cargo o){

        this.ID=ID;
        location=new Location(x,y);
        order = o;
    }
}
