import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * TODO A simple class that needs to be localized
 * 
 * @author mohan. Created Mar 27, 2011.
 */
public class PrintBalance {

	private static Scanner scanInput;

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Locale currentLocale;
		ResourceBundle messages;
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		scanInput = new Scanner(System.in);
		Date today = new Date(0);

		// Greeting
		System.out.println(greeting(messages));

		// Get User's Name
		System.out.println(getName(messages));
		String name = scanInput.nextLine();
		System.out.println(meet(messages, name));

		// print today's date, balance and bid goodbye
		System.out.println(showDate(today, currentLocale, messages));
		System.out.println(showBalance(messages, currentLocale, 9876543.21));
		System.out.println(goodbye(messages));
	}

	static String meet(ResourceBundle messages, String name) {
		return messages.getString("meet") + " " + name;
	}

	static String goodbye(ResourceBundle messages) {
		return messages.getString("bye");
	}

	static String showBalance(ResourceBundle messages, Locale locale,
			double amount) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return messages.getString("owe") + " " + nf.format(amount);
	}

	static String showDate(Date today, Locale locale, ResourceBundle messages) {
		DateFormat dt = DateFormat.getDateTimeInstance(0, 0, locale);
		return messages.getString("Asof") + " " + dt.format(today);
	}

	static String greeting(ResourceBundle messages) {
		return messages.getString("greeting");
	}

	static String getName(ResourceBundle messages) {
		return messages.getString("getName");
	}
}
