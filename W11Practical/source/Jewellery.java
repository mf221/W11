/**
 * Jewellery
 */
public class Jewellery extends Item{

    private String type;
    private String description;
    private String composition;

    public Jewellery(){
        super();
        this.description = "unknown";
        this.composition = "unknown";
    }

    public Jewellery(String name){
        super(name);
        this.description = "unknown";
        this.composition = "unknown";
    }

    public Jewellery(String name, String composition){
        super(name);
        this.description = "unknown";
        this.composition = composition;
    }

    public Jewellery(String name, double startPrice, double reserveValue,
                     String status, Donor donor, Buyer buyer){
        super(name,startPrice,reserveValue,status,donor,buyer);
        this.description = "unknown";
        this.composition = "unknown";
    }

    
    public Jewellery(String name, double startPrice, double reserveValue,String status, 
                     Donor donor, Buyer buyer, String composition){
        super(name,startPrice,reserveValue,status,donor,buyer);
        this.description = "unknown";
        this.composition = composition;
    }

    public Jewellery(String name, double startPrice, double reserveValue){
        super(name, startPrice, reserveValue);
    }

    //description is set separate to the constructor, as this could be quite
    //long and inconvenient in a constructor

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getComposition(){
        return composition;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Description: " + getDescription());
        System.out.println("Composition: " + getComposition());
    }
}