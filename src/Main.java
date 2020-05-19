import data.Country;
import logic.CountriesOperator;
import logic.CountryReader;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Country> countriesData = CountryReader.readCountryDataFromFile("data.csv");
        CountriesOperator.runMenu(countriesData);
    }
}
