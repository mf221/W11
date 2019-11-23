/**
 * Donor
 */
public class Donor extends Person {

    private double moneyRaised;

    public Donor(String name, String address, int year, int month, int day, double moneyRaised){
        super(name, address, year, month, day);
        this.moneyRaised = moneyRaised;
    }

    public Donor(String name, String address, int year, int month, int day){
        super(name, address, year, month, day);
        this.moneyRaised = 0;
    }

    public Donor(String name, double moneyRaised){
        super(name);
        this.moneyRaised = moneyRaised;
    }

    public Donor(String name){
        super(name);
        this.moneyRaised = 0;
    }

    public Donor(){
        super();
        this.moneyRaised = 0;
    }

    public double getmoneyRaised(){
        return moneyRaised;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Money Raised: " + getmoneyRaised());

    }
    
}