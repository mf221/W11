/**
 * Book
 */
public class Book extends Item{

    private int edition;
    private Author author;

    public Book(){
        super();
        this.edition = 0;
        this.author  = null;
    }

    public Book(String name){
        super(name);
        this.edition = 0;
        this.author  = null;
    }

    public Book(String name, int edition, Author author){
        super(name);
        this.edition = edition;
        this.author  = author;
    }

    public Book(String name, int edition){
        super(name);
        this.edition = edition;
        this.author  = null;
    }


    public Book(String name, Author author){
        super(name);
        this.edition = 0;
        this.author  = author;
    }

    public Book(String name, double startPrice, double reserveValue,
    String status, Donor donor, Buyer buyer, int edition, Author author){
        super(name,startPrice,reserveValue,status,donor,buyer);
        this.edition = edition;
        this.author  = author;
    }


    public Book(String name, double startPrice, double reserveValue,
    String status, Donor donor, Buyer buyer){
        super(name,startPrice,reserveValue,status,donor,buyer);
        this.edition = 0;
        this.author  = null;
    }

    public Book(String name, double startPrice, double reserveValue){
        super(name,startPrice,reserveValue);
        this.edition = 0;
        this.author  = null;
    }

    public Book(String name, double startPrice, double reserveValue,
                int edition, Author author){
        super(name,startPrice,reserveValue);
        this.edition = edition;
        this.author  = author;
    }

    public Book(String name, double startPrice, double reserveValue,
                int edition){
        super(name,startPrice,reserveValue);
        this.edition = edition;
        this.author  = null;
    }

    public Book(String name, double startPrice, double reserveValue,
                Author author){
        super(name,startPrice,reserveValue);
        this.edition = 0;
        this.author  = author;
    }

    public int getEdition(){
        return edition;
    }

    public void setAuthor(Person person){
        if(person instanceof Author){
            this.author = (Author)person;
        }
    }

    public Author getAuthor(){
        return author;
    }

    public void printDetails(){
        super.printDetails();
        if(edition !=0){
            System.out.println("Edition: " + getEdition());
        }else{
            System.out.println("Edition: unknown.");
        }
        if(getAuthor() != null){
            System.out.println("Author:"   +getAuthor().getName());
        }else{
            System.out.println("Author: unknown");
        }
    }
}