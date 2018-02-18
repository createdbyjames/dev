/**
 * CSE 205
 * CSE205 Object Oriented Programming and Data Structures
 * Project Number: 3
 *
 * Author: James J. Kim
 * jjkim30@asu.edu
 */

package p03;

import java.util.ArrayList;

public class Searcher {

    // Recursive implementation of the binary search
    public int search(ArrayList<Student> list, String key, int low, int high) {

        // return when the list is empty
        if (low > high) {
            return -1;
        }

        // Determine the middle of array list
        int middle = (low + high) / 2;

        // if the key is found in the middle, return the element
        // if comparison result is less than 0, it comes before, so search lower bound
        if (key.equals(list.get(middle))) {
            return middle;
        } else if (key.compareTo(list.get(middle).getLastName()) < 0) {
            return search(list, key, low, middle - 1);
        } else
            return search(list, key, middle +1, high);
    }

    // Binary search
    public int search(ArrayList<Student> list, String key) {

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {

            // find the middle
            int middle = (low + high) / 2;

            if (key.equals(list.get(middle).getLastName())) {
                return middle;
            } else if (key.compareTo(list.get(middle).getLastName()) < 0) {
                high = middle -1;
            } else {
                low = middle + 1;
            }
        }

        // When its not found
        return -1;

    }
}
