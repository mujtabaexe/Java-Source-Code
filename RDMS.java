import java.io.*;
import java.util.*;

public class RDMS {

    public static void main(String[] args) {

        String names = "Names";
        String pf = "PF";
        String oop = "OOP";
        String dsa = "DSA";
        String percentage = "Percentage";
        String sti = "Sub To Improve";

        String fileName = "data.txt";
        int rows = countLines(fileName);
        int columns = 6;

        if (rows == 0) {
            System.out.printf("The file %s is empty.", fileName);
            return;
        }

        String[][] data = reading(fileName, rows, columns);

        System.out.printf("%-10s  |\t%-5s   |\t%-5s  |\t%-5s  |   %-6s   | %-3s|\n", names, pf, oop, dsa, percentage, sti);
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < rows; i++) {
            float[] scores = new float[3];

            for (int j = 1; j <= 3; j++) {
                try {
                    scores[j - 1] = Float.parseFloat(data[i][j]);
                    
                } catch (Exception e) {
                    System.err.printf("Invalid number for student '%s' in a column %d. setting to 0.\n", data[i][0],j);
                    scores[j-1]=0;
                }
            }

            double percent = percentage(scores);
            String stiToPrint = subjectToImprove(scores);

            System.out.printf("%-10s  |\t%-6.2f  |\t%-6.2f |\t%-6.2f |\t%.2f   | \t%-5s\t|\n", data[i][0], Float.parseFloat(data[i][1]), Float.parseFloat(data[i][2]), Float.parseFloat(data[i][3]), percent, stiToPrint);
            System.out.println("---------------------------------------------------------------------------------------");

        }
        update(fileName, data);
    }

    public static int countLines(String fileName) {
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lineCount++;
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return lineCount;
    }

    public static String[][] reading(String fileName, int rows, int columns) {
        String[][] data = new String[rows][columns];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String eachLine;
            int row = 0;

            while ((eachLine = br.readLine()) != null && row < rows) {
                String[] part = eachLine.split(",");

                for (int col = 0; col < part.length && col < columns; col++) {
                    if(part[col].trim().isEmpty()){
                        part[col]="0"; // Assign a default value (e.g., 0 for empty marks).
                    }
                    data[row][col] = part[col].trim();
                }
                row++;
            }

        } catch (Exception e) {
            System.out.println("There was a problem : " + e);

        }
        return data;
    }

    public static double percentage(float[] scores) {
        int total = 0;
        for (float score : scores) {
            total += score;
        }
        return (total / 300.0) * 100;
    }

    public static String subjectToImprove(float[] scores) {
        StringBuilder subjectsToImprove = new StringBuilder();
        if (scores[0] < 55.0) {
            subjectsToImprove.append("PF ");
        }
        if (scores[1] < 55.0) {
            subjectsToImprove.append("OOP ");
        }
        if (scores[2] < 55.0) {
            subjectsToImprove.append("DSA ");
        }
        return subjectsToImprove.length() > 0 ? subjectsToImprove.toString().trim() : "None";
    }

    public static void update(String fileName, String[][] data){
        
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Do you want to update any data (y/n): ");
            String choice = sc.nextLine().trim();

            if(choice.equalsIgnoreCase("n")){
                return;
            }
            else if(choice.equalsIgnoreCase("y")){
                System.out.print("Enter the student name for which you want to update the data: ");
                String studentName = sc.nextLine().trim();

                boolean studentFound= false;
                
                for (int i = 0; i <data.length; i++) {
                    if(data[i][0].equalsIgnoreCase(studentName)){
                        studentFound=true;
                        System.out.println("Student Found: "+studentName);
                        System.out.print("Which field you want to update? (1)Name (2)PF Marks (3)OOP Marks (4)DSA Marks: ");

                        int fieldChoice = sc.nextInt();
                        sc.nextLine();

                        switch (fieldChoice) {
                            case 1 -> {
                                System.out.println("Enter new Name: ");
                                String newName = sc.nextLine().trim();
                                if (!newName.isEmpty()){
                                    data[i][0]= newName;
                                }else{
                                    System.out.println("Name cannot be empty. Update Skipped.");
                                }
                            }
                            case 2 -> {
                                System.out.println("Enter the new PF score (0-100): ");
                                int pfScore = sc.nextInt();
                                if(pfScore>0 && pfScore<100.0){
                                    data[i][1]= String.valueOf(pfScore);
                                }
                                else{
                                    System.out.println("Invalid Score. Update Skipped.");
                                }
                            }
                            case 3 -> {
                                System.out.println("Enter the new OOP score (0-100): ");
                                int oopScore = sc.nextInt();
                                if (oopScore >= 0 && oopScore <= 100.0) { // CHANGE
                                    data[i][2] = String.valueOf(oopScore);
                                }else {
                                    System.out.println("Invalid score. Update skipped.");
                                }

                            }
                            case 4 -> {
                                System.out.println("Enter the new DSA score (0-100): ");
                                int dsaScore = sc.nextInt();
                                if (dsaScore >= 0 && dsaScore <= 100.0) { // CHANGE
                                    data[i][3] = String.valueOf(dsaScore);
                                } else {
                                    System.out.println("Invalid score. Update skipped.");
                                }
                            }
                            default -> {
                                System.out.println("Invalid Choice.");
                            }
                        }
                        writeToFile(fileName,data);
                        break;
                    }
                }
                if(!studentFound){
                    System.out.println("Student not found.");
                }
                
            }
            else{
                System.out.println("Invalid choice. Please Enter 'y' or 'n': ");
            }
            update(fileName, data);
        }

    public static void writeToFile(String fileName, String[][] data){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for(String[] row : data){
                writer.write(String.join(",",row));
                writer.newLine();
            }
            System.out.println("Data Updated Successfully");
        } catch (IOException e) {
            System.out.println("Error writing to the file."+ e.getMessage());
        }
    }
}