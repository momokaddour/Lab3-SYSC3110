public class BuddyInfo {

    public String name;
    public String phone_number;
    public String address;

    public BuddyInfo(String name, String phone_number, String address) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
    }

    public BuddyInfo(){
        this.name = "NA";
        this.phone_number = "NA";
        this.address = "NA";
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args)
    {
        BuddyInfo BI1 = new BuddyInfo("Homer", "613-900-3455", "913 V");
        System.out.println("Hello " + BI1.getName());

        //CHANGE CHANGE
    }
}
