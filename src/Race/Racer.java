/*Amit Sherman 209284017
Stav Zysblatt 313434748 */
package Race;

public class Racer implements Runnable {

    private static int globalId = 1;
    private final int id;
    private final int speed;
    private final Track track;

    @Override
    public void run() {
        go();

    }

    public Racer(int speed, Track track) { //Constructor that limits the speed to be a positive number under 10
        if (speed < 1 || speed > 10) {
            throw new IllegalArgumentException("Speed must be between 1 and 10");
        }
        this.id = globalId++;
        this.speed = speed;
        this.track = track;
    }

    public void go() { //Represents the running logic for the Runners
        for (int distance = 1; distance <= 100; distance += this.speed) {

            if (distance + this.speed > 100) {
                distance = 100;
                System.out.println("Runner " + id + " ran " + distance + " meters");
                track.racerFinished(id);
                break;
            }
            System.out.println("Runner " + id + " ran " + distance + " meters");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
