public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        long amount = 5000;
        boolean percent = true;
        long actual = service.calculate(amount, percent);
        System.out.println(expected + " == ? == " + actual);
    }
}
