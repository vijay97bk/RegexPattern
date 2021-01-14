import java.util.regex.*;
public class UserRegistration {
public static void main(String[] args) {

       Pattern FirstName = Pattern.compile("^[[:upper:]]{1}[[:lower:]]{3,}$'");
	Matcher match = FirstName.matcher("Aks"); 
	boolean Result1= match.matches();  
	System.out.println("Result1 will be match");
}
}
