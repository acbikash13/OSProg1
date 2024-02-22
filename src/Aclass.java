public class Aclass extends Thread{
    protected long time_to_sleep; // in milliseconds
    progState count;

    //constructor. time is in the milliseconds
    public Aclass(progState count, long time) {
        this.count = count;
        this.time_to_sleep  =time;
    }
    public void run() {
        count.incA();

    }

}
