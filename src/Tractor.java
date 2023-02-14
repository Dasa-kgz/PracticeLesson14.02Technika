public class Tractor extends Technika{
    public Tractor(String marka, String color, int made, int price) {
        super(marka, color, made, price);
    }

    @Override
    public void start() {
        System.out.println("Tрактор заводился");
    }

    @Override
    public void stop() {
        System.out.println("Трактор остановился");
    }
}
