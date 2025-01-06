import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Using try-with-resources to ensure that resources are automatically closed
        try (
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
        ) {
            String line;
            
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Split the line into an array based on spaces
                String[] data = line.split(" ");
                
                // Check if the data has the correct format (4 values per line)
                if (data.length == 4) {
                    String name = data[0];
                    int marks = Integer.parseInt(data[1]);
                    float percentage = Float.parseFloat(data[2]);
                    String grade = data[3];  // Use String for grade (e.g., A+, B, etc.)

                    // Write the formatted data to the output file
                    writer.write("Name: " + name);
                    writer.newLine();  // Move to the next line
                    writer.write("Marks: " + marks);
                    writer.newLine();
                    writer.write("Percentage: " + percentage);
                    writer.newLine();
                    writer.write("Grade: " + grade);  // Write the grade as a string
                    writer.newLine();
                    writer.write("----------------------");
                    writer.newLine();
                } else {
                    writer.write("Invalid data format in line: " + line);
                    writer.newLine();
                }
            }

            System.out.println("File handling complete!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
