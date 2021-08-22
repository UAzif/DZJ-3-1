public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 25_357;
        int miles = service.calculate(cost);
        System.out.println("Вам начислены  " + miles);

    }
}
