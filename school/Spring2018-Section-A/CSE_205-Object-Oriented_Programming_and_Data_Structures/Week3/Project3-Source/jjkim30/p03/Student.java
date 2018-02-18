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
 * The Student class stores the grade information for one Student.
 */
public class Student implements Comparable<Student> {

    // ✅ Declare the instance variables.
    private ArrayList<Integer> _examList;
    private String _firstName;
    private String _lastName;
    private ArrayList<Integer> _homeworkList;

    /**
     * Student()
     *
     * PSEUDOCODE:
     * ✅ Save pFirstName and pLastName.
     * ✅ Create mExamList
     * ✅ Create mHomeworkList
     */
    public Student(String firstName, String lastName) {

        _firstName = firstName;
        _lastName = lastName;

        _examList = new ArrayList<>();
        _homeworkList = new ArrayList<>();
    }

    /**
     * addExam()
     *
     * PSEUDOCODE:
     * ✅ Call add(pScore) on getExamList() to add a new exam score to the list of exam scores.
     */
    public void addExam(int score) {
        getExamList().add(score);
    }

    /**
     * addHomework()
     *
     * PSEUDOCODE:
     * ✅ Call add(pScore) on getHomeworkList() to add a new homework score to the list of homework scores.
     */
    public void addHomework(int score) {
        getHomeworkList().add(score);
    }

    /**
     * compareTo()
     *
     * PSEUDOCODE:
     * ✅ Return: -1 if the last name of this Student is < the last name of pStudent
     * ✅ Return:  0 if the last name of this Student is = the last name of pStudent
     * ✅ Return:  1 if the last name of this Student is > the last name of pStudent
     * Hint: the last names are Strings.
     */
    public int compareTo(Student student) {

        int comparisonResult = this._lastName.compareTo(student.getLastName());

        // If the result is less than 0, this student's last name comes before the passed in student
        if (comparisonResult < 0) {
            return -1;
        } else if (comparisonResult > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * getExam()
     *
     * Accessor method to retreive an exam score from the list of exams.
     */
    public int getExam(int pNum) {
        return getExamList().get(pNum);
    }

    /**
     * getExamList()
     *
     * Accessor method for mExamList.
     */
    protected ArrayList<Integer> getExamList() {
        return _examList;
    }

    /**
     * getFirstName()
     *
     * Accessor method for mFirstName.
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * getHomework()
     *
     * Accessor method to retrieve a homework score from the list of homeworks.
     */
    public int getHomework(int pNum) {
        return getHomeworkList().get(pNum);
    }

    /**
     * getHomeworkList()
     *
     * Accessor method for mHomeworkList.
     */
    protected ArrayList<Integer> getHomeworkList() {
        return _homeworkList;
    }

    /**
     * getLastname()
     *
     * Accessor method for mLastName.
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * setExam()
     *
     * Mutator method to store an exam score into the list of exam scores.
     */
    public void setExam(int pNum, int pScore) {
        getExamList().set(pNum, pScore);
    }

    /**
     * setExamList()
     *
     * Mutator method for mExamList.
     */
    protected void setExamList(ArrayList<Integer> pExamList) {
        _examList = pExamList;
    }

    /**
     * setFirstName()
     *
     * Mutator method for mFirstName.
     */
    public void setFirstName(String pFirstName) {
        _firstName = pFirstName;
    }

    /**
     * setHomework()
     *
     * Mutator method to store a homework score into the list of homework scores.
     */
    public void setHomework(int pNum, int pScore) {
        getHomeworkList().set(pNum, pScore);
    }

    /**
     * setHomeworkList()
     *
     * Mutator method for mHomeworkList.
     */
    protected void setHomeworkList(ArrayList<Integer> pHomeworkList) {
        _homeworkList = pHomeworkList;
    }

    /**
     * setLastname()
     *
     * Mutator method for mLastName.
     */
    public void setLastName(String pLastName) {
        _lastName = pLastName;
    }

    /**
     * toString()
     *
     * ✅ Returns a String representation of this Student. The format of the returned string shall be such that the Student
     * information can be printed to the output file, i.e:
     *
     * ✅ lastname firstname hw1 hw2 hw3 hw4 exam1 exam2
     */
    @Override
    public String toString(){

        String output = this.getLastName() + " " + this.getFirstName() + " ";

        for (Integer homeworkScore : this.getHomeworkList()) {
            output += homeworkScore + " ";
        }

        for (Integer examScores : this.getExamList()) {
            output += examScores + " ";
        }

        return output;
    }

}
