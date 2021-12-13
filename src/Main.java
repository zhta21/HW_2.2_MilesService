public class Main {
    public static void main(String[] args) {
        int ticketPrice = 11_111;
        int oneBonusMile = 20;
        int bonusMiles = ticketPrice / oneBonusMile;
        System.out.println("Будет начислено бонусных миль: " + bonusMiles);
    }
}