
/**
 * Keeps track of the location of the
 * object for which it is being used
 * 
 * @Trisha Agarwal 
 * @04/23/2017
 */
public class Location
{
    // instance variables 

    //X coordinate
    private int x;

    //Y coordinate
    private int y;

    /**
     * Constructor for objects of class Location
     * @param int x coordiante
     * @param int y coordinate
     */
    public Location(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX(){

        return x;

    }
    
    public int getY(){

        return y;

    }
}
