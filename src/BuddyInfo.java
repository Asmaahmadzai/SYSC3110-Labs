public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo() {
        this("Default Name", "Default Address", "Default Phone Number");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Asma", "Carleton University", "819-823-6068");
        System.out.println("Hello " + buddy.getName());
    }
}