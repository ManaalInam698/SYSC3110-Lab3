import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddy1){
        buddies.add(buddy1);
    }

    public void removeBuddy(BuddyInfo buddy1){
        buddies.remove(buddy1);
    }

    // Main method for testing the address book
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);


    }

}
