/**
 * 
 * Buyer
 * 
 */

public class Buyer extends Person {

    private double accountBalance; // a buyer cannot have no money (not going to buy anything)
                                   // so balance set to 0 if unknown, and translated in printDetails

    private double maxAuctionBid; // if never bid before, maxAuctionBid is set to 0 and translated in printDetails
    private double bid;
    private Item itemToBuy;

    public Buyer(String name, String address, int year, int month, int day, double accountBalance) {
        super(name, address, year, month, day);
        this.accountBalance = accountBalance;
        this.maxAuctionBid = 0;
    }
    public Buyer(String name, double accountBalance) {
        super(name);
        this.accountBalance = accountBalance;
        this.maxAuctionBid = 0;
    }

    public Buyer(String name) {
        super(name);
        this.accountBalance = 0;
        this.maxAuctionBid = 0;
    }

    public Buyer() {
        super();
        this.maxAuctionBid = 0;
        this.accountBalance = 0;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void decreaseBalance(double bid) {
        this.accountBalance = accountBalance - bid;
    }
    public double getMaxBid() {
        if(checkMaxBid()){
            return maxAuctionBid;
        }else{
            setMaxBid(getBid());
            return maxAuctionBid;
        }
    }

    public boolean canAffordBid(){
        if(getBid() <= getAccountBalance()){
            return true;
        }return false;
    }
    public void placeBid(double bid, Book item) {
        if(canAffordBid()){
            this.bid = bid;
            this.itemToBuy = item;
        }
    }

    public void placeBid(double bid, Jewellery item) {
        if(canAffordBid()){
            this.bid = bid;
            this.itemToBuy = item;
        }
    }

    public void placeBid(double bid, Artwork item) {
        if(canAffordBid()){
            this.bid = bid;
            this.itemToBuy = item;
        }
    }

    public double getBid() {
        return bid;
    }

    public void setMaxBid(double maxAuctionBid) {
            this.maxAuctionBid = maxAuctionBid;
    }

    public boolean checkMaxBid(){
        if(getBid() < maxAuctionBid){
            return true;
        }return false;
    }

    public void printDetails() {
        System.out.println("******Buyer Details******");
        super.printDetails();
        if (getMaxBid() != 0) {
            System.out.println("Max Bid in Auction: £" + getMaxBid());
        } else {
            System.out.println("Max Bid in Auction: " + super.getName() + " hasn't made a bid before.");
        }
        if (getAccountBalance() != 0) {
            System.out.println("Account Balance: £" + getAccountBalance());
        } else {
            System.out.println("Account Balance: unknown");
        }
        
    }
}