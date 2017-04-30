
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
     int weight;
    
    //Constructor for the edge
    public Edge(Vertex start, Vertex end){
        
        this.start=start;
        this.end=end;
        weight=Math.abs(start.location.getX()-end.location.getX())+Math.abs(start.location.getY()-end.location.getY());
        
    }
    

}
