
/**
 * Write a description of class Warehouse here.
 * 
 * @author Simone Khalifa
 * @version 4.23.17
 */
public class Warehouse extends Vertex
{
  //  private Location location; //location of warehouse
   // int id; //idNumber
    Truck[] arrayOfTrucks; //number of trucks in warehouse

    /**
     * Constructor for objects of class Warehouse
     */
    public Warehouse(int idNumber,int x, int y, int numbTrucks) 
    {
        ID=idNumber;
        location=new Location(x,y);
        arrayOfTrucks = makeArray(numbTrucks);//calls method to set original location of each truck to location of warehouse
    }
    
    /**
     * Method to set currentLocation of each truck in warehouse array equal to location of warehouse
     */
    public Truck[] makeArray(int num) 
    {
        Truck[] array= new Truck[num]; //creates array
        for (int i=0;i<num; i++)
        {
            array[i]=new Truck(location);
        }
        return array;
    }
    
    public Location getLocation() //return location
    {
        return location;
    }
}
