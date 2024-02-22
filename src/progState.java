import java.util.Vector;

public class progState {
    int Acount, Bcount, Ccount,Dcount;
    public progState(){
        Acount =0;
        Bcount = 0;
        Ccount =0;
        Dcount = 0;

    }
    public synchronized void incA(){
        Acount++;
    }
    public synchronized void incB(){
        Bcount++;
    }
    public synchronized void incC(){
        Ccount++;
    }
    public synchronized void incD(){
        Dcount++;
    }
    public synchronized  void decA() {
        Acount--;
    }
    public synchronized  void decB() {
        Bcount--;
    }
    public synchronized  void decC() {
        Ccount--;
    }
    public synchronized  void decD() {
        Dcount--;
    }
    public synchronized void printTotal( ) {
        // calculate total here
        int total = Acount + Bcount + Ccount + Dcount;
        synchronized (System.out) {
            System.out.println("Total is " + total);
            System.out.println("***************\n");
        // print each class's totals here
            System.out.flush();
        }
    }

    public static void main(String[] args) {
        Vector<Thread> V = new Vector<>();
    }
}
