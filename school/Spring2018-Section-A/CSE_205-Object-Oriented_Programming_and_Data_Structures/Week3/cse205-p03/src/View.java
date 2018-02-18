//***************************************************************************************************************************
// CLASS: View
//
// AUTHOR
// Your author information
//***************************************************************************************************************************
package p03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 250;

    // Declare instance variables
    ???

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     */
    public View(Main pMain) {

        // Save a reference to the Main object pMain in mMain.
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelSearch which uses the FlowLayout.
        // Add a JLabel "Student Name: " to panelSearch
        // Create mSearchText and make the field 25 cols wide
        // Add mSearchText to the panel
        // Create mSearchButton
        // Make this View the action listener for the button
        // Add the button to the panel
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelHomework which uses the FlowLayout.
        // Add a JLabel "Homework: " to the panel
        // Create mHomeworkText which is an array of CourseConstants.NUM_HOMEWORKS JTextFields
        // For i = 0 to CourseConstants.NUM_HOMEWORKS - 1 Do
        //     Create textfield mHomeworkText[i] displaying 5 cols
        //     Add mHomeworkText[i] to the panel
        // End For
        ???

        // Create the exam panel which contains the "Exam: " label and the two exam text fields. The pseudocode is omitted
        // because this code is very similar to the code that creates the panelHomework panel.
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelButtons using FlowLayout.
        // Create the Clear button mClearButton.
        // Make this View the action listener for mClearButton.
        // Add the  Clear button to the panel.
        // Repeat the three above statements for the Save button.
        // Repeat the three above statements for the Exit button.
        ???

        // PSEUDOCODE:
        // Create a JPanel named panelMain using a vertical BoxLayout.
        // Add panelSearch to panelMain.
        // Add panelHomework to panelMain.
        // Add panelExam to panelMain.
        // Add panelButtons to panelMain.
        ???

        // Initialize the remainder of the frame, add the main panel to the frame, and make the frame visible.
        setTitle("Gradebookulator");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelMain);
        setVisible(true);
    }

    /**
     * actionPerformed()
     *
     * Called when one of the JButtons is clicked. Detects which button was clicked and handles it.
     *
     * PSEUDOCOODE:
     * If the source of the event was the Search button Then
     *     lastName = retrieve the text from the mSearchText text field.
     *     If lastName is the empty string Then
     *         Call messageBox() to display "Please enter the student's last name."
     *     Else
     *         student = Call mMain.search(lastName)
     *         If student is null Then
     *             Call messageBox() to display "Student not found. Try again."
     *         Else
     *             Call displayStudent(student)
     *         End if
     *     End If
     * Else if the source of the event was the Save button Then
     *     If mStudent is not null Then Call saveStudent(mStudent)
     * Else if the source of the event was the Clear button Then
     *     Call clear()
     * Else if the source of the event was the Exit button Then
     *     If mStudent is not null Then Call saveStudent(mStudent)
     *     Call mMain.exit() to terminate the application
     * End If
     */
    ???

    /**
     * clear()
     *
     * Called when the Clear button is clicked. Clears all of the text fields by setting the contents to the empty string.
     * After clear() returns, no student information is being edited or displayed.
     *
     * PSEUDOCODE:
     * Set the mSearchText text field to ""
     * Set each of the homework text fields to ""
     * Set each of the exam text fields to ""
     * Set the mStudent reference to null
     */
    ???

    /**
     * displayStudent()
     *
     * Displays the homework and exam scores for a student in the mHomeworkText and mExamText text fields.
     *
     * PSEUDOCODE:
     * For i = 0 to CourseConstants.NUM_HOMEWORKS - 1 Do
     *     int hw = pStudent.getHomework(i)
     *     String hwstr = convert hw to a String (Hint: Integer.toString())
     *     mHomeworkText[i].setText(hwstr)
     * End For
     * Write another for loop similar to the one above to place the exams scores into the text fields
     */
    ???

    /**
     * messageBox()
     *
     * Displays a message box containing some text.
     */
    public void messageBox(String pMessage) {
        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * saveStudent()
     *
     * Retrieves the homework and exam scores for pStudent from the text fields and writes the results to the Student record
     * in the Roster.
     *
     * PSEUDOCODE:
     * For i = 0 to CourseConstants.NUM_HOMEWORKS - 1 Do
     *     String hwstr = mHomeworkText[i].getText()
     *     int hw = convert hwstr to an int (Hint: Integer.parseInt())
     *     Call pStudent.setHomework(i, hw)
     * End For
     * Write another for loop similar to the one above to save the exam scores
     */
    ???

}
