public class Avto extends Technika{
    public Avto(String marka, String color, int made, int price) {
        super(marka, color, made, price);
    }

    @Override
    public void start() {
        System.out.println("Авто заводилось");
    }

    @Override
    public void stop() {
        System.out.println("Авто остановилось");
    }
}
