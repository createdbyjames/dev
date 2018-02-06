import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<> ();
        for (int i = 10; i <= 150; i +=10) {
            list1.add(i);
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        ArrayList<Integer> list3 = new ArrayList<>();

        try {

            File myFile = new File("in.txt");
            Scanner in = new Scanner(myFile);

            // Read each line of the file
            while (in.hasNext()) {

                // Read in each of the integers and add them to the list
                list3.add(in.nextInt());
            }

            in.close();

        } catch (FileNotFoundException e) {

            System.out.println("File specified could not be open or read. ");
            System.exit(-1);
        }


        try {

            PrintWriter out = new PrintWriter(new File("out.txt"));

            // Tally up the total runs
            int totalRuns = 0;
            for (int i = 0; i < list3.size(); i++) {
                if (list3.get(i) % 2 == 0) {
                    out.printf("%d ", list3.get(i));
                }
            }

            // Close out the file
            out.close();

        } catch (IOException exception) {

            System.out.println("Sorry, could not create " + file + " for writing. Stopping.");
            System.exit(-1);
        }



    }

}


