public class Dclass implements  Runnable{
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
