 


/**
 * Trisha description of class Edge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Edge
{
    // instance variables - replace the example below with your own
    //Start vertex of the edge
    private Vertex start;
    
    //End vertex of the edge
    private Vertex end;
    
    //Weight of the vertex which is the distance
    private int weight;
    
    //Constructor for the edge
    public Edge(Vertex start, Vertex end){
        int[] locationStart=start.location.getLocation();
        int[] locationEnd=end.location.getLocation();
        
        this.start=start;
        this.end=end;
        weight=Math.abs(locationStart[0]-locationEnd[0])+Math.abs(locationStart[1]-locationEnd[1]);
        
    }
    
    
}
