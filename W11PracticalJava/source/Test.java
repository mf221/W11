/**
 * 
 * Test
 * 
 */

public class Test {

    public static void main(String[] args) {

        Buyer Matt = new Buyer("Matt", "Dover 6 DRA", 1997, 9, 7,1000);
        Buyer Isaac = new Buyer("Isaac","Dover 6 DRA",2000,11,16,500);
        Buyer Jonno = new Buyer("Jonno");
        Author Mayumi = new Author("Mayumi");
        Artist VanGough = new Artist("Van Gough");
        Donor Jon = new Donor("Jon");
        Charity Oxfam = new Charity("Oxfam", "Helping homeless people.");
        Charity Cafod = new Charity("CAFOD", "Feeding the hungry");

        //Matt.printDetails();

        Artwork monaLisa = new Artwork("Mona Lisa", Oxfam);

        System.out.println();
        monaLisa.setArtist(VanGough);

        Jewellery necklace = new Jewellery("necklace", Cafod, "gold");
        necklace.setDonor(Jon); // all items have a donor so method defined in Item class
        necklace.setBuyer(Matt); // all items can have a buyer so method in Item class

        Book bible = new Book("the bible",200,250, Oxfam);
        Book lightningThief = new Book("Percy Jackson",100,110,Cafod);
        Book halfbloodPrince = new Book("Harry Potter", 50, 75, Cafod);

        bible.setAuthor(Mayumi); // only a book can have an author so this method is in book class
        bible.setDonor(Jon);
        Auction charityAuction = new Auction();

        
        charityAuction.addToItemList(monaLisa);
        charityAuction.addToItemList(bible);
        charityAuction.addToItemList(halfbloodPrince);
        charityAuction.addToItemList(lightningThief);
        charityAuction.addToItemList(necklace);

        charityAuction.printBooksForSale();
        
        Matt.placeBid(150., bible);
        charityAuction.receiveBid(Matt, bible);
        Jonno.placeBid(151., bible);
        charityAuction.receiveBid(Jonno, bible);
        Matt.placeBid(152., bible);
        charityAuction.receiveBid(Matt, bible);
        Isaac.placeBid(154., bible);
        charityAuction.receiveBid(Isaac, bible);
        Matt.placeBid(155., bible);
        charityAuction.receiveBid(Matt, bible);
        Isaac.placeBid(156., bible);
        charityAuction.receiveBid(Isaac, bible);
        Matt.placeBid(157, bible);
        charityAuction.receiveBid(Matt, bible);
        //Oxfam.printDetails();
        //Isaac.printDetails();
        Isaac.placeBid(251, bible);
        charityAuction.receiveBid(Isaac, bible);
        charityAuction.closeAuction();
        //Isaac.printDetails();
        // Matt.printDetails();
        //Oxfam.printDetails();
        //charityAuction.printDetails();
        charityAuction.printBooksForSale();
   
        

                

    }

}