package homework_4;
import java.util.Scanner;

public class LoginPassword {
    public static final String PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_).{1,20}";
    public static boolean LOG = false;
    public static boolean PASS = false;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String login = scan.nextLine();
        String pasword = scan.nextLine();
        String repasword = scan.nextLine();

        try {
            valLogin(login);
            valPas(pasword, repasword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(LOG + " " + PASS);
    }
    private static void valLogin(String login) throws WrongLoginException {
        if (!login.matches(PATTERN)) {
            throw new WrongLoginException("not valid");
        } else LOG = true;
    }
    private static void valPas(String pass, String repass) throws WrongPasswordException {
        if (!pass.matches(PATTERN)) {
            throw new WrongPasswordException("does not meet the requirements");
        } else if (!pass.equals(repass)) {
            throw new WrongPasswordException("don't matches");
        } else PASS = true;
    }
}