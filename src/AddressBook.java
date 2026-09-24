import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> buddies;
    public AddressBook() {
        buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Asma", "Carleton University", "819-823-6068");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}