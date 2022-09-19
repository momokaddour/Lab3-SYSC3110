import java.util.Hashtable;

public class AddressBook {

    Hashtable<String, String> addressBook;

    public AddressBook() {
        addressBook = new Hashtable<>();
    }

    public void addBuddy(String phoneNumber, String address)
    {
        addressBook.put(phoneNumber, address);
    }

    public void removeBuddy(String phoneNumber)
    {
        addressBook.remove(phoneNumber);
    }

    public static void main (String[] args){
        BuddyInfo BI1 = new BuddyInfo("Homer", "613-900-3455", "913 V");
        BuddyInfo BI2 = new BuddyInfo("John", "613-901-3455", "81 L");
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(BI1.phone_number, BI1.address);
        addressBook1.addBuddy(BI2.phone_number, BI2.address);
        addressBook1.removeBuddy(BI1.phone_number);
    }
}
