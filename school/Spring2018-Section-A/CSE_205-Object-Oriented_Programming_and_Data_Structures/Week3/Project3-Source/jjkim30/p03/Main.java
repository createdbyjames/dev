/**
 * CSE 205
 * CSE205 Object Oriented Programming and Data Structures
 * Project Number: 3
 *
 * Author: James J. Kim
 * jjkim30@asu.edu
 */

package p03;

import java.io.FileNotFoundException;
import javax.swing.JFrame;

/**
 * The Main class containing the main() and run() methods.
 */
public class Main {

    // The Roster of students that is read from "gradebook.txt".
    private Roster _roster = new Roster();

    // A reference to the View object.
    private View mView;

    // Decided to provide full path the the document
    private String _fileName = "/Users/jamesjkim/Development/CreatedByJames/school/Spring2018-Section-A/CSE_205-Object-Oriented_Programming_and_Data_Structures/Week3/Project3-Source/src/p03/gradebook.txt";

    /**
     * Entry point to the main program
     */
    public static void main(String[] pArgs) {
        Main myMain = new Main();
        myMain.run();
    }

    /**
     * exit() is called when the Exit button in the View is clicked.
     */
    public void exit() {

        try {

            GradebookWriter writer = new GradebookWriter(_fileName);
            writer.writeGradebook(getRoster());
            System.exit(0);

        } catch (FileNotFoundException e) {

            getView().messageBox("Could not open gradebook.txt for writing. Exiting without saving.");
            System.exit(-1);
        }

    }

    /**
     * Accessor method for mRoster.
     */
    public Roster getRoster() {
        return _roster;
    }

    /**
     * Accessor method for mView.
     */
    public View getView() {
        return mView;
    }

    /**
     * run() is the main routine.
     */
    public void run() {

        JFrame.setDefaultLookAndFeelDecorated(false);
        setView(new View(this));

        try {

            GradebookReader gradebookReader = new GradebookReader(_fileName);

            setRoster(gradebookReader.readGradebook());

        } catch (FileNotFoundException e) {

            getView().messageBox("Could not open gradebook.txt for reading. Exiting");
            System.exit(-1);
        }

    }

    /**
     * search() is called when the Search button is clicked on the View. The input parameter is the non-empty last name
     * of the Student to locate. Call getStudent(pLastName) on the Roster object to get a reference to the Student with
     * that last name. If the student is not located, getStudent() returns null.
     */
    public Student search(String lastName) {
        Student foundStudent =  getRoster().getStudent(lastName);

        return foundStudent;
    }

    /**
     * Mutator method for mRoster.
     */
    public void setRoster(Roster pRoster) {

        _roster = pRoster;
    }

    /**
     * Mutator method for mView.
     */
    public void setView(View pView) {
        mView = pView;
    }
}
