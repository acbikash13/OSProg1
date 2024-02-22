public class Aclass extends Thread{
    protected long time_to_sleep; // in milliseconds
    progState count;

    //constructor. time is in the milliseconds
    public Aclass(progState count, long time) {
        this.count = count;
        this.time_to_sleep  =time;
    }


}
class Bclass extends Thread {
    protected long time_to_sleep;
    progState count;

    public Bclass(progState count, long time) {
        this.count = count;
        this.time_to_sleep  =time;
    }
}
class Cclass implements Runnable {
    protected long time_to_sleep;
    progState count;

    public Cclass(progState count, long time) {
        this.count = count;
        this.time_to_sleep  =time;
    }


    @Override
    public void run() {

    }
}
class Dclass implements Runnable {
    protected long time_to_sleep;
    progState count;
    public Dclass(progState count, long time) {
        this.count = count;
        this.time_to_sleep  =time;
    }

    @Override
    public void run() {

    }
}