public class Main {
    public static void main(String[] args) {
        int ticketPriceInKopecks = 135000_00;
        int bonusMile = 2000_00;
        int amountOfBonusMiles = ticketPriceInKopecks / bonusMile;
        System.out.println(amountOfBonusMiles);
    }
}
