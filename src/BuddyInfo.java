public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(){
        this("N/a", "123 hogwarts", 613123123);
    }

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        BuddyInfo k1 = new BuddyInfo("Kounoz", "446 hogwarts", 613123123);
        System.out.println("Hello " + k1.getName());

        System.out.println("Hello World");
    }


}
