public class Main {
    public static void main(String[] args) {
        Technika tractor = new Tractor("Беларус","Синий",2022,15000);
        System.out.println(tractor);
        tractor.start();
        tractor.stop();
        System.out.println("**************************");

        Technika bike = new Bike("Yamaha", "RED",2020,15478);
        System.out.println(bike);
        bike.start();
        bike.stop();
        System.out.println("****************************");

        Technika avto = new Avto("Lexus", "White",2023,50000);
        System.out.println(avto);
        avto.start();
        avto.stop();
    }
}