package ShowRoom;

import static ShowRoom.ShowRoom.cars;

public class Buyer {
    public ShowRoom ShowRoom;

    public Buyer(ShowRoom ShowRoom) {
        this.ShowRoom = ShowRoom;
    }

    public synchronized void buyCar() {
//        while (cars > 0) {
        try {
            System.out.println(Thread.currentThread().getName() + " has come in the car showroom.");
            if (cars == 0) {
                System.out.println(Thread.currentThread().getName() + " can't buy the car - there are nothing.");
                Thread.sleep(2000);
                wait();
            }
            while (cars > 0) {
                System.out.println(Thread.currentThread().getName() + " has gone out.");
                cars--;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
