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
 * The Roster class encapsulates an ArrayList<Student> which stores the information for each student in the gradebook.
 */
public class Roster {

    // ✅ Declare mStudentList
    ArrayList<Student> mStudentList;

    /**
     * Roster()
     *
     * PSEUDOCODE:
     * ✅ Create mStudentList.
     */
    public Roster() {
        mStudentList = new ArrayList<>();
    }

    /**
     * addStudent()
     *
     * PSEUDOCODE:
     * ✅ Add (append) pStudent to mStudentList.
     */
    public void addStudent(Student student) {
        mStudentList.add(student);
    }

    /**
     * getStudent()
     * Searches mStudentList for a Student with pLastName.
     */
    public Student getStudent(String lastName) {

        Searcher search = new Searcher();
        int index = search.search(mStudentList, lastName);

        if (index == -1) {
            return null;
        } else {
            return this.getStudentList().get(index);
        }
    }

    /**
     * getStudentList()
     * Accessor method for mStudentList.
     */
    public ArrayList<Student> getStudentList() {
        return mStudentList;
    }

    /**
     * setStudentList()
     * Mutator method for mStudentList.
     */
    public void setStudentList(ArrayList<Student> pStudentList) {
        mStudentList = pStudentList;
    }

    /**
     * sortRoster()
     * Called to sort the roster by last name.
     */
    public void sortRoster() {
        Sorter sort = new Sorter();
        sort.sort(getStudentList());
    }

    /**
     * Returns a String representation of this Roster. Handy for debugging.
     */
    @Override
    public String toString() {
        String result = "";
        for (Student student : getStudentList()) result += student + "\n";
        return result;
    }
}
