public class Technika {
    private String marka;
    private String color;
    private int made;
    private int price;

    public Technika(String marka, String color, int made, int price) {
        this.marka = marka;
        this.color = color;
        this.made = made;
        this.price = price;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMade() {
        return made;
    }

    public void setMade(int made) {
        this.made = made;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void start(){
        System.out.println("Running.....");
    }
    public void stop() {
        System.out.println("Stop!!!!");
    }

    @Override
    public String toString() {
        return "Technika{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", made=" + made +
                ", price=" + price +
                '}';
    }
}
