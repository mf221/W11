import java.util.ArrayList;
/**
 * Auction
 */
public class Auction {

    private double currentBid;
    private boolean isOpen;
    private int numberOfBids;
    private final int MAX_NUMBER_OF_BIDS = 5;
    private final int MAX_NUMBER_OF_ITEMS = 10;
    private static int nextIndex;
    private ArrayList<Item> itemList;

    Buyer buyer = new Buyer();

    public Auction(){
        itemList = new ArrayList<Item>(); // using an array list means that as items are 
                                          // bought/sold the size of the item list adapts
    }

    //items added to list if there are fewer than the max number of items
    
    public void addToItemList(Artwork item){
        if(itemList.size() < MAX_NUMBER_OF_ITEMS) {
            itemList.add(item);
        }
    }

    public void addToItemList(Book item){
        if(itemList.size() < MAX_NUMBER_OF_ITEMS){
            itemList.add(item);
        }
    }

    public void addToItemList(Jewellery item){
        if(itemList.size() < MAX_NUMBER_OF_ITEMS){
            itemList.add(item);
        }
    }

    public void printDetails(){ // prints the current details of all items in the auction
        
            for(Item item : itemList){
                item.printDetails();
                System.out.println();
            }
    }

}