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

/**
 * Perform a quick sort - provide 2 differnt implementation of the sorting.
 */
public class Sorter {

    // Creating the partition to perform quicksort
    private int partition (ArrayList<Student> list, int fromIndex, int toIndex) {

        Student pivot = list.get(fromIndex);

        int leftIndex = fromIndex -1;
        int rightIndex = toIndex + 1;

        while (leftIndex < rightIndex) {

            leftIndex++;

            // Move the index to the right until it finds lastname that comes later
            while (list.get(leftIndex).getLastName().compareTo(pivot.getLastName()) < 0) {
                leftIndex++;
            }

            rightIndex--;

            // Move the right index to the left until the value in the right side is less
            while(list.get(rightIndex).getLastName().compareTo(pivot.getLastName()) > 0) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                swap(list, leftIndex, rightIndex);
            }
        }

        return rightIndex;
    }

    /**
     * Recursive quickSort method that calls into self
     */
    private void quickSort(ArrayList<Student> list, int fromIndex, int toIndex) {

        if (fromIndex >= toIndex) {
            return;
        }

        int partitionIndex = partition(list, fromIndex, toIndex);

        quickSort(list, fromIndex, partitionIndex);
        quickSort(list, partitionIndex + 1, toIndex);
    }

    // Sort method that calls the private quickSort method
    public void sort(ArrayList<Student> list) {

        quickSort(list, 0, list.size() - 1);

    }

    // Perform swap function between two student objects in the list
    private void swap(ArrayList<Student> list, int index1, int index2) {

        Student temp;

        temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
