
import java.util.regex.Pattern;

public class Ws2Part5_StudentDemo {

    public static void main(String[] args) {

        // Pattern
        Pattern codePattern = Pattern.compile("^SE\\d{6}$");
        Pattern genderPattern = Pattern.compile("^\\s*[0-1]\\s*$");
        Pattern phonePattern = Pattern.compile("^\\d{10,12}$");
        Pattern emailPattern = Pattern.compile("^\\w+(?:\\.\\w+)*@(?:\\w+\\.)+[a-zA-Z]{2,7}$");

        // Input
        System.out.println("Input Student's Information: ");
        String code = Ws2Part5_Validations.inputPattern("Enter code (SExxxxxx): ", codePattern);
        String name = Ws2Part5_Validations.inputNonBlankStr("Enter name: ");
        String gender = Ws2Part5_Validations.inputGender("Enter gender (0 - 1): ", genderPattern);
        String address = Ws2Part5_Validations.inputNonBlankStr("Enter address: ");
        String phone = Ws2Part5_Validations.inputPattern("Enter phone (10 to 12): ", phonePattern);
        String email = Ws2Part5_Validations.inputPattern("Enter email: ", emailPattern);

        // Output
        System.out.println("Student's Information: ");
        System.out.println(code + ", " + name + ", " + gender + ", " + address + ", " + phone + ", " + email);

    }
}
