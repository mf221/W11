/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Person Matt = new Buyer("Matt", "Dover 6 DRA", 1997, 9, 7);
        Person Mayumi = new Author("Mayumi");
        Person VanGough = new Artist("Van Gough");
        Person Jon = new Donor("Jon");
        Charity Oxfam = new Charity("Oxfam", "Helping homeless people.");
        Charity Cafod = new Charity("CAFOD", "Feeding the hungry");
        
        Matt.printDetails();

        Artwork monaLisa = new Artwork("Mona Lisa", Oxfam);
        System.out.println();
        monaLisa.setArtist(VanGough);
        

        Jewellery necklace = new Jewellery("necklace", Cafod,"gold");
        necklace.setDonor(Jon); // all items have a donor so method defined in Item class
        necklace.setBuyer(Matt); // all items can have a buyer so method in Item class
        

        Book bible = new Book("the bible",Oxfam, 1);
        bible.setAuthor(Mayumi); // only a book can have an author so this method is in book class
        bible.setDonor(Jon);
        

        Auction charityAuction = new Auction();
        charityAuction.addToItemList(monaLisa);
        charityAuction.addToItemList(bible);
        charityAuction.addToItemList(necklace);
        charityAuction.printDetails();

        Matt.placeBid(250.,bible);
    }
}