//******************************************************************************************************** // CLASS: classname (classname.java)
//
// OnCampusStudent Class - extends Student class
//
// CSE 205 - Project 2
// CSE205 Object Oriented Programming and Data Structures, Spring Section A // Project Number: 2
//
// James J. Kim
// jjkim30@asu.edu
// ********************************************************************************************************

public class OnCampusStudent extends Student {

    // True if the OnCampusStudent is a resident, false for non-resident
    private boolean _resident;

    // Certain OnCampusStudent's pay an additional program fee. This value may be 0
    private double _programFee;

    /**
     * default constructor when no data is passed in.
     */
    public OnCampusStudent() {
        this("Not Set","Not Set", "Not Set");
    }

    /**
     * Calling the superclass constructor of Student
     * @param id
     * @param firstName
     * @param lastName
     */
    public OnCampusStudent(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    /**
     * Calculates student's tuition depending on student's category and the number of units taken
     */
    @Override
    public void calcTuition() {

        double baseTuition = 0.0;

        // Check if the student is a resident
        if (this.getResidency() == true) {
            // Get the on campus tuition rate
            baseTuition = TuitionConstants.ONCAMP_RES_BASE;
        } else {
            baseTuition = TuitionConstants.ONCAMP_NONRES_BASE;
        }

        // Add additional program fee depending on the enrolled program
        baseTuition += getProgramFee();

        if (this.getCredits() > TuitionConstants.MAX_CREDITS) {
            baseTuition = baseTuition + (this.getCredits() - TuitionConstants.MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }

        // Set the tuition
        this.setTuition(baseTuition);
    }

    /**
     * Returns the total program fee for the OnCampus Student
     * @return _programFee
     */
    public double getProgramFee() {
        return _programFee;
    }

    /**
     * Returns boolean value if the student is an OnCampus Student
     * @return _resident
     */
    public boolean getResidency() {
        return _resident;
    }

    /**
     * As long as program fee is not negative, set the program fee
     * @param programFee
     */
    public void setProgramFee(double programFee) {
        if (programFee > 0) {
            _programFee = programFee;
        }
    }

    /**
     * Sets the student's residency with a boolean value
     * @param resident
     */
    public void setResidency(boolean resident) {
        _resident = resident;
    }

}
