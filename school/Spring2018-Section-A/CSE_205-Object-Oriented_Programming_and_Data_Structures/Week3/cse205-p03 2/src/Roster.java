//***************************************************************************************************************************
// CLASS: Roster
//
// AUTHOR
// Your author information
//***************************************************************************************************************************
package p03;

???

/**
 * The Roster class encapsulates an ArrayList<Student> which stores the information for each student in the gradebook.
 */
public class Roster {

    // Declare mStudentList
    ???

    /**
     * Roster()
     *
     * PSEUDOCODE:
     * Create mStudentList.
     */
    ???

    /**
     * addStudent()
     *
     * PSEUDOCODE:
     * Add (append) pStudent to mStudentList.
     */
    ???

    /**
     * getStudent()
     * Searches mStudentList for a Student with pLastName.
     *
     * PSEUDOCODE:
     * index = Call Searcher.search(getStudentList(), pLastName)
     * If index == -1 Then Return null
     * Else return the Student object in mStudentList at index
     */
    ???

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
     *
     * PSEUDOCODE:
     * Call Sorter.sort() passing the list of students
     */
    ???

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
