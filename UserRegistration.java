/**
 * 
 */
package RegexProblem;
import java.security.ProviderException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author RUSHIKESH BHOSLE
 *
 */
public class UserRegistration 
{
	/**
	 * @purpose:Checking enter valid first name
	 * @return: boolean true or false
	 */
	
    public static boolean checkValidFirstUserName(String firstName) throws ProviderException
	{
        boolean isFirstName;
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(firstNameRegex);
		if (firstName == null)
		{
			  
		          throw new ProviderException("Invalid first name.");
		       
		}
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();

		 System.out.println(isFirstName);
		 return matcher.matches();
    }
    
        public static void main(String[] args)  throws ProviderException
	{
		// TODO Calling the method
		checkValidFirstUserName("45875884");
		 
	}

}
