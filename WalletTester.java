
/**
 * Write a description of class WalletTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalletTester {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        ATMCard atmCard = new ATMCard("John Doe", "1234567890", 1234);
        DriversLicense expiredLicense = new DriversLicense("Alice Smith", 2020);

        wallet.addCard(atmCard);
        wallet.addCard(expiredLicense);

        System.out.println(wallet.toString());
        System.out.println("Expired Card Count: " + wallet.getExpiredCardCount());
    }
}
