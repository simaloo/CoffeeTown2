

/**
 * A class that Shop and WareHouse will extend
 * as a controller for the vertex of the graph * 
 * @Trisha Agarwal
 * @04/29/2017-01
 */
import java.util.*;
public class Vertex
{
    // instance variables - replace the example below with your own

    //Location of the vertex
    Location location;

    //ID of the vertex
    int ID;

    //Edges of the vertex
    ArrayList<Edge> e;

    /**
     * Constructor for Edges
     */
    public Vertex(){

        e=new ArrayList<Edge>();

    }

}
