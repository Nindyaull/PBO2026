package quiz2_no3;

public class Main {
    public static void main(String[] args) {
        UserProfile profileCust = new UserProfile(1, "rachmaimoet", "Rachma", 10, "rachmah@mail.com", "kartupelajar.jpg");
        Customer customer = new Customer(profileCust);
        
        customer.logIn(1, 9876);
        customer.applyVerification("ktp.png");
        customer.profile.showDocuments();

        System.out.println("-------------------------------------------------------------------");

        // Membuat profil untuk Admin
        UserProfile profileAdmin = new UserProfile(100, "nindyacantik", "Atmin Nindya", 16, "ninzz@mail.com", "sk.pdf");
        Admin admin = new Admin(profileAdmin);

        admin.logIn(100, 34567);
        admin.retrieveComplain();
        admin.verifyUser(customer);
        admin.logOut();
    }
}
