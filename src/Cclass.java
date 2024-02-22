public class Cclass implements Runnable{
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
