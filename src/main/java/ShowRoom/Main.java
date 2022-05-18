package ShowRoom;

public class Main {
    public static void main(String[] args) {
        final ShowRoom carShowRoom= new ShowRoom();

        new Thread(null, carShowRoom::buyCar, "Buyer 1").start();
        new Thread(null, carShowRoom::buyCar, "Buyer 2").start();
        new Thread(null, carShowRoom::buyCar, "Buyer 3").start();
        new Thread(null, carShowRoom::produceCar, "Producer").start();

    }
}
