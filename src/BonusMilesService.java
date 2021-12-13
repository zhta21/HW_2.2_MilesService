public class BonusMilesService {
    public int calculate(int ticketPrice, int oneBonusMile) {
        int bonusMiles = ticketPrice / oneBonusMile;
        return bonusMiles;
    }
}
