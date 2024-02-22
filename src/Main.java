import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;

public class Main {
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

        // For the part 2
        Scanner input = new Scanner(System.in);
        Vector<Thread> V =  new Vector<>();
        progState  obj1;
        String filePath;
        System.out.println("Enter the path for your file: ");
        filePath = input.nextLine();
        File newFile =  new File(filePath);
        try {
            Scanner fileScanner = new Scanner(newFile);

        }
        catch (Exception e) {
            System.out.println("Something went wrong! Unable to open file.");
            System.exit(1);
        }





    }


}

