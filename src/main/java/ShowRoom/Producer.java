package ShowRoom;

public class Producer {
    public ShowRoom carShowRoom;

    public Producer (ShowRoom carShowRoom) {
        this.carShowRoom = carShowRoom;
    }

    public synchronized void produceCar() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " produces the car.");
            if (ShowRoom.cars == 1) {
                notifyAll();
            }
            for (int i = 0; i < 10; i++) {
                ShowRoom.cars++;
                System.out.println("The car is produced.");
                notifyAll();
                Thread.sleep(3000);
            }

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //notifyAll();
        //CarShowRoom.cars--;
    }
}
