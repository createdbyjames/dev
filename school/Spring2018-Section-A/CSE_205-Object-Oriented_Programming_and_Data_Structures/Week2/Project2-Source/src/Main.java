//**************************************************************************************************************
// CLASS: Main
//
// DESCRIPTION
// The Main class for Project 2.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************************
import java.awt.print.PrinterAbortException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     *  Instantiate a Main object and call run() on the object.
     */
    public static void main(String[] args) throws IOException{
        Main myMain = new Main();
        myMain.run();
    }

    /**
     * Calculates the tuition for each student. Write an enhanced for loop that iterates over each Student in
     * pStudentList. For each Student, call calcTuition() on that Student. Note: this is a polymorphic method
     * call.
     */
    private void calcTuition(ArrayList<Student> pStudentList) {
        for (Student student : pStudentList) {
            student.calcTuition();
        }
    }

    /**
     * Reads the student information from "p02-students.txt" and returns the list of students as an ArrayList
     * <Student> object.
     */
    private ArrayList<Student> readFile() throws FileNotFoundException {

        ArrayList<Student> studentList = new ArrayList<>();

        try {
            // Open the file - we could also use the args to pass in the absolute path to the file using CLI but we will hardcoded here for convenience factor
            File file = new File("/Volumes/Source/CreatedByJames/school/Spring2018-Section-A/CSE_205-Object-Oriented_Programming_and_Data_Structures/Week2/Project2-Source/src/p02-students.txt");

            Scanner readFile = new Scanner(file);
            while (readFile.hasNext()) {
                String studentType = readFile.next();
                if (studentType.equals("C")) {
                    studentList.add(readOnCampusStudent(readFile));
                } else {
                    studentList.add(readOnlineStudent(readFile));
                }
            }

            readFile.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Sorry, could not open 'p02-students.txt' for reading. Stopping.");
            System.exit(-1);
        }

        return studentList;
    }

    /**
     * Reads the information for an on-campus student.
     */
    private OnCampusStudent readOnCampusStudent(Scanner pIn) {
        // Student ID
        String id = pIn.next();

        // Student Last Name
        String lastName = pIn.next();

        // Student First Name
        String firstName = pIn.next();

        // Instantiate a OnCampusStudent Object
        OnCampusStudent oncampusStudent = new OnCampusStudent(id, lastName, firstName);

        // Residence or Non-Residence
        String residenceStatus = pIn.next();

        // A program fee, which may be zero
        Double fee = pIn.nextDouble();

        // The number of credit hours for which the student is enrolled
        int credits = pIn.nextInt();

        if (residenceStatus.equals("R")) {
            oncampusStudent.setResidency(true);
        } else {
            oncampusStudent.setResidency(false);
        }

        oncampusStudent.setProgramFee(fee);
        oncampusStudent.setCredit(credits);

        return oncampusStudent;
    }

    /**
     * Reads the information for an online student.
     */
    private OnlineStudent readOnlineStudent(Scanner pIn) {

        // Student ID
        String id = pIn.next();

        // Student Last Name
        String lastName = pIn.next();

        // Student First Name
        String firstName = pIn.next();

        // Instantiate an online student object
        OnlineStudent onlineStudent = new OnlineStudent(id, firstName, lastName);

        // A program fee, which may be zero
        String fee = pIn.next();

        // Get credits
        int credits = pIn.nextInt();

        if (fee.equals("T")) {
            onlineStudent.setTechFee(true);
        } else {
            onlineStudent.setTechFee(false);
        }

        onlineStudent.setCredit(credits);

        return onlineStudent;
    }

    /**
     *  Calls other methods to implement the sw requirements.
     */
    private void run() throws FileNotFoundException{
        ArrayList<Student> studentList = new ArrayList<>();

        try {
            // Read the contents of the file
            studentList = readFile();

            // Calculate the tuition for each student
            calcTuition(studentList);

            // Sort the list
            Sorter.insertionSort(studentList, Sorter.SORT_ASCENDING);

            // Write out the sorted list
            writeFile(studentList);

        } catch (FileNotFoundException exception) {
            System.out.println("Sorry, could not open 'p02-students.txt' for reading. Stopping.");
            System.exit(-1);
        }
    }

    /**
     *  Writes the output file to "p02-tuition.txt" per the software requirements.
     */
    private void writeFile(ArrayList<Student> pStudentList) throws FileNotFoundException {

        File outputFile = new File("p02-tuition.txt");
        PrintWriter output = new PrintWriter(outputFile);

        for (Student student : pStudentList) {
            output.print(student.getId() + " " + student.getLastName() + " " + student.getFirstName() + " ");
            output.printf("%.2f%n", student.getTuition());
        }

        output.close();
    }
}
