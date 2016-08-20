import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		int response = 1;
		do {
			System.out.println("1 - See the list of countries" + "\n" + "2 - Add a country" + "\n" + "3 - Exit");

			int choice = scan.nextInt();

			if (choice == 1) {
				// print list of countries

				CountriesTextFile listOfCountries = new CountriesTextFile();
				listOfCountries.readCountries();
				
			}

				if (choice == 2) {
					System.out.print("Enter country: ");
					String addition = scan.next();
					 CountriesTextFile listOfCountries = new
					 CountriesTextFile();
					listOfCountries.addCountry(addition);

					System.out.println("The country has been saved!");
					// add a country
				}

			} while (response != 3);
		System.out.println("Buh-bye!");
	}
}