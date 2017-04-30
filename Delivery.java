
/**
 * Write a description of class Delivery here.
 * This keeps track of the shop to which the truck
 * has to deliver and the amount
 * @Trisha Agarwal
 * @04/23/2017
 */
public class Delivery
{
    //Instance variable

    //The Shop to be visited
    private Shop s;

    //Amount being delivered to said shop
    private int amount;

    /**
     * Constructor for the delivery that
     * initliases the Shop and the amount that 
     * the truck is delivering at that location
     * @param Shop to be delivered at
     * @param int amount to the delivered
     */
    public Delivery(Shop s, int amount){

        this.s=s;
        this.amount=amount;
    }
    
    /**
     * A method that returns the Shop that is 
     * to be visited next
     * @return Shop
     */
    public Shop getShop(){
       return(s); 
    }
    
     /**
     * A method that returns the amout that is 
     * to be dropped off at the next Shop
     * @return int
     */
    public int getAmount(){
       return(amount); 
    }
}
