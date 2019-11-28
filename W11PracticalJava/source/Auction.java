import java.util.ArrayList;

/**
 * 
 * Auction
 * 
 */

public class Auction {

    private double currentBid;
    private boolean isOpen = true;
    private final int MAX_NUMBER_OF_BIDS = 5;
    private final int MAX_NUMBER_OF_ITEMS = 10;
    private ArrayList<Item> itemList;
    private Item item;

    Buyer buyer = new Buyer();

    public Auction() {
        itemList = new ArrayList<Item>(); // using an array list means that as items are
                                          // bought/sold the size of the item list adapts
    }

    // items added to list if there are fewer than the max number of items

    public void addToItemList(Artwork item) {
        if (itemList.size() < MAX_NUMBER_OF_ITEMS) {
            itemList.add(item);
            item.updateStatus("for sale");
        }else{
            System.out.println("Maximum number of items already in auction.");
        }
    }

    public void addToItemList(Book item) {
        if (itemList.size() < MAX_NUMBER_OF_ITEMS) {
            itemList.add(item);
            item.updateStatus("for sale");
        }else{
            System.out.println("Maximum number of items already in auction.");
        }
    }

    public void addToItemList(Jewellery item) {
        if (itemList.size() < MAX_NUMBER_OF_ITEMS) {
            itemList.add(item);
            item.updateStatus("for sale");
        }else{
            System.out.println("Maximum number of items already in auction.");
        }
    }
    // checks that a bid is valid

    public boolean isBidValid(Buyer buyer, Item item){
        if(item.getNumberOfBids() < MAX_NUMBER_OF_BIDS && 
           buyer.getBid() >= item.getCurrentPrice()&&
           isOpen){
            return true;
        }return false;
    }

    //checks that the final bid is both greater than reserve and current bid 
    
    public boolean isBidSuccessful(Buyer buyer, Item item){
        if(item.getNumberOfBids() <= MAX_NUMBER_OF_BIDS && 
                buyer.getBid() >= item.getReserveValue()
                && buyer.getBid() == item.getCurrentPrice()
                && isOpen){
                    return true;
        }return false;
    }

    public void receiveBid(Buyer buyer, Item item){

        if(isBidValid(buyer,item)){ 
                currentBid = buyer.getBid();
                item.setCurrentPrice(currentBid);
                item.numberOfBids++;
              
        }
        if(isBidSuccessful(buyer,item) && item.getNumberOfBids() == MAX_NUMBER_OF_BIDS){

            // for the final successful bid. details of the buyer, charity, donor and item are updated.
            item.setBuyer(buyer);
            item.setFinalPrice(buyer.getBid());
            buyer.decreaseBalance(buyer.getBid());
            item.updateStatus("sold");
            item.getCharity().raiseBalance(buyer.getBid());
            item.getDonor().raiseBalance(buyer.getBid());
            itemList.remove(item);
        }
        //any items still unsold after 5 bids removed from auction.
        if(isBidValid(buyer,item) && buyer.getBid() < item.getReserveValue()){
            
            item.updateStatus("unsold");
            itemList.remove(item);
        }
        if(isBidSuccessful(buyer, item)&& !(closeAuction())){
            item.setBuyer(buyer);
            item.setFinalPrice(buyer.getBid());
            buyer.decreaseBalance(buyer.getBid());
            item.updateStatus("sold");
            item.getCharity().raiseBalance(buyer.getBid());
            item.getDonor().raiseBalance(buyer.getBid());
            itemList.remove(item);
        }
    }

    public boolean closeAuction(){
         isOpen = false;
        return isOpen;
    }

    public void printDetails() { // prints the current details of all items in the auction
        System.out.println("******Auction List******");
        System.out.println();
                for (Item item : itemList) {
            if(item instanceof Jewellery){
                this.item =(Jewellery)item;
                item.printDetails();
            }else if(item instanceof Book){
                this.item = (Book)item;
                item.printDetails();
            }else if(item instanceof Artwork){
                this.item = (Artwork)item;
                item.printDetails();
            }
            System.out.println();
        }
    }

    public void printBooksForSale(){
        for(Item book : itemList){
            if(book instanceof Book){
                book.printDetails();
            }else{
                System.out.println("There are currently no books in the auction.");
            }
        }
    }
}