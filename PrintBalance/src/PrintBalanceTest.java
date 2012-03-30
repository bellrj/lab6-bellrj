import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;

public class PrintBalanceTest {

	@Test
	public void testMeetEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("I am pleased to meet you bob",
				PrintBalance.meet(messages, "bob"));
	}

	@Test
	public void testMeetGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Ich freue mich, Sie kennen zu lernen bob",
				PrintBalance.meet(messages, "bob"));
	}

	@Test
	public void testMeetFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Je suis heureux de vous rencontrer bob",
				PrintBalance.meet(messages, "bob"));
	}

	@Test
	public void testGoodbyeEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Good Bye", PrintBalance.goodbye(messages));
	}

	@Test
	public void testGoodbyeGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Auf Wiedersehen", PrintBalance.goodbye(messages));
	}

	@Test
	public void testGoobyeFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Au revoir", PrintBalance.goodbye(messages));
	}

	@Test
	public void testShowBalanceEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("You owe the school $9,876,543.21",
				PrintBalance.showBalance(messages, currentLocale, 9876543.21));
	}

	@Test
	public void testShowBalanceGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Sie schulden die Schule 9.876.543,21 €",
				PrintBalance.showBalance(messages, currentLocale, 9876543.21));
	}

	@Test
	public void testShowBalanceFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Vous devez l'école 9 876 543,21 €",
				PrintBalance.showBalance(messages, currentLocale, 9876543.21));
	}

	@Test
	public void testGreetingEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Hello World", PrintBalance.greeting(messages));
	}

	@Test
	public void testGreetingGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Hallo Welt", PrintBalance.greeting(messages));
	}

	@Test
	public void testGreetingFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Bonjour tout le monde",
				PrintBalance.greeting(messages));
	}

	@Test
	public void testGetNameEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Please enter your name",
				PrintBalance.getName(messages));
	}

	@Test
	public void testGetNameGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("Bitte geben Sie Ihren Namen",
				PrintBalance.getName(messages));
	}

	@Test
	public void testGetNameFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Assert.assertEquals("S'il vous plaît entrer votre nom",
				PrintBalance.getName(messages));
	}

	@Test
	public void testShowDateEnglish() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Date d = new Date(0);
		Assert.assertEquals(
				"As of : Wednesday, December 31, 1969 7:00:00 PM EST",
				PrintBalance.showDate(d, currentLocale, messages));
	}

	@Test
	public void testShowDateGerman() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Date d = new Date(0);
		Assert.assertEquals("Ab : Mittwoch, 31. Dezember 1969 19:00 Uhr EST",
				PrintBalance.showDate(d, currentLocale, messages));
	}

	@Test
	public void testShowDateFrench() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",
				currentLocale);
		Date d = new Date(0);
		Assert.assertEquals("As of : mercredi 31 décembre 1969 19 h 00 EST",
				PrintBalance.showDate(d, currentLocale, messages));
	}
}
