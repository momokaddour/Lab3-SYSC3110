import java.util.ArrayList;
import java.util.Hashtable;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo addBuddy)
    {
        if (addBuddy != null) {
            myBuddies.add(addBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index)
    {
        if (index >= 0 && index < myBuddies.size()) {
            myBuddies.remove(index);
        }

        return null;
    }

    public static void main (String[] args){
        BuddyInfo BI1 = new BuddyInfo("Tom", "613", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(BI1);
        addressBook.removeBuddy(0);
        addressBook.addBuddy(BI1);
        addressBook.removeBuddy(0);
        //CHANGE
    }
}
