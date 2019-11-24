/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Person Matt = new Buyer("Matt", "Dover 6 DRA", 1997, 9, 7);
        Person Mayumi = new Author("Mayumi");
        Person John = new Donor("John");
        
        Matt.printDetails();

        Item watch = new Item("watch", 150, 300);
        System.out.println();
        watch.printDetails();
        System.out.println();

        Item vase = new Item("vase");
        vase.setDonor(John);
        System.out.println();
        vase.printDetails();
        System.out.println();

        Jewellery necklace = new Jewellery("necklace","gold");
        necklace.setDonor(John);
        necklace.setBuyer(Matt);
        necklace.printDetails();
        System.out.println();

        Bible bible = new Book("the bible", 1);
        bible.setAuthor(Mayumi);
        bible.setDonor(John);
        bible.printDetails();
        System.out.println();
    }
}