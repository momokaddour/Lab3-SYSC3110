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
        System.out.println("Address Book");
    }
}
