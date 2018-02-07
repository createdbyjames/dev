//******************************************************************************************************** // CLASS: classname (classname.java)
//
// OnlineStudent Class - extends Student class
//
// CSE 205 - Project 2
// CSE205 Object Oriented Programming and Data Structures, Spring Section A // Project Number: 2
//
// James J. Kim
// jjkim30@asu.edu
// ********************************************************************************************************

public class OnlineStudent extends Student {

    // Certain OnlineStudent's pay an additional technology fee. This instance variable will be true if the
    // technology fee applies and false if it does not.
    private boolean _techFee;

    /**
     * Default constructor that calls the designated constructor with
     * intial values.
     */
    public OnlineStudent(){
        this("Not Set","Not Set", "Not Set");
    }

    /**
     * Designated constructor that calls the super constructor of Student class
     * @param id
     * @param firstName
     * @param lastName
     */
    public OnlineStudent(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    /**
     * Calculates student's tuition depending on student's category and the number of units taken
     */
    @Override
    public void calcTuition() {

        double baseTuition = this.getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;

        if (this.getTechFeee() == true) {
            baseTuition = baseTuition + TuitionConstants.ONLINE_TECH_FEE;
        }

        // Set the tuition with the newly calculated tuition rate for online student
        this.setTuition(baseTuition);
    }

    /**
     * Returns a boolean value to see if tech fee applies
     * @return _techFee
     */
    public boolean getTechFeee() {
        return _techFee;
    }

    /**
     * Mutator method to set the boolean value if techfee applies
     * @param techFee
     */
    public void setTechFee(boolean techFee) {
        _techFee = techFee;
    }

}
