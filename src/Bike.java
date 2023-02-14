public class Bike extends Technika{
    public Bike(String marka, String color, int made, int price) {
        super(marka, color, made, price);
    }

    @Override
    public void start() {
        System.out.println("Мото заводился");
    }

    @Override
    public void stop() {
        System.out.println("Мото остановился");
    }
}
