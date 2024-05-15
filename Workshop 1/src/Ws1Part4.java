
import java.util.Scanner;

public class Ws1Part4 {
    public static void main(String[] args) { 
        Scanner sc1 = new Scanner(System.in);
        String name = null; 
        float grade = 0;
        
        // Input
        System.out.println("Input Student's Information: ");
        System.out.println("Enter name: ");
        name = sc1.nextLine();
        System.out.println("Enter grade: ");
        grade = sc1.nextFloat();
        
        // Process
        // Lowercase & split string "name" to array "nameArray"
        String[] nameArray = name.toLowerCase().split(" ");
        
        // Uppercase first character in each word
        for (int i = 0; i < nameArray.length; i++) {
            char[] c = nameArray[i].toCharArray();
            c[0] -= 32;
            nameArray[i] = new String(c);
        }
        
        // Join array back into string
        name = String.join(" ", nameArray);
        
        // Output
        System.out.println("Output Student's Information");
        System.out.println(name + ", " + grade);
        
    }
    
}
