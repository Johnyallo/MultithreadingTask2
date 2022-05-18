package ShowRoom;

public class ShowRoom {
    static int cars = 0;
    Buyer buyer  = new Buyer(this);
    Producer producer = new Producer(this);


    public void produceCar() {
        producer.produceCar();
    }

    public void buyCar() {
        buyer.buyCar();;
    }
}
