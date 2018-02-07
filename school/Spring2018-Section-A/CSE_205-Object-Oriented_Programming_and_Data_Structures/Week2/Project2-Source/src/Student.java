//******************************************************************************************************** // CLASS: classname (classname.java)
//
// Student class that contains all the information about the student including tuition
//
// CSE 205 - Project 2
// CSE205 Object Oriented Programming and Data Structures, Spring Section A // Project Number: 2
//
// James J. Kim
// jjkim30@asu.edu
// ********************************************************************************************************
public abstract class Student implements Comparable<Student> {

    private int _credits;
    private String _firstName;
    private String _id;
    private String _lastName;
    private double _tuition;


    /**
     * Default Constructor
     */
    public Student() {
        this("Not Specified", "Not Specified", "Not Specified");
    }

    /**
     * Designated constructor
     * @param id
     * @param firstName
     * @param lastName
     */
    public Student(String id, String firstName, String lastName) {
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
    }

    // Abstract method - leave it to the subclasses to define the implementation of this method
    public void calcTuition(){}

    /**
     * Compares the student id of the passed in student object to the instance of this object
     * @param student
     * @return comparison results
     */
    @Override
    public int compareTo(Student student) {
        return getId().compareTo(student.getId());
    }

    /**
     * Returns student's credit
     * @return _credits
     */
    public int getCredits() {
        return _credits;
    }

    /**
     * Accessor for Student's First Name
     * @return _firstName
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * Accessor for Student's ID
     * @return _id
     */
    public String getId() {
        return _id;
    }

    /**
     * Accessor for Student's Last Name
     * @return _lastName
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * Accessor for Student's Tuition
     * @return _tuition
     */
    public double getTuition() {
        return _tuition;
    }

    /**
     * Mutator for setting credit
     * @param credits
     */
    public void setCredit(int credits) {
        _credits = credits;
    }

    /**
     * Mutator for setting Student's first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    /**
     * Mutator for setting Student's ID
     * @param id
     */
    public void setId(String id) {
        _id = id;
    }

    /**
     * Setting Student's Last Name
     * @param lastName
     */
    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    /**
     * Mutator for setting the tuition
     * @param tuition
     */
    protected void setTuition(double tuition) {
        _tuition = tuition;
    }

}
