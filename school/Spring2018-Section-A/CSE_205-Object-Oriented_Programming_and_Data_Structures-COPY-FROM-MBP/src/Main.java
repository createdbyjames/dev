//********************************************************************************************************
// CLASS: Main (Main.java)
//
// DESCRIPTION
// A description of the contents of this file.
//
// CSE 205 - PROJECT 1
// CSE205 Object Oriented Programming and Data Structures
//
// James J. Kim
// jjkim30@asu.edu
// ********************************************************************************************************

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    // Constants to determine if we're counting up or down
    private static final int RUNS_UP = 0;
    private static final int RUNS_DN = 1;

    /**
     * Main entry to the program
     */
    public static void main(String[] args) throws IOException{
        Main mainObject = new Main();
        mainObject.run();
    }

    /**
     * Method with all the logic - starting point
     * @throws FileNotFoundException
     */
    private void run() throws IOException{

        // ArrayList of Integers to hold the numbers found in the file
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        ArrayList<Integer> listRunsDnCount = new ArrayList<>();

        File file = new File("/Volumes/Source/James/School/ASU/Spring2018-Section-A/CSE_205-Object-Oriented_Programming_and_Data_Structures/Week1/cse205-Project1/input/p01-in.txt");

        try {

            Scanner readFileScanner = new Scanner(file);

            // Read each line of the file
            while (readFileScanner.hasNext()) {

                // Read in each of the integers and add them to the list
                list.add(readFileScanner.nextInt());
            }
        } catch (FileNotFoundException exception) {

            System.out.println("Sorry, could not open " + file + " for reading. Stopping.");
            System.exit(-1);
        }

        // Find the runs and store them into separate ArrayList
        listRunsUpCount = FindRuns(list, RUNS_UP);
        listRunsDnCount = FindRuns(list, RUNS_DN);

        // DEBUG - Call helper method to display the contents of the ArrayList
        printArrayList("Run Up", listRunsUpCount);
        printArrayList("Run Down", listRunsDnCount);

        // Create a ArrayList objec to hold the combined value between RUN_UP and RUN_DN
        ArrayList<Integer> listRunsCount = arrayListCreate(list.size(), 0);
        listRunsCount = merge(listRunsUpCount, listRunsDnCount);

        // DEBUG - Call helper method to display the contents of the array
        printArrayList("Final List Count", listRunsCount);

        // Print out the contents of the ArrayList to a file
        output("p01-runs.txt", listRunsCount);
    }

    /**
     *
     * @param pList ArrayList with Integers read from the input file
     * @param pDirs Constant value to determine RUNS_UP (0) or RUNS_DN (1)
     * @return Returns an ArrayList of with value of k
     */
    private ArrayList FindRuns(ArrayList<Integer> pList, int pDirs){

        // Create an ArrayList with the size and a default valut
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(), 0);

        // Count the number of elements
        int i = 0;

        // Number of subsequences found
        int k = 0;

        while (i < pList.size() - 1) {

            if (pDirs == RUNS_UP && pList.get(i) <= pList.get(i + 1)) {

                // Increment k when pListd.get(i) is lower than the next i+1
                k++;

                // DEBUG -
                // System.out.println("pList[" + i + "]:" + pList.get(i) );

            } else if (pDirs == RUNS_DN && pList.get(i) >= pList.get(i + 1)) {

                // Increment k when pListd.get(i) is higher than the next i+1
                k++;

                // DEBUG - Displays the
                // System.out.println("pList[" + i + "]:" + pList.get(i) );

            } else {

                // When the subsequence ends and k is NOT 0, update the listRunsCount at the index
                if (k != 0) {

                    int currentCount = listRunsCount.get(k);
                    listRunsCount.set(k, ++currentCount);

                    k = 0;
                }
            }

            // Increment the index once we compared the value
            i++;
        }

        // After counting the last element, update the ArrayList
        if (k != 0) {
            int currentCount = listRunsCount.get(k);
            listRunsCount.set(k, ++currentCount);
        }

        return listRunsCount;
    }

    /**
     *
     * @param pListRunsUpCount ArrayList that contains values from Run Up
     * @param pListRunsDnCount ArrayList that contains values from Run Down
     * @return Returns ArrayList that's merged between the two arrays
     */
    private ArrayList merge(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {

        ArrayList<Integer> listRunsCount = arrayListCreate(pListRunsUpCount.size(), 0);

        for (int i = 0; i < listRunsCount.size(); i++) {

            Integer value = pListRunsUpCount.get(i) + pListRunsDnCount.get(i);

            listRunsCount.set(i, value);
        }

        return listRunsCount;
    }

    /**
     *
     * @param pFileName String of FileName to be used to printout the contents
     * @param pListRuns ArrayList with the values to be printed
     * @throws FileNotFoundException Testing to ensure file can be open and written to
     */
    private void output(String pFileName, ArrayList<Integer> pListRuns) throws IOException{

        // Instantiate a file object to be used for PrintWriter
        File file = new File(pFileName);

        try {

            PrintWriter out = new PrintWriter(file);

            // Tally up the total runs
            int totalRuns = 0;
            for (int i = 0; i < pListRuns.size(); i++) {
                totalRuns += pListRuns.get(i);
            }

            // Print the total runs to the output file
            out.printf("runs_total, %d\n", totalRuns);

            // Print out the value of each of the elements
            for (int i = 1; i < totalRuns; i++) {
                out.printf("runs_%d, %d\n", i, pListRuns.get(i));
            }

            // Close out the file
            out.close();

        } catch (IOException exception) {

            System.out.println("Sorry, could not create " + file + " for writing. Stopping.");
            System.exit(-1);
        }
    }

    /**
     *
     * @param pSize Integer value with the size of the ArrayList to be created
     * @param pInitValue Integer value with the initial value for each of the elements
     * @return Returns an empty ArrayList with the size and the intial value
     */
    private ArrayList arrayListCreate(int pSize, int pInitValue) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < pSize; i++){
            list.add(pInitValue);
        }

        return list;
    }

    /**
     *
     * @param description String description to be printed for clarification
     * @param list ArrayList to be printed
     */
    private void printArrayList(String description, ArrayList<Integer> list) {
        System.out.println(description);
        for (Integer integer : list) {
            System.out.printf("%d ", integer);
        }

        System.out.println();

    }

}
