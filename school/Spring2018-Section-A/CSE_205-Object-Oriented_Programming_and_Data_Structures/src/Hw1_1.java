import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Hw1_1 {


    public void writeFile(String fileName, String content) {

    }

    public void file(String fileName) throws FileNotFoundException{

        // Store the contents of the file including the formatted
        String formattedContent = "";

        // Instantiate a scanner object to read in the file
        Scanner readScanner = new Scanner(new File(fileName));

        // Prepare the output file
        File outputFile = new File(fileName + ".txt");

        // Create a PrintWriter object
        PrintWriter writer = new PrintWriter(outputFile);

        // Counter to hold the line number
        int counter = 1;

        // Read through the entire content til the end
        while (readScanner.hasNext()) {

            // read each line
            String line = readScanner.nextLine();

            writer.printf("[%03d] %s\n", counter, line);

            // DEBUG
            System.out.println(line);

            // Increment the counter to show the number
            counter++;
        }

        writer.close();
    }

    public String getFileName() {

        // Name of the file user provides
        String fileName = "";

        // Create a new scanner class to prompt the user for the file name
        Scanner userInput = new Scanner(System.in);

        // Prompt the user for the name of the input file
        System.out.print("Please provide the name of the Java source code file: ");
        fileName = userInput.nextLine();

        return fileName;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Hw1_1 hw1 = new Hw1_1();
        String fileName = hw1.getFileName();
        hw1.file(fileName);



    }
}
