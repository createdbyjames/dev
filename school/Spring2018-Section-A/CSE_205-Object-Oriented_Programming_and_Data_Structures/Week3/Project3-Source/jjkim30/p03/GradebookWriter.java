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
import java.io.PrintWriter;

/**
 * GradebookWriter inherits from PrintWriter and writes the gradebook info to the file name passed to the ctor.
 */
public class GradebookWriter extends PrintWriter {

    /**
     * GradebookWriter()
     * ✅ Call the super class ctor that takes a String.
     */
    public GradebookWriter(String fileName) throws FileNotFoundException {

        // Call the super class constructor
        super(fileName);
    }

    /**
     * writeGradebook()
     * Writes the gradebook info to the file, which was opened in the ctor.
     */
    public void writeGradebook(Roster roster) {

        for (Student student : roster.getStudentList()) {
            println(student);
        }
        close();
    }
}
