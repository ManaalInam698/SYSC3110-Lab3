import java.util.ArrayList;

public class AddressBook {
    BuddyInfo buddy1 = new BuddyInfo();

    ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();


    public void addBuddy(BuddyInfo buddy1){
        buddies.add(this.buddy1);




    }

    public void removeBuddy(BuddyInfo buddy1){
        buddies.remove(this.buddy1);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);


    }

}
