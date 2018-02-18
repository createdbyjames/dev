/**
 * CSE 205
 * CSE205 Object Oriented Programming and Data Structures
 * Project Number: 3
 *
 * Author: James J. Kim
 * jjkim30@asu.edu
 */

package p03;

import com.sun.org.glassfish.external.statistics.CountStatistic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The View class implements the GUI.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 250;

    // Declare instance variables
    private JButton _clearButton;
    private JTextField _examText[];
    private JButton _exitButton;
    private JTextField _homeworkText[];
    private Main _main;
    private JButton _saveButton;
    private JButton _searchButton;
    private JTextField _searchText;
    private Student _student;

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     */
    public View(Main pMain) {

        // Save a reference to the Main object pMain in mMain.
        _main = pMain;

        /**
         * Creating the search textfield along with button
         * Adding to the panel
         */
        JPanel panelSearch = new JPanel();
        panelSearch.setLayout(new FlowLayout());

        JLabel studentNameLabel = new JLabel("Student Name: ");
        panelSearch.add(studentNameLabel);

        _searchText  = new JTextField(20);
        panelSearch.add(_searchText);

        _searchButton = new JButton("Search");
        _searchButton.addActionListener((ActionListener) this);
        panelSearch.add(_searchButton);

        /**
         * Creating the homework text label along with the homework text field to display the scores
         */
        JPanel panelHomework = new JPanel();
        panelHomework.setLayout(new FlowLayout());

        JLabel homeworkLabel = new JLabel("Homework: ");
        panelHomework.add(homeworkLabel);

        // Creating an array with the text field objects for each of the homework scores.
        _homeworkText = new JTextField[CourseConstants.NUM_HOMEWORKS];
        for (int i = 0; i < CourseConstants.NUM_HOMEWORKS; i++) {
            _homeworkText[i] = new JTextField(5);
            panelHomework.add(_homeworkText[i]);
        }

        /**
         * Creating the exam text label along with the exam text field to display the scores
         */
        JPanel panelExam = new JPanel();
        panelExam.setLayout(new FlowLayout());

        JLabel examLabel = new JLabel("Exam: ");
        panelExam.add(examLabel);

        // Creating an array with the text field objects for each of the test scores.
        _examText = new JTextField[CourseConstants.NUM_EXAMS];
        for (int i = 0; i < CourseConstants.NUM_EXAMS; i++) {
            _examText[i] = new JTextField(5);
            panelExam.add(_examText[i]);
        }


        // Creating additional buttons to display on the screen.
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new FlowLayout());

        _clearButton = new JButton("Clear");
        _clearButton.addActionListener((ActionListener) this);
        panelButtons.add(_clearButton)
;
        _saveButton = new JButton("Save");
        _saveButton.addActionListener((ActionListener) this);
        panelButtons.add(_saveButton);

        _exitButton = new JButton("Exit");
        _exitButton.addActionListener((ActionListener) this);
        panelButtons.add(_exitButton);

        // Adding all the components to the main panel
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(panelSearch);
        panelMain.add(panelHomework);
        panelMain.add(panelExam);
        panelMain.add(panelButtons);

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
     */
     public void actionPerformed(ActionEvent event) {

         if (event.getSource() == _searchButton) {
             String lastName = _searchText.getText();

             // DEBUG
             System.out.println("Searching for " + lastName);

             if (lastName == "") {
                 messageBox("Please enter the student's last name.");
             } else {
                 _student = _main.search(lastName);

                 if (_student == null) {
                     messageBox("Student not found. Try again.");
                 } else {
                     displayStudent(_student);
                 }
             }
         } else if (event.getSource() == _saveButton) {
             if (_student != null) {
                 saveStudent(_student);
             }
         } else if (event.getSource() == _clearButton) {
             clear();
         } else {
             if (_student != null) {
                 saveStudent(_student);
             }

             _main.exit();
         }
     }

    /**
     * clear()
     *
     * Called when the Clear button is clicked. Clears all of the text fields by setting the contents to the empty string.
     * After clear() returns, no student information is being edited or displayed.
     */
    private void clear() {
        _searchText.setText("");
        for (int i = 0; i < CourseConstants.NUM_HOMEWORKS; i++) {
            _homeworkText[i].setText("");
        }

        for (int i = 0; i < CourseConstants.NUM_EXAMS; i++) {
            _examText[i].setText("");
        }

        _student = null;
    }

    /**
     * displayStudent()
     */
    private void displayStudent(Student student) {

        for (int i = 0; i < CourseConstants.NUM_HOMEWORKS; i++) {
            int hw = student.getHomework(i);

            String homeworkString = Integer.toString(hw);
            _homeworkText[i].setText(homeworkString);
        }

        for (int i = 0; i < CourseConstants.NUM_EXAMS; i++) {
            int exam = student.getExam(i);

            String examString = Integer.toString(exam);
            _examText[i].setText(examString);
        }
    }

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
     */
     private void saveStudent(Student student) {

         for (int i = 0; i < CourseConstants.NUM_HOMEWORKS; i++) {
             String homeworkStr = _homeworkText[i].getText();
             int homeworkScore = Integer.parseInt(homeworkStr);
             _student.setHomework(i, homeworkScore);
         }

         for (int i = 0; i < CourseConstants.NUM_EXAMS; i++) {
             String examStr = _examText[i].getText();
             int examScore = Integer.parseInt(examStr);
             _student.setExam(i, examScore);
         }
     }
}
