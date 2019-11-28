/**
 * Charity
 */
public class Charity {

    private String name;
    private String mission;
    private double balance;


    public Charity(String name, String mission){
        this.name = name;
        this.mission = mission;
        this.balance = 0; // as balance only reflects what has been raised, so initially 0.
    }

    public String getName() {
        return name;
    }

    public String getMission() {
        return mission;
    }

    public double getBalance() {
        return balance;
    }

    public void printDetails(){
        System.out.println("Charity Name: " + getName());
        System.out.println("Charity Mission: " + getMission());
        System.out.println("Charity Balance: £" + getBalance());
    }

    
}