
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ws2Part3 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("src/Ws2Part3_employee.txt"));
            sc.useDelimiter(";");
            
            while (sc.hasNext()) {
                String employeeLine = sc.nextLine(); 

                // Split the line into individual fields 
                String[] employeeData = employeeLine.split(sc.delimiter().pattern());

                for (int i = 0; i < employeeData.length; i++) {
                    System.out.print(employeeData[i] + ((i == employeeData.length - 1) ? "" : ", "));
                }
                System.out.println();
            }
            
        } catch(FileNotFoundException e) {
            System.err.println("Error: File 'employee.txt' not found.");
        }
    }
}
