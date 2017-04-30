
import java.util.*;
import java.io.*;
/**
 * Write a description of class Tow here.
 * 
 * @author Simone Khalifa
 * @version 4.29.17
 */
public class Town
{
    private Vertex[] shops; //array of shops
    private Vertex[] warehouses; //array of warehouses
    public static void main(){
        Town t=new Town();
        t.takeInShops();
        t.takeInWarehouses();
    }

    public void takeInShops()
    {
        Scanner in=null; //create input from file
        try
        {
            in = new Scanner(new FileReader("shops.txt")); //recieve file information
            String line = in.nextLine(); //saves line as a string
            shops = new Shop[Integer.parseInt(line)]; 
            int j=0;
            while (in.hasNextLine())//iterates through each line
            {
                line = in.nextLine(); //saves line as a string
                String[] splitLine=line.split("[(),: ]");
                int id = Integer.parseInt(splitLine[0]);
                int x = Integer.parseInt(splitLine[2]);
                int y = Integer.parseInt(splitLine[4]);
                Cargo order = new Cargo();
                for(int i=7;i<splitLine.length;i+=2)
                {
                    order.insert(Integer.parseInt(splitLine[i]));
                }
                System.out.println("ID: "+ id + ", x: " + x + ", y: " + y + ", order: " + order.toString());
                shops[j]=(new Shop(id, x, y, order)); //vertex: id, x, y, array of order
                j++;
            }
        }
        catch(Exception e){  //pg 58
            e.printStackTrace();
        }
        finally
        {
            if(in!=null)
            {
                in.close();
            }
        }
    }

    public void takeInWarehouses()
    {
        Scanner in=null; //create input from file
        try
        {
            in = new Scanner(new FileReader("warehouses.txt")); //recieve file information
            String line = in.nextLine(); //saves line as a string
            warehouses = new Warehouse[Integer.parseInt(line)]; 
            int j = 0;
            while (in.hasNextLine())//iterates through each line
            {
                line = in.nextLine(); //saves line as a string
                String[] splitLine=line.split("[(),: ]");
                int id = Integer.parseInt(splitLine[0]);
                int x = Integer.parseInt(splitLine[2]);
                int y = Integer.parseInt(splitLine[4]);
                int trucks = Integer.parseInt(splitLine[7]);
                System.out.println("ID: "+ id + ", x: " + x + ", y: " + y + ", # of trucks: " + trucks);
                warehouses[j] = (new Warehouse(id, x, y, trucks)); //vertex: id, x, y, array of order
                j++;
            }
        }
        catch(Exception e){  //pg 58
            e.printStackTrace();
        }
        finally
        {
            if(in!=null)
            {
                in.close();
            }
        }
    }

    public void addShopEdges()
    {
        for (int i = 0; i<shops.length; i++)
        {
            for (int j = i+1; j<shops.length; j++)
            {
                if (shops[i].location.getX()<50 && shops[i].location.getY()<50 && shops[j].location.getX()<50 && shops[j].location.getY()<50)
                {
                    shops[i].insertSorted(new Edge(shops[i], shops[j]));
                    shops[j].insertSorted(new Edge(shops[j], shops[i]));
                }
                if (shops[i].location.getX()>50 && shops[i].location.getY()>50 && shops[j].location.getX()>50 && shops[j].location.getY()>50)
                {
                    shops[i].insertSorted(new Edge(shops[i], shops[j]));
                    shops[j].insertSorted(new Edge(shops[j], shops[i]));
                }
                if (shops[i].location.getX()>50 && shops[i].location.getY()<50 && shops[j].location.getX()>50 && shops[j].location.getY()<50)
                {
                    shops[i].insertSorted(new Edge(shops[i], shops[j]));
                    shops[j].insertSorted(new Edge(shops[j], shops[i]));
                }
                if (shops[i].location.getX()<50 && shops[i].location.getY()>50 && shops[j].location.getX()<50 && shops[j].location.getY()>50)
                {
                    shops[i].insertSorted(new Edge(shops[i], shops[j]));
                    shops[j].insertSorted(new Edge(shops[j], shops[i]));
                }
            }
        }
    }
    
    public void addWarehouseEdges()
    {
        for (int i = 0; i<shops.length; i++)
        {
            for (int j = i+1; j<warehouses.length; j++)
            {
                if (shops[i].location.getX()<50 && shops[i].location.getY()<50 && warehouses[j].location.getX()<50 && warehouses[j].location.getY()<50)
                {
                    shops[i].insertSorted(new Edge(shops[i], warehouses[j]));
                    warehouses[j].insertSorted(new Edge(warehouses[j], shops[i]));
                }
                if (shops[i].location.getX()>50 && shops[i].location.getY()>50 && warehouses[j].location.getX()>50 && warehouses[j].location.getY()>50)
                {
                    shops[i].insertSorted(new Edge(shops[i], warehouses[j]));
                    warehouses[j].insertSorted(new Edge(shops[j], warehouses[i]));
                }
                if (shops[i].location.getX()>50 && shops[i].location.getY()<50 && warehouses[j].location.getX()>50 && warehouses[j].location.getY()<50)
                {
                    shops[i].insertSorted(new Edge(shops[i], warehouses[j]));
                    warehouses[j].insertSorted(new Edge(shops[j], warehouses[i]));
                }
                if (shops[i].location.getX()<50 && shops[i].location.getY()>50 && warehouses[j].location.getX()<50 && warehouses[j].location.getY()>50)
                {
                    shops[i].insertSorted(new Edge(shops[i], warehouses[j]));
                    warehouses[j].insertSorted(new Edge(shops[j], warehouses[i]));
                }
            }
        }
    }
}
