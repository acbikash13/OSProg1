import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class noSynch extends Thread{
    protected static int total = 0;
    int value;
    public noSynch(int value){
        this.value = value;
    }
    public void run() {
        int local;
        local = total;
        local += value;
        total = local;
    }
    public static int getTotal(){
        return total;
    }

    public static void main(String[] args) {
        Random randObject = new Random();
        int trueCount = 0;
        Vector<noSynch> vector = new Vector<>();
        for(int i = 0; i< 100; i++) {
            // generate a random number between -100 and 100. -100 sets the limit number back to -100
            int randomNumber =  randObject.nextInt(201)-100;
            trueCount+=randomNumber;
            noSynch noSynchObject = new noSynch(randomNumber);
            // add the noSync obj in the vector object
            vector.add(noSynchObject);
            noSynchObject.start();
        }
        Iterator<noSynch> myiterate =  vector.iterator();
        while(myiterate.hasNext()) {
            try {
                myiterate.next().join();
            }
            catch(Exception e) {
                System.out.println("Some error occured while performing the join function on the mySynch Object.");
            }
        }
        System.out.println("The true count value is " +  trueCount);
        System.out.println("The result of calling hte getTotal() is " +  noSynch.getTotal());
    }

}
