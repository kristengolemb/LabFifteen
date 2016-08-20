import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CountriesTextFile {
	ArrayList<String> countriesList = new ArrayList<String>();

	public CountriesTextFile() {
	}

	public void addCountry(String addition) throws IOException {
		System.out.println(addition);
		Path countriesPath = Paths.get("countries.txt");
		File countriesFile = countriesPath.toFile();
			FileWriter out = new FileWriter(countriesFile, true);	
			PrintWriter outzoom = new PrintWriter(out);

			outzoom.println(addition);
			outzoom.close();

	}

	public String readCountries() throws IOException {
		Path countriesPath = Paths.get("countries.txt");
		File countriesFile = countriesPath.toFile();
		FileReader fileRdr = new FileReader(countriesFile);
		BufferedReader br = new BufferedReader(fileRdr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);

			line = br.readLine();
			
		}
		return line;
	}

}