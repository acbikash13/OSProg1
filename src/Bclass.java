public class Bclass extends Thread{
    protected long time_to_sleep;
    progState count;

    public Bclass(progState count, long time) {
        this.count = count;
        this.time_to_sleep  =time;
    }
}
