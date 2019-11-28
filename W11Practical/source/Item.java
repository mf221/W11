/**
 * Item
 */
public abstract class Item {

    protected static int code;
    protected int itemCode;
    protected double startPrice;
    protected double finalPrice;
    protected double reserveValue;
    protected String status;
    protected String name;
    protected Donor donor;
    protected Buyer buyer;
    protected Person person;
    protected Charity charity;

    private static int genItemCode(){
        code++;
        return code;
    }

    public Item(){
        this.itemCode = code;
        this.startPrice = 0;
        this.finalPrice = 0;
        this.reserveValue = 250;
        this.status = "unsold";
        this.name   = "unknown";
        this.donor  = null;
        this.buyer  = null;
        this.charity = null;  
    }

    public Item(String name, double startPrice, double reserveValue,
                String status, Donor donor, Buyer buyer, Charity charity){
        this();
        this.name = name;
        this.startPrice = startPrice;
        this.reserveValue = reserveValue;
        this.status = status;
        this.donor = donor;
        this.buyer = buyer;
        this.charity = charity; 
    }

    public Item(String name, Charity charity){
        this();
        this.name = name;
        this.charity = charity;
    }

    public Item(String name, double startPrice){
        this();
        this.name = name;
        this.startPrice = startPrice;
    }

    public Item(String name, double startPrice, double reserveValue){
        this();
        this.name = name;
        this.startPrice   = startPrice;
        this.reserveValue = reserveValue;
    }

    public void printDetails(){
        System.out.println("Item Code: "   + genItemCode());
        System.out.println("Item: "        + getName());
        if(getCharity() != null){
            System.out.println("Benefitting Charity: " + getCharity().getName());
        }else{
            System.out.println("Benefitting Charity: hasn't been assigned.");
        }
        System.out.println("Start Price: £"+ getStartPrice());
        System.out.println("Final Price: £"+ getFinalPrice());
        System.out.println("Status: "      + getStatus());
        System.out.println("Reserve: £"    + getReserveValue());
        if(donor != null){
            System.out.println("Donor: "       + getDonor().getName());
        }else{
            System.out.println("Donor: hasn't been assigned.");
        }
        if(buyer != null){
            System.out.println("Buyer: "       + getBuyer().getName());
        }else{
            System.out.println("Buyer: currently, the " + getName() + " hasn't been bought.");
        }

    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getReserveValue() {
        return reserveValue;
    }

    public void setReserveValue(double reserveValue) {
        this.reserveValue = reserveValue;
    }

    public String getStatus() {
        return status;
    }

    public String updateStatus(String status) {
        this.status = status;
        return status;
    }

    public String getName() {
        return name;
    }

    public Donor getDonor() {
        return donor;
    }

    public Charity getCharity(){
        return charity;
    }

    // checks that the person is a donor and casts this person as the donor 

    public void setDonor(Person person) {
        if(person instanceof Donor){
            this.donor = (Donor)person;
        }
    }

    public void setBuyer(Person person) {
        if(person instanceof Buyer){
            this.buyer = (Buyer)person;
        }
    }

    public Buyer getBuyer() {
        return buyer;
    }


}