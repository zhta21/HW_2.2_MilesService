public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculate(11_111,20);
        System.out.println("Будет начислено бонусных миль: " + bonusMiles);
    }
}