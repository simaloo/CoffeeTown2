
/**
 * A class that Shop and WareHouse will extend
 * as a controller for the vertex of the graph * 
 * @Trisha Agarwal
 * @04/29/2017-01
 */
import java.util.ArrayList;
public class Vertex
{
    // instance variables - replace the example below with your own

    //Location of the vertex
    Location location;

    //ID of the vertex
    int ID;

    //Edges of the vertex
    ArrayList<Edge> e;

    public Vertex(){
        e=new ArrayList<Edge>();
    }

    public void insertSorted(Edge edge)
    {
        if(e.size()<=0||edge.weight<e.get(0).weight)
            e.add(0,edge);

        int i;
        for( i=0;i<e.size();i++){
            if(edge.weight<e.get(i).weight)
                e.add(i,edge);

        }

        if(i==e.size())
            e.add(edge);
    }
}
