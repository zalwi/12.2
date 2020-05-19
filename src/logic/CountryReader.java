package logic;

import data.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountryReader {

    private CountryReader() {
    }

    public static Map<String, Country> readCountryDataFromFile(String fileName) {
        Map<String, Country> countries = new HashMap<>();
        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            String countryCode = null;
            String description = null;
            int population = 0;

            while ((nextLine = reader.readLine()) != null) {
                String[] lineValues = nextLine.split(";");
                countryCode = lineValues[0];
                description = lineValues[1];
                population = Integer.parseInt(lineValues[2]);
                countries.put(countryCode, new Country(countryCode, description, population));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }
}
