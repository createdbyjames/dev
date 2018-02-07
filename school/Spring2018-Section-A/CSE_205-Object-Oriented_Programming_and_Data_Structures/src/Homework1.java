import java.util.ArrayList;

public class Homework1 {

    public ArrayList arrayListCreate(int pLen, int pInitValue) {

        // new ArrayList of int
        ArrayList<Integer> newArrayList = new ArrayList<>();

        // fill the new ArrayList with the init value
        for (int i = 0; i < pLen; i++) {
            newArrayList.add(pInitValue);
        }

        return newArrayList;
    }

    public int arrayListSum(ArrayList pList) {

        // hold the total in the pList object
        int sum = 0;

        for (int i = 0; i < pList.size(); i++) {

            // Cast the element in the ArrayList object to integer
            sum += (Integer)pList.get(i);
        }

        // Return the sum
        return sum;
    }

    public void run() {

        // Instantiate a new ArrayList object
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate and fill the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        // This is ugly to write this again... but quick easy way
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        // DBEUG: Print out the ArrayList for debugging
        for (Integer intVar : list) {
            System.out.print(intVar);
        }

        System.out.println("\nTotal: " + arrayListSum(list));

        ArrayList<Integer> myNewList = arrayListCreate(5, 0);

        // DBEUG: Print out the ArrayList for debugging
        for (Integer intVar : myNewList) {
            System.out.print(intVar);
        }

    }
    public static void main(String[] args) {

        Homework1 hw1 = new Homework1();
        hw1.run();
    }
}
